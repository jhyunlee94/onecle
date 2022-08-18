package com.spring.onecle.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.onecle.entity.Helpdesk;

public interface HelpdeskRepository extends JpaRepository<Helpdesk, Integer> {
	
}
