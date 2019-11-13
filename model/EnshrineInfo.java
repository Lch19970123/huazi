package com.byzx.model;

public class EnshrineInfo {

	private Integer warehous_id;		//鍏ュ簱id
	private String warehous_name;	//鐗╁搧鍚嶇О
	private String classes;			//绫诲埆
	private int weight;				//閲嶉噺
	private int s_usid;				//鍒嗘嫞鍛榠d
	private String collect;			//鍏ュ簱鏃堕棿
	private String remark;			//澶囨敞	
	private int state;				//鐘舵��
	private int opt_id;				//鎿嶄綔浜哄憳
	private int delflag;			//鍒犻櫎鏍囪
	
	public Integer getWarehous_id() {
		return warehous_id;
	}
	public void setWarehous_id(Integer warehous_id) {
		this.warehous_id = warehous_id;
	}
	public int getDelflag() {
		return delflag;
	}
	public void setDelflag(int delflag) {
		this.delflag = delflag;
	}
	
	public String getWarehous_name() {
		return warehous_name;
	}
	public void setWarehous_name(String warehous_name) {
		this.warehous_name = warehous_name;
	}
	public String getClasses() {
		return classes;
	}
	public void setClasses(String classes) {
		this.classes = classes;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getS_usid() {
		return s_usid;
	}
	public void setS_usid(int s_usid) {
		this.s_usid = s_usid;
	}
	public String getCollect() {
		return collect;
	}
	public void setCollect(String collect) {
		this.collect = collect;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public int getOpt_id() {
		return opt_id;
	}
	public void setOpt_id(int opt_id) {
		this.opt_id = opt_id;
	}

}
