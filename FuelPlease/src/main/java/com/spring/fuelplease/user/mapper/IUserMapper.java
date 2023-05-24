package com.spring.fuelplease.user.mapper;

import com.spring.fuelplease.voCenter.UserVO;

public interface IUserMapper {

	//회원정보 얻어오기
	
	//로그인
	String userLogin(String id);
	//회원가입
	void userJoin(UserVO vo);
	
	//아이디 중복확인
	
	//회원정보 수정
}
