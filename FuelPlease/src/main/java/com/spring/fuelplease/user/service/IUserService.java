package com.spring.fuelplease.user.service;

import com.spring.fuelplease.voCenter.UserVO;

public interface IUserService {

	//회원정보 얻어오기
	UserVO getInfo(String id);
	
	//로그인
	String login(String id, String pw);
	
	//회원가입
	void userjoin(UserVO vo);
		
	//아이디 중복확인
	int idCheck(String id);
	
	//회원정보 수정
	void updateUser(UserVO vo);
}
