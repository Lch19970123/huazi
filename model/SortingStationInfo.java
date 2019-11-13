package com.byzx.model;

import java.util.List;

/**@文件名: UserInfo.java
 * @类功能说明: 分拣站实体类
 * @作者: LiuKaiWem
 * @Email: 1519960668@qq.com
 * @日期: 2019年10月17日下午6:13:24
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: LiuKaiWem</li> 
 * 	 <li>日期: 2019年10月17日下午6:13:24</li> 
 *	 <li>内容: </li>
 * </pre>
 */
public class SortingStationInfo {
	private Integer ss_id; 		//分拣站id
	private int s_usid;		//分拣站人员id
	private String ss_name;//分拣站名称
	private int ss_state;	//分拣站状态 1.运营 0.未运营	
	private int sg_id;		//分拣站物资id
	private String rs_ids;
	private String ss_date;	//分拣站搭建时间
	private int ss_capacity;//分拣站容量
	private String ss_address;//分拣站地址
	private String ss_coordinate;//分拣站坐标
	private String remark;	//备注
	private int delflag;	//删除标记
	private int opt_id;		//操作人员 	
	private String optime;		//操作时间
	private List<SorterInfo> sorterInfo;
	private List<SortGoodsInfo> sortGoodsInfo;
	public List<SortGoodsInfo> getSortGoodsInfo() {
		return sortGoodsInfo;
	}
	public void setSortGoodsInfo(List<SortGoodsInfo> sortGoodsInfo) {
		this.sortGoodsInfo = sortGoodsInfo;
	}
	
	public Integer getSs_id() {
		return ss_id;
	}
	public void setSs_id(Integer ss_id) {
		this.ss_id = ss_id;
	}
	public int getS_usid() {
		return s_usid;
	}
	public void setS_usid(int s_usid) {
		this.s_usid = s_usid;
	}
	public String getSs_name() {
		return ss_name;
	}
	public void setSs_name(String ss_name) {
		this.ss_name = ss_name;
	}
	
	public String getRs_ids() {
		return rs_ids;
	}
	public void setRs_ids(String rs_ids) {
		this.rs_ids = rs_ids;
	}
	public int getSs_state() {
		return ss_state;
	}
	public void setSs_state(int ss_state) {
		this.ss_state = ss_state;
	}
	public int getSg_id() {
		return sg_id;
	}
	public void setSg_id(int sg_id) {
		this.sg_id = sg_id;
	}
	public String getSs_date() {
		return ss_date;
	}
	public void setSs_date(String ss_date) {
		this.ss_date = ss_date;
	}
	public int getSs_capacity() {
		return ss_capacity;
	}
	public void setSs_capacity(int ss_capacity) {
		this.ss_capacity = ss_capacity;
	}
	public String getSs_address() {
		return ss_address;
	}
	public void setSs_address(String ss_address) {
		this.ss_address = ss_address;
	}
	public String getSs_coordinate() {
		return ss_coordinate;
	}
	public void setSs_coordinate(String ss_coordinate) {
		this.ss_coordinate = ss_coordinate;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
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
	public String getOptime() {
		return optime;
	}
	public void setOptime(String optime) {
		this.optime = optime;
	}
	public List<SorterInfo> getSorterInfo() {
		return sorterInfo;
	}
	public void setSorterInfo(List<SorterInfo> sorterInfo) {
		this.sorterInfo = sorterInfo;
	}
	
	
}
