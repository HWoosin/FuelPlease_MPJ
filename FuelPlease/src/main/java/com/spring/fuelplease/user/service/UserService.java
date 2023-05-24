package com.spring.fuelplease.user.service;

import org.springframework.stereotype.Service;

import com.spring.fuelplease.user.mapper.IUserMapper;
import com.spring.fuelplease.voCenter.UserVO;

@Service
public class UserService implements IUserService {

	private IUserMapper mp;
	
	@Override
	public void userJoin(UserVO vo) {
		
		
	}

	@Override
	public String userLogin(String id, String pw) {
		// TODO Auto-generated method stub
		return null;
	}

}
