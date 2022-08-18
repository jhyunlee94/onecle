package com.spring.onecle.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class NoticeFileId implements Serializable {
	private int noticeFileIdx;
	private int notice;
}
