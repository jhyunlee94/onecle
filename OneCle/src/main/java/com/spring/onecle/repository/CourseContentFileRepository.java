package com.spring.onecle.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.onecle.entity.CourseContentFile;
import com.spring.onecle.entity.CourseContentFileId;

public interface CourseContentFileRepository extends JpaRepository<CourseContentFile, CourseContentFileId> {
	
}
