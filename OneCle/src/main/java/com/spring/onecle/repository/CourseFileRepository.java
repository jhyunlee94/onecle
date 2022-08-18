package com.spring.onecle.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.onecle.entity.CourseFile;
import com.spring.onecle.entity.CourseFileId;

public interface CourseFileRepository extends JpaRepository<CourseFile, CourseFileId> {
	
}
