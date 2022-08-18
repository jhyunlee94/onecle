package com.spring.onecle.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class GuideFileId implements Serializable {
	private int guideFileIdx;
	private int guide;
}
