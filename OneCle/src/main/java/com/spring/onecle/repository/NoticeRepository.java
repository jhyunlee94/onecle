package com.spring.onecle.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.onecle.entity.Notice;

public interface NoticeRepository extends JpaRepository<Notice, Integer> {
	
}
