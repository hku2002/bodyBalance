package com.backend.menu.domain;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import com.backend.common.domain.BaseTime;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@Entity
@Table(name = "TB_MENU")
public class Menu extends BaseTime {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "IDX")
	private int idx;
	
	@Column(name = "MEAL_TYPE_CODE")
	private String mealTypeCode;
	
	@Column(name = "DATE")
	private Date date; 
	
	@Column(name = "MENU_TITLE")
	private String menuTitle;
	
	@Lob
	@Column(name = "MENU_CONTENT")
	private String menuContent;
	
}
