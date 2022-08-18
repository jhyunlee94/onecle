package com.spring.onecle.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class CourseFileId implements Serializable {
	private int courseFileIdx;
	private int course;
}
