package com.spring.fuelplease.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.fuelplease.user.service.IUserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private IUserService sv;
	
	@GetMapping("/userLogin")//로그인 페이지 이동
	public void userLogin() {
		
	}
	
	@GetMapping("/userJoin")//회원 가입 페이지 이동
	public void userJoin() {
		
	}
}
