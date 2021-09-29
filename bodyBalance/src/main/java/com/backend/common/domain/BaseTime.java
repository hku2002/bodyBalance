package com.backend.common.domain;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.Getter;

@Getter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class BaseTime {
	
	@CreatedDate
	@Column(name = "FIRST_REGISTER_TIME", updatable = false)
	private LocalDateTime firstRegisterTime;
	
	@CreatedDate
	@Column(name = "LAST_UPDATE_TIME", updatable = true)
	private LocalDateTime lastUpdateTime;
	
}
