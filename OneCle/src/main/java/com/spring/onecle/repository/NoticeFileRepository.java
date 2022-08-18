package com.spring.onecle.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.onecle.entity.NoticeFile;
import com.spring.onecle.entity.NoticeFileId;

public interface NoticeFileRepository extends JpaRepository<NoticeFile, NoticeFileId> {
	
}
