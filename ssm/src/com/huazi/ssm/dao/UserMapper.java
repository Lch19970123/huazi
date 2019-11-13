package com.huazi.ssm.dao;

import java.util.List;

import com.huazi.ssm.vo.User;

public interface UserMapper {

	public List<User> findUser();
	
	public User findUserById(int uid);
	
	public int insertUser(User user);
	
	public int deleteUser(int uid);
	public User findUserByName(String uname);
}
