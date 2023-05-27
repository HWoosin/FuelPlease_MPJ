package com.spring.fuelplease.controller;

import javax.sql.rowset.serial.SerialArray;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.fuelplease.user.service.IUserService;


@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private IUserService service;

	// 마이페이지 이동 요청
	@GetMapping("/userMypage")
	public void userMypage() {
		
//		String id = (String) session.getAttribute("login");
//		model.addAttribute("userInfo", service.getInfo(id));
	}
	
	
}
