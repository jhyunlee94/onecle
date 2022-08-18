package com.spring.onecle.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.onecle.entity.Reply;

public interface ReplyRepository extends JpaRepository<Reply, Integer> {
	
}
