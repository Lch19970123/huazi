package com.huazi.ssm.service;

import java.util.List;

import com.huazi.ssm.vo.User;

public interface UserService {

	public List<User> findUser();
	
	public User findUserById(int uid);
	
	public int insertUser(User user);
	
	public int deleteUser(int uid);

	public boolean findUserByName(String username);
}
