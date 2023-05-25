package com.spring.fuelplease.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.spring.fuelplease.user.service.IUserService;
import com.spring.fuelplease.voCenter.UserVO;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/user")
@Slf4j
public class UserController {

	@Autowired
	private IUserService sv;
	
	@GetMapping("/userLogin")//로그인 페이지 이동
	public void loginPage() {
		
	}
	
	@GetMapping("/userJoin")//회원 가입 페이지 이동
	public void join() {
		
	}
	
	@PostMapping("/userJoin")
	public String join(UserVO vo) {
		sv.userJoin(vo);
		return "redirect:/home";
	}
	
	@PostMapping("/idCheck")
	@ResponseBody
	public int idCheck(@RequestBody String id) {
		log.info("사용자가 입력한 아이디: "+id);
		if(sv.idCheck(id)==1) {
			return 1;
		}
		else return 0;
	}
	
}
