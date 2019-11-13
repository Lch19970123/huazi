package com.byzx.model;

import java.util.List;

/**@文件名: CommunInfo.java
 * @类功能说明: 
 * @作者: LiuChunHui
 * @Email: 508499598@qq.com
 * @日期: 2019年10月31日上午9:34:15
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: LiuChunHui</li> 
 * 	 <li>日期: 2019年10月31日上午9:34:15</li> 
 *	 <li>内容: </li>
 * </pre>
 */
public class CommunInfo {

	private Integer cm_id;		//小区ID
	private int rsid;		//回收站ID
	private String cm_name;			//小区名称
	private String cm_address;		//小区地址
	private String cm_point;		//小区精确位置（经纬度）
	private String cm_area;		//小区面积
	private String cm_range;		//小区范围
	private String cm_population;		//小区人口数
	private String bidding;		//是否中标0:未，1:中
	private String cm_remark;		//备注
	private int delflag;			//删除标记（0:未删；1:已删）
	private int optid;		//操作员ID
	private String creatTime;		//操作时间
	private int state;			//状态（0:未用;1:已用）
	private List<BuildInfo> buildInfo;
	private List<CollectorInfo> collectorInfo;
	
	public List<CollectorInfo> getCollectorInfo() {
		return collectorInfo;
	}
	public void setCollectorInfo(List<CollectorInfo> collectorInfo) {
		this.collectorInfo = collectorInfo;
	}
	public List<BuildInfo> getBuildInfo() {
		return buildInfo;
	}
	public void setBuildInfo(List<BuildInfo> buildInfo) {
		this.buildInfo = buildInfo;
	}
	public Integer getCm_id() {
		return cm_id;
	}
	public void setCm_id(Integer cm_id) {
		this.cm_id = cm_id;
	}
	public int getRsid() {
		return rsid;
	}
	public void setRsid(int rsid) {
		this.rsid = rsid;
	}
	public String getCm_name() {
		return cm_name;
	}
	public void setCm_name(String cm_name) {
		this.cm_name = cm_name;
	}
	public String getCm_address() {
		return cm_address;
	}
	public void setCm_address(String cm_address) {
		this.cm_address = cm_address;
	}
	public String getCm_point() {
		return cm_point;
	}
	public void setCm_point(String cm_point) {
		this.cm_point = cm_point;
	}
	public String getCm_area() {
		return cm_area;
	}
	public void setCm_area(String cm_area) {
		this.cm_area = cm_area;
	}
	public String getCm_range() {
		return cm_range;
	}
	public void setCm_range(String cm_range) {
		this.cm_range = cm_range;
	}
	public String getCm_population() {
		return cm_population;
	}
	public void setCm_population(String cm_population) {
		this.cm_population = cm_population;
	}
	public String getBidding() {
		return bidding;
	}
	public void setBidding(String bidding) {
		this.bidding = bidding;
	}
	public String getCm_remark() {
		return cm_remark;
	}
	public void setCm_remark(String cm_remark) {
		this.cm_remark = cm_remark;
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
	public String getCreatTime() {
		return creatTime;
	}
	public void setCreatTime(String creatTime) {
		this.creatTime = creatTime;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	
}
