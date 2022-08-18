package com.spring.onecle.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.onecle.entity.Guide;

public interface GuideRepository extends JpaRepository<Guide, Integer> {
	
}
