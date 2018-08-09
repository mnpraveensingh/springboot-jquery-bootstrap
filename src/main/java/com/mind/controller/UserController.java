package com.mind.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mind.model.User;
import com.mind.repository.UserRepo;

@Controller
public class UserController {
	
	@Autowired
	private UserRepo userRepo;
	
	@GetMapping("/")
	public String home(Model model , @RequestParam(defaultValue = "0") int page) {
		model.addAttribute("data", userRepo.findAll(new PageRequest(page , 10)));
		model.addAttribute("currentPage", page);
		return "home";		
	}
	
	@PostMapping("/save")
	public String save(User user) {
		userRepo.save(user);
		return "redirect:/";
	}
	
	@GetMapping("/delete")
	public String delete(Integer id) {
		userRepo.delete(id);
		return "redirect:/";
	}
	
	@GetMapping("/findOne")
	@ResponseBody
	public User findOne(Integer id) {
		
		return userRepo.findOne(id);
	}

}
