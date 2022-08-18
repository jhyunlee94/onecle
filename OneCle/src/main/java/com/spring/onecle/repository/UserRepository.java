package com.spring.onecle.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.onecle.entity.User;

public interface UserRepository extends JpaRepository<User, String> {
	
}
