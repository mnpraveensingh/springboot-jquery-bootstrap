package com.mind.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mind.model.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {

}
