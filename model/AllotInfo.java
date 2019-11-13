package com.byzx.model;
/**@文件名: AllotInfo.java
 * @类功能说明: 调拨信息实体
 * @作者: ChongYangYang
 * @Email: 1103222824@qq.com
 * @日期: 2019年10月30日下午4:45:43
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: ChongYangYang</li> 
 * 	 <li>日期: 2019年10月30日下午4:45:43</li> 
 *	 <li>内容: </li>
 * </pre>
 */
public class AllotInfo {

	private Integer a_aid;
	private Integer c_carid;
	private String a_time;
	private String a_depart;
	private String a_destination;
	private int delflag;
	private int opt_id;
	private String remark;
	
	
	public Integer getA_aid() {
		return a_aid;
	}
	public void setA_aid(Integer a_aid) {
		this.a_aid = a_aid;
	}
	public Integer getC_carid() {
		return c_carid;
	}
	public void setC_carid(Integer c_carid) {
		this.c_carid = c_carid;
	}
	public String getA_time() {
		return a_time;
	}
	public void setA_time(String a_time) {
		this.a_time = a_time;
	}
	public String getA_depart() {
		return a_depart;
	}
	public void setA_depart(String a_depart) {
		this.a_depart = a_depart;
	}
	public String getA_destination() {
		return a_destination;
	}
	public void setA_destination(String a_destination) {
		this.a_destination = a_destination;
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
