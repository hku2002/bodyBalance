package com.backend.menu.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class MenuInsertRequestDto {
	
	private int memberNumber;		// 회원번호
	private String mealTypeCode;	// 식사종류코드
	private String date;			// 날짜
	private String menuTitle;		// 식단명
	private String menuContent;		// 식단내용
	
}
