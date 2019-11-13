package com.byzx.model;
/**@文件名: Build.java
 * @类功能说明: 
 * @作者: LiuChunHui
 * @Email: 508499598@qq.com
 * @日期: 2019年11月1日上午8:30:39
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: LiuChunHui</li> 
 * 	 <li>日期: 2019年11月1日上午8:30:39</li> 
 *	 <li>内容: </li>
 * </pre>
 */
public class BuildInfo {

	private Integer b_id;		//楼房ID
	private int cm_id;		//楼房ID
	private int b_unit;		//所属单元
	private int b_floor;		//楼房层数
	private int b_population;			//楼房人口
	private String remark;		//备注
	private int delflag;			//删除标记（0:未删；1:已删）
	private int optid;		//操作员ID
	private String optime;		//操作时间
	private int state;			//状态（0:未用;1:已用）
	
	public int getCm_id() {
		return cm_id;
	}
	public void setCm_id(int cm_id) {
		this.cm_id = cm_id;
	}
	public Integer getB_id() {
		return b_id;
	}
	public void setB_id(Integer b_id) {
		this.b_id = b_id;
	}
	public int getB_unit() {
		return b_unit;
	}
	public void setB_unit(int b_unit) {
		this.b_unit = b_unit;
	}
	public int getB_floor() {
		return b_floor;
	}
	public void setB_floor(int b_floor) {
		this.b_floor = b_floor;
	}
	
	public int getB_population() {
		return b_population;
	}
	public void setB_population(int b_population) {
		this.b_population = b_population;
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
	public int getOptid() {
		return optid;
	}
	public void setOptid(int optid) {
		this.optid = optid;
	}
	public String getOptime() {
		return optime;
	}
	public void setOptime(String optime) {
		this.optime = optime;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	
}
