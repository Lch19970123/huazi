package com.byzx.model;
/**@文件名: t_transfer.java
 * @类功能说明: 
 * @作者: WangSiYuan
 * @Email: 1512972568@qq.com
 * @日期: 2019年10月30日上午10:57:58
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: WangSiYuan
 * 	 <li>日期: 2019年10月30日上午10:57:58</li> 
 *	 <li>内容: </li>
 * </pre>
 */
public class TransferInfo {
	
	private Integer tid;	//转运单主键
	private int t_carid;	//车辆ID  外键
	private int t_udid;		//司机ID
	private String createtime;		//转运单创建时间
	private Integer t_rsid;		//回收站id
	private String rsname;		//回收站名称
	private int t_ssid;		//分拣站id
	private String ss_name;		//分拣站名称
	private String depart_time;		//车辆出发时间
	private int t_ueid;		//出站检查员
	private double load;	//载重/kg
	private int state;		//转运状态
	private int delflag;	//删除标记
	private int optid;		//数据操作员id
	private String optime;		//操作数据时间
	private String remark;		//备注
	private String user_name;	//司机姓名
	
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public Integer getTid() {
		return tid;
	}
	public void setTid(Integer tid) {
		this.tid = tid;
	}
	public int getT_carid() {
		return t_carid;
	}
	public void setT_carid(int t_carid) {
		this.t_carid = t_carid;
	}
	public int getT_udid() {
		return t_udid;
	}
	public void setT_udid(int t_udid) {
		this.t_udid = t_udid;
	}
	public String getCreatetime() {
		return createtime;
	}
	public void setCreatetime(String createtime) {
		this.createtime = createtime;
	}
	public Integer getT_rsid() {
		return t_rsid;
	}
	public void setT_rsid(Integer t_rsid) {
		this.t_rsid = t_rsid;
	}
	public int getT_ssid() {
		return t_ssid;
	}
	public void setT_ssid(int t_ssid) {
		this.t_ssid = t_ssid;
	}
	public String getDepart_time() {
		return depart_time;
	}
	public void setDepart_time(String depart_time) {
		this.depart_time = depart_time;
	}
	public int getT_ueid() {
		return t_ueid;
	}
	public void setT_ueid(int t_ueid) {
		this.t_ueid = t_ueid;
	}
	public double getLoad() {
		return load;
	}
	public void setLoad(double load) {
		this.load = load;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
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
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getRsname() {
		return rsname;
	}
	public void setRsname(String rsname) {
		this.rsname = rsname;
	}
	public String getSs_name() {
		return ss_name;
	}
	public void setSs_name(String ss_name) {
		this.ss_name = ss_name;
	}

	
	
}




