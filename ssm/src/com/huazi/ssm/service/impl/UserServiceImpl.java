package com.huazi.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.huazi.ssm.dao.UserMapper;
import com.huazi.ssm.service.UserService;
import com.huazi.ssm.vo.User;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper userMapper;

	@Override
	public List<User> findUser() {
		return userMapper.findUser();
	}

	@Override
	public User findUserById(int uid) {
		return userMapper.findUserById(uid);
	}

	@Override
	public int insertUser(User user) {
		return userMapper.insertUser(user);
	}

	@Override
	public int deleteUser(int uid) {
		return userMapper.deleteUser(uid);
	}

	@Override
	public boolean findUserByName(String uname) {
		
		return null !=userMapper.findUserByName(uname);
	}

}
