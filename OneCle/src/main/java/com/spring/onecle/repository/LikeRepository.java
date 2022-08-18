package com.spring.onecle.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.onecle.entity.Like;
import com.spring.onecle.entity.LikeId;

public interface LikeRepository extends JpaRepository<Like, LikeId> {
	
}
