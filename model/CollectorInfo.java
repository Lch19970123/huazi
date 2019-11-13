package com.byzx.model;
/**@文件名: CollectorInfo.java
 * @类功能说明: 
 * @作者: LiuChunHui
 * @Email: 508499598@qq.com
 * @日期: 2019年11月1日下午5:15:56
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: LiuChunHui</li> 
 * 	 <li>日期: 2019年11月1日下午5:15:56</li> 
 *	 <li>内容: </li>
 * </pre>
 */
public class CollectorInfo {

	private Integer c_ucid; //回收员id
	private Integer user_id; //用户id
	private int state; //状态 0.未上班 1.上班
	private int c_uid; //是否负责人1:是，0:否
	private Integer c_rsid; //回收站id
	private int c_type; //工种0.接单人员1.负责人员2.上门回收员
	private String coord;		//回收员坐标
	private Integer optid; //操作人员
	private int delflag; //删除标记
	private String optime; //操作时间
	private String remark; //备注
	public Integer getC_ucid() {
		return c_ucid;
	}
	public void setC_ucid(Integer c_ucid) {
		this.c_ucid = c_ucid;
	}
	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public int getC_uid() {
		return c_uid;
	}
	public void setC_uid(int c_uid) {
		this.c_uid = c_uid;
	}
	public Integer getC_rsid() {
		return c_rsid;
	}
	public void setC_rsid(Integer c_rsid) {
		this.c_rsid = c_rsid;
	}
	public int getC_type() {
		return c_type;
	}
	public void setC_type(int c_type) {
		this.c_type = c_type;
	}
	public String getCoord() {
		return coord;
	}
	public void setCoord(String coord) {
		this.coord = coord;
	}
	public Integer getOptid() {
		return optid;
	}
	public void setOptid(Integer optid) {
		this.optid = optid;
	}
	public int getDelflag() {
		return delflag;
	}
	public void setDelflag(int delflag) {
		this.delflag = delflag;
	}
	public String getOptime() {
		return optime;
	}
	public void setOptime(String optime) {
		this.optime = optime;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
}
