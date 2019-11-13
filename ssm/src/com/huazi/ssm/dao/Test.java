package com.huazi.ssm.dao;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.huazi.ssm.vo.User;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("Spring.xml");
		UserMapper itemsMapper = (UserMapper)ac.getBean("userMapper");
		List<User> items = itemsMapper.findUser();
		for(User item: items) {
			System.out.println(item);
		}
	}
}
