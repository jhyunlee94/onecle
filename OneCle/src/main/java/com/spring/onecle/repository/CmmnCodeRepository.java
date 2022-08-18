package com.spring.onecle.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.onecle.entity.CmmnCode;

public interface CmmnCodeRepository extends JpaRepository<CmmnCode, String> {
	
}
