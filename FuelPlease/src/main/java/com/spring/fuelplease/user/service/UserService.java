package com.spring.fuelplease.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.fuelplease.user.mapper.IUserMapper;
import com.spring.fuelplease.voCenter.UserVO;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UserService implements IUserService {
	
	@Autowired
	private IUserMapper mapper;

	@Override
	public void userjoin(UserVO vo) {		
		
	}

	@Override
	public UserVO getInfo(String id) {
		return mapper.getInfo(id);
	}

	@Override
	public String login(String id, String pw) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int idCheck(String id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void updateUser(UserVO vo) {
		// TODO Auto-generated method stub
		
	}

}
