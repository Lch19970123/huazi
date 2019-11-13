package com.huazi.mybatis.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import com.huazi.mybatis.dao.OrderUserMapper;
import com.huazi.mybatis.vo.Order;
import com.huazi.mybatis.vo.User;

public class UserMapperTest {
	
	private SqlSessionFactory ssf;
	@Before
	public void setup() throws IOException {
		InputStream is=Resources.getResourceAsStream("SqlConfing.xml");
		ssf=new SqlSessionFactoryBuilder().build(is);
	}
	@Test
	public void testfindUserById() {
		SqlSession sqlSession = ssf.openSession();
		OrderUserMapper userMapper = sqlSession.getMapper(OrderUserMapper.class);
		User user =  userMapper.findUserById(1);
		System.out.println(user);
		
	}
	
	@Test
	public void testfindUserBy() {
		SqlSession sqlSession = ssf.openSession();
		OrderUserMapper userMapper = sqlSession.getMapper(OrderUserMapper.class);
		User use=new User();
		use.setUsername("花子");
		List<User> users =userMapper.findUserBySexAndName(use);
		for(User user:users) {
			System.out.println(user);
		}
	}
	@Test
	public void testfindOrder() {
		SqlSession sqlSession = ssf.openSession();
		OrderUserMapper userMapper = sqlSession.getMapper(OrderUserMapper.class);
		List<Order> orders =   userMapper.findOrder();
		
			System.out.println(orders);
		
	}
	
}

