package com.huazi.mybatis.dao;

import java.util.List;

import com.huazi.mybatis.vo.Order;
import com.huazi.mybatis.vo.User;

public interface OrderUserMapper {

	public User findUserById(int uid);
	public List<User> findUserBySexAndName(User user);
	public List<Order> findOrderDetail();
	public List<Order> findOrder();


}
