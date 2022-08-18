package com.spring.onecle.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.onecle.entity.Course;
import org.springframework.data.jpa.repository.Query;

public interface CourseRepository extends JpaRepository<Course, Integer> {

}

