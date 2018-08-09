package com.mind;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mind.model.User;
import com.mind.repository.UserRepo;

@SpringBootApplication
public class PaginationApplication implements CommandLineRunner {
	@Autowired
	UserRepo userRepo;

	public static void main(String[] args) {
		SpringApplication.run(PaginationApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		// 30 records
		
		userRepo.save(new User("Pravin", "Tarana"));
		userRepo.save(new User("Bittu", "Ujjain"));
		userRepo.save(new User("Chintu", "Manihari"));
		userRepo.save(new User("Piyush", "Indore"));
		userRepo.save(new User("Chirag", "Kanipura"));
		userRepo.save(new User("Usha", "Bihar"));
		userRepo.save(new User("Divya", "Mysore"));
		userRepo.save(new User("Milan", "Bangalore"));
		userRepo.save(new User("Shriniwas", "Andhra"));
		userRepo.save(new User("Harshit", "Kanpur"));
		userRepo.save(new User("Rohit", "Mathura"));
		userRepo.save(new User("Narendra", "Delhi"));
		userRepo.save(new User("Ravi", "Jharakhand"));
		userRepo.save(new User("Dhoni", "Ranchi"));
		userRepo.save(new User("Sudhir", "Patna"));
		userRepo.save(new User("Sumit", "Mithila"));
		userRepo.save(new User("Yogesh", "Satna"));
		userRepo.save(new User("Sachin", "Katni"));
		userRepo.save(new User("Aashish", "Bhopal"));
		userRepo.save(new User("Kunchu", "Vidisha"));
		userRepo.save(new User("Shankey", "Sagar"));
		userRepo.save(new User("Sumit", "Agara"));
		userRepo.save(new User("Bengali", "Kolkata"));
		userRepo.save(new User("Mantu", "Tripura"));
		userRepo.save(new User("Ammar", "Tamilnadu"));
		userRepo.save(new User("Cherlin", "Channai"));
		userRepo.save(new User("Veera", "Hyderabad"));
		userRepo.save(new User("Bharath", "Marathalli"));
		userRepo.save(new User("Abhi", "Banaras"));
		userRepo.save(new User("Akshay", "Bombay"));
	}
}
