package com.byzx.model;
/**@文件名: BiddDocumentInfo.java
 * @类功能说明: 
 * @作者: LiuChunHui
 * @Email: 508499598@qq.com
 * @日期: 2019年10月30日下午5:18:33
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: LiuChunHui</li> 
 * 	 <li>日期: 2019年10月30日下午5:18:33</li> 
 *	 <li>内容: </li>
 * </pre>
 */
public class BiddDocumentInfo {

	private Integer bd_id;		//投标id
	private String projectTitle;		//小区名称
	private String serialNumber;		//项目名称
	private String title;			//招标编号
	private String sort;		//合同名称
	private String bidingTime;		//招标时间
	private String bidingType;		//招标类别
	private String creatime;		//中标时间
	private int state;		//状态
	private String bidding;		//是否中标0:未，1:中
	private String Remark;		//备注
	private int delflag;			//删除标记（0:未删；1:已删）
	private int opt_id;		//操作员ID
	private String optime;		//操作时间
	public Integer getBd_id() {
		return bd_id;
	}
	public void setBd_id(Integer bd_id) {
		this.bd_id = bd_id;
	}
	public String getProjectTitle() {
		return projectTitle;
	}
	public void setProjectTitle(String projectTitle) {
		this.projectTitle = projectTitle;
	}
	public String getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSort() {
		return sort;
	}
	public void setSort(String sort) {
		this.sort = sort;
	}
	public String getBidingTime() {
		return bidingTime;
	}
	public void setBidingTime(String bidingTime) {
		this.bidingTime = bidingTime;
	}
	public String getBidingType() {
		return bidingType;
	}
	public void setBidingType(String bidingType) {
		this.bidingType = bidingType;
	}
	public String getCreatime() {
		return creatime;
	}
	public void setCreatime(String creatime) {
		this.creatime = creatime;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	
	public String getBidding() {
		return bidding;
	}
	public void setBidding(String bidding) {
		this.bidding = bidding;
	}
	public String getRemark() {
		return Remark;
	}
	public void setRemark(String remark) {
		Remark = remark;
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
	
}
