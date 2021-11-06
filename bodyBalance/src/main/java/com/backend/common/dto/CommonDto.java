package com.backend.common.dto;

import java.util.Date;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class CommonDto {
	
	private Date firstRegisterTime;	// 최초등록일
	private Date fastUpdateTime;	// 최종수정일

}
