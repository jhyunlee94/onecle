package com.spring.onecle.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.onecle.entity.Courser;
import com.spring.onecle.entity.CourserId;

public interface CourserRepository extends JpaRepository<Courser, CourserId> {
	
}
