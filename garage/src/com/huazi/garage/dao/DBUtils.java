package com.huazi.garage.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.huazi.garage.vo.Garage;
import com.huazi.garage.vo.GarageShopCart;
import com.huazi.garage.vo.User;

public class DBUtils {

	public static Connection getConn() {
		try {
			Class.forName(DBinfo.DRIVER);
			Connection conn = DriverManager.getConnection(DBinfo.URL, DBinfo.USERNAME, DBinfo.PASSWORD);
			return conn;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static void close(Connection conn,PreparedStatement ps,ResultSet rs) {
		try {
			if(null != rs) {
				rs.close();
			}
			if(null != ps) {
				ps.close();
			}
			if(null != conn && !conn.isClosed()) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static List<User> findUser(String sql) {
		ResultSet rs = null;
		PreparedStatement ps = null;
		List<User> users = new ArrayList<User>();
		Connection conn = DBUtils.getConn();
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				User user = new User();
				user.setUid(rs.getInt("uid"));
				user.setUname(rs.getString("uname"));
				user.setPassword(rs.getString("password"));
				user.setSex(rs.getString("sex"));
				user.setIdentity(rs.getInt("identity"));
				user.setPname(rs.getString("pname"));
				
				users.add(user);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(conn,ps,rs);
		}
		return users;
	}
	
	public static int updateTable(String sql) {
		int updateRows = 0;
		PreparedStatement ps = null;
		Connection conn = DBUtils.getConn();
		try {
			ps = conn.prepareStatement(sql);
			updateRows = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(conn,ps,null);
		}
		return updateRows;
	}
	
	public static List<Garage> findGarage(String sql) {
		ResultSet rs = null;
		PreparedStatement ps = null;
		List<Garage> garages = new ArrayList<Garage>();
		Connection conn = DBUtils.getConn();
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				Garage garage=new Garage();
				garage.setGid(rs.getInt("gid"));
				garage.setDetails(rs.getString("details"));
				garage.setGname(rs.getString("gname"));
				garage.setYieldly(rs.getString("yieldly"));
				garage.setCost(rs.getDouble("cost"));
				garage.setSrc(rs.getString("src"));
				
				garages.add(garage);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(conn,ps,rs);
		}
		return garages;
	}
	
	public static boolean findShopcart(String sql) {
		boolean isExist = false;
		ResultSet rs = null;
		PreparedStatement ps = null;
		Connection conn = DBUtils.getConn();
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			isExist = rs.next();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(conn,ps,rs);
		}
		return isExist;
	}
	
	public static List<GarageShopCart> findGarageShopcart(String sql) {
		ResultSet rs = null;
		PreparedStatement ps = null;
		List<GarageShopCart> garageshopcarts = new ArrayList<GarageShopCart>();
		Connection conn = DBUtils.getConn();
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				GarageShopCart garageshopcart=new GarageShopCart();
				garageshopcart.setGid(rs.getInt("gid"));
				garageshopcart.setDetails(rs.getString("details"));
				garageshopcart.setGname(rs.getString("gname"));
				garageshopcart.setYieldly(rs.getString("yieldly"));
				garageshopcart.setCost(rs.getDouble("cost"));
				garageshopcart.setSrc(rs.getString("src"));
				garageshopcart.setNum(rs.getInt("num"));
				garageshopcarts.add(garageshopcart);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(conn,ps,rs);
		}
		return garageshopcarts;
	}
	
}
