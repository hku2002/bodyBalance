package com.backend.menu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.backend.menu.domain.Menu;
import com.backend.menu.service.MenuServiceImpl;

@RestController
@RequestMapping(value = "/api/menus/")
public class MenuController {
	
	@Autowired
	private MenuServiceImpl menuService;
	
	/*
	 * 설명 : 메뉴 정보 목록을 가져오는 메소드
	 * 작성자 : hgHwang
	 */
	@RequestMapping(value = "/v1/member/{memberNumber}", method = RequestMethod.GET)
	public Menu getMenuInfo(@PathVariable int memberNumber) {
		Menu menu = new Menu();
		menu = menuService.getList(memberNumber);
		
		return menu;
		
	}
	
	
	
	
}
