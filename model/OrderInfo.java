package com.byzx.model;
/**@文件名: OrderInfo.java
 * @类功能说明: 
 * @作者: WangSiYuan
 * @Email: 1512972568@qq.com
 * @日期: 2019年11月2日上午10:42:27
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: WangSiYuan
 * 	 <li>日期: 2019年11月2日上午10:42:27</li> 
 *	 <li>内容: </li>
 * </pre>
 */
public class OrderInfo {

	private Integer oid;		//订单ID
	private Integer odid;		//订单编号
	private Integer o_uid;		//居民用户ID
	private String R_name;		//居民姓名		关联居民用户表
	private String r_nickname;		//居民昵称
	private String o_uaddress;		//下单回收地址
	private String createtime;		//创建时间
	private String regenerant;		//回收物图片
	private double o_weight;		//回收物重量/kg
	private int receiving;		//是否接单完成回收:0否,1接单,2处理中,3完成
	private Integer o_clerkid;		//接单员ID
	private Integer o_ucid;		//回收员ID
	private double o_money;		//订单金额
	private String o_fintime;		//完成时间
	private int delflag;		//删除标记
	private Integer optid;		//操作员ID
	private String optime;		//数据操作时间
	private String remark;		//备注
	
	
	public Integer getOid() {
		return oid;
	}
	public void setOid(Integer oid) {
		this.oid = oid;
	}
	public Integer getOdid() {
		return odid;
	}
	public void setOdid(Integer odid) {
		this.odid = odid;
	}
	public Integer getO_uid() {
		return o_uid;
	}
	public void setO_uid(Integer o_uid) {
		this.o_uid = o_uid;
	}
	public String getO_uaddress() {
		return o_uaddress;
	}
	public void setO_uaddress(String o_uaddress) {
		this.o_uaddress = o_uaddress;
	}
	public String getCreatetime() {
		return createtime;
	}
	public void setCreatetime(String createtime) {
		this.createtime = createtime;
	}
	public String getRegenerant() {
		return regenerant;
	}
	public void setRegenerant(String regenerant) {
		this.regenerant = regenerant;
	}
	public double getO_weight() {
		return o_weight;
	}
	public void setO_weight(double o_weight) {
		this.o_weight = o_weight;
	}
	public int getReceiving() {
		return receiving;
	}
	public void setReceiving(int receiving) {
		this.receiving = receiving;
	}
	public Integer getO_clerkid() {
		return o_clerkid;
	}
	public void setO_clerkid(Integer o_clerkid) {
		this.o_clerkid = o_clerkid;
	}
	public Integer getO_ucid() {
		return o_ucid;
	}
	public void setO_ucid(Integer o_ucid) {
		this.o_ucid = o_ucid;
	}
	public double getO_money() {
		return o_money;
	}
	public void setO_money(double o_money) {
		this.o_money = o_money;
	}
	public String getO_fintime() {
		return o_fintime;
	}
	public void setO_fintime(String o_fintime) {
		this.o_fintime = o_fintime;
	}
	public int getDelflag() {
		return delflag;
	}
	public void setDelflag(int delflag) {
		this.delflag = delflag;
	}
	public Integer getOptid() {
		return optid;
	}
	public void setOptid(Integer optid) {
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
	public String getR_name() {
		return R_name;
	}
	public void setR_name(String r_name) {
		R_name = r_name;
	}
	public String getR_nickname() {
		return r_nickname;
	}
	public void setR_nickname(String r_nickname) {
		this.r_nickname = r_nickname;
	}
	
	
	
	
}





