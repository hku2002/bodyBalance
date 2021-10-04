package com.backend.menu.service;

import org.springframework.stereotype.Service;

import com.backend.menu.domain.Menu;
import com.backend.menu.dto.MenuInsertRequestDto;

@Service
public class MenuServiceImpl {
	
	public Menu getOne(int idx) {
		Menu menu = new Menu();
		
		return menu;
	}
	
	public Menu getList(int memberNumber) {
		Menu menu = new Menu();
		
		return menu;
	}
	
	public Menu addOne(MenuInsertRequestDto dto) {
		Menu menu = new Menu();
		
		return menu;
	}
	
	public Menu setOne(MenuInsertRequestDto dto) {
		Menu menu = new Menu();
		
		return menu;
	}
	
}
