package com.huazi.garage.dao;

import java.util.List;

import com.huazi.garage.vo.Garage;
import com.huazi.garage.vo.GarageShopCart;
import com.huazi.garage.vo.User;

public class DBHelper {

	public User findUserByName(String uname){
		String sql = "select * from user where uname='" + uname + "'";
		List<User> users = DBUtils.findUser(sql);
		return users.size()==0?null:users.get(0);
	}
	
	public int updateTable(String nick, String uname, String password,String sex,String status) {
		User us=findUserByName(uname);
		if(null==us) {
			String sql = "insert into user(uname,password,pname,sex,identity) values('" + uname + "','" + password + "','" + nick+ "','" +sex + "','" + status + "')";
			int users = DBUtils.updateTable(sql);
			return users;
		}
		return 0;
	}
	public List<Garage> findAllGarage(){
		String sql = "select * from garage";
		return DBUtils.findGarage(sql);
	}
	
	public Garage findGarageById(int gid) {
		String sql = "select * from garage where gid= " + gid ;
		List<Garage> garages = DBUtils.findGarage(sql);
		return garages.size()==0?null:garages.get(0);
	}
	
	// 根据uid和bid查询shopcart
	public boolean isExistShopcart(int uid,int gid) {
		String sql = "select * from shopcar where uid=" + uid + " and gid=" + gid;
		return DBUtils.findShopcart(sql);
	}
	
	// 修改shopcart
	public int updateShopcart(int uid,int gid,int num) {
		String sql = "update shopcar set num=num+" + num + " where uid=" + uid + " and gid=" + gid;
		return DBUtils.updateTable(sql);
	}
	
	// 添加shopcart
	public int insertShopcart(int uid,int gid,int num) {
		String sql = "insert into shopcar values(" + uid + "," + gid + "," + num + ")";
		return DBUtils.updateTable(sql);
	}
	
	public static List<GarageShopCart> findGarageShopcart(int uid) {
		String sql1 = "select g.*,sc.num from garage g,shopcar sc where g.gid=sc.gid and sc.uid=" + uid;
		List<GarageShopCart> garageshopcarts = DBUtils.findGarageShopcart(sql1);
		return garageshopcarts;
	}
}
