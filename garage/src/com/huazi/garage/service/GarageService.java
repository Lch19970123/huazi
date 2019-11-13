package com.huazi.garage.service;

import java.util.List;

import com.huazi.garage.dao.DBHelper;
import com.huazi.garage.vo.Garage;
import com.huazi.garage.vo.GarageShopCart;
import com.huazi.garage.vo.User;

public class GarageService {

	DBHelper helper = new DBHelper();
	public User findUserByName(String uname){
		return helper.findUserByName(uname);
	}
	
	public boolean isRightUser(String uname, String password) {
		User user = findUserByName(uname);
		if(null == user || !user.getPassword().equals(password)) {
			return false;
		}
		return true;
	}
	
	public boolean isAdmin(String uname) {
		User user = findUserByName(uname);
		System.out.println("$$$$$$$" + user.getIdentity());
		if(null != user && user.getIdentity() == 1) {
			return true;
		}
		return false;
	}
	
	
	public boolean updateTable(String nick, String uname, String password,String sex,String status) {
		int num = helper.updateTable(nick, uname, password,sex,status);
		if(num==0) {
			return false;
		}
		return true;
	}
	
	public List<Garage> findAllGarage(){
		return helper.findAllGarage();
	}
	
	
	public Garage findgarageById(int bid) {
		return helper.findGarageById(bid);
	}
	
	public int updateShopcart(int uid,int gid,int num) {
		int updateRows = 0;
		if(helper.isExistShopcart(uid, gid)) {
			updateRows = helper.updateShopcart(uid, gid, num);
		}else {
			updateRows = helper.insertShopcart(uid, gid, num);
		}
		return updateRows;
	}

	public List<GarageShopCart> findGarageShopcart(int uid){
		return DBHelper.findGarageShopcart(uid);
	}
}
