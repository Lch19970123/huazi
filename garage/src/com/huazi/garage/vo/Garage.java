package com.huazi.garage.vo;

public class Garage {

	private int gid;
	private String gname;
	private double cost;
	private String yieldly;
	private String details;
	private String src;
	public String getSrc() {
		return src;
	}
	public void setSrc(String src) {
		this.src = src;
	}
	public int getGid() {
		return gid;
	}
	public void setGid(int gid) {
		this.gid = gid;
	}
	public String getGname() {
		return gname;
	}
	public void setGname(String gname) {
		this.gname = gname;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public String getYieldly() {
		return yieldly;
	}
	public void setYieldly(String yieldly) {
		this.yieldly = yieldly;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	@Override
	public String toString() {
		return "Garage [gid=" + gid + ", gname=" + gname + ", cost=" + cost + ", yieldly=" + yieldly + ", details="
				+ details + ", src=" + src + "]";
	}
	
}
