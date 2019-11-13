package com.byzx.model;
/**@文件名: CarInfo.java
 * @类功能说明: 车辆信息实体
 * @作者: ChongYangYang
 * @Email: 1103222824@qq.com
 * @日期: 2019年10月30日下午4:34:06
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: ChongYangYang</li> 
 * 	 <li>日期: 2019年10月30日下午4:34:06</li> 
 *	 <li>内容: </li>
 * </pre>
 */
public class CarInfo {

	private Integer c_carid;
	private int c_number;
	private int d_id;
	private String c_buytime;
	private int c_capacity;
	private String c_state;
	private String c_location;
	private int delflag;
	private int opt_id;
	private String remark;
	
	
	public Integer getC_carid() {
		return c_carid;
	}
	public void setC_carid(Integer c_carid) {
		this.c_carid = c_carid;
	}
	public int getC_number() {
		return c_number;
	}
	public void setC_number(int c_number) {
		this.c_number = c_number;
	}
	public int getD_id() {
		return d_id;
	}
	public void setD_id(int d_id) {
		this.d_id = d_id;
	}
	public String getC_buytime() {
		return c_buytime;
	}
	public void setC_buytime(String c_buytime) {
		this.c_buytime = c_buytime;
	}
	public int getC_capacity() {
		return c_capacity;
	}
	public void setC_capacity(int c_capacity) {
		this.c_capacity = c_capacity;
	}

	public String getC_state() {
		return c_state;
	}
	public void setC_state(String c_state) {
		this.c_state = c_state;
	}
	public String getC_location() {
		return c_location;
	}
	public void setC_location(String c_location) {
		this.c_location = c_location;
	}
	public int getDelflag() {
		return delflag;
	}
	public void setDelflag(int delflag) {
		this.delflag = delflag;
	}
	public int getOpt_id() {
		return opt_id;
	}
	public void setOpt_id(int opt_id) {
		this.opt_id = opt_id;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	
}
