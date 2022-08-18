package com.spring.onecle.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.onecle.entity.GuideFile;
import com.spring.onecle.entity.GuideFileId;

public interface GuideFileRepository extends JpaRepository<GuideFile, GuideFileId> {
	
}
