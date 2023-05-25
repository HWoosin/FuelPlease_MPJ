package com.spring.fuelplease.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.fuelplease.user.mapper.IUserMapper;
import com.spring.fuelplease.voCenter.UserVO;

@Service
public class UserService implements IUserService {
	@Autowired
	private IUserMapper mp;
	
	@Override
	public void userJoin(UserVO vo) {
		mp.userJoin(vo);
		
	}

	@Override
	public String userLogin(String id, String pw) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int idCheck(String id) {
		return mp.idCheck(id);
	}

}
