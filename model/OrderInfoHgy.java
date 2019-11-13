package com.byzx.model;



/**@文件名: OrderInfo.java
 * @类功能说明: 订单信息
 * @作者: HeGuangYao
 * @Email: 105302097@qq.com
 * @日期: 2019年11月1日上午11:19:02
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: HeGuangYao</li> 
 * 	 <li>日期: 2019年11月1日上午11:19:02</li> 
 *	 <li>内容: </li>
 * </pre>
 */
public class OrderInfoHgy {

	private Integer oid; //订单id
	private String odid; //订单编号
	private Integer r_id;//用户id
	private String o_uaddress;//下单地址
	private String o_time;//预约时间
	private String createtime;//下单时间
	private String regenerant;//下单图片
	private int o_weight; //物品重量
	private String remark; //物品描述
	private int delflag; //删除标记
	private int state; //状态
	private String o_name;//
	
	public Integer getOid() {
		return oid;
	}
	public void setOid(Integer oid) {
		this.oid = oid;
	}
	public String getOdid() {
		return odid;
	}
	public void setOdid(String odid) {
		this.odid = odid;
	}
	public Integer getR_id() {
		return r_id;
	}
	public void setR_id(Integer r_id) {
		this.r_id = r_id;
	}
	public String getO_uaddress() {
		return o_uaddress;
	}
	public void setO_uaddress(String o_uaddress) {
		this.o_uaddress = o_uaddress;
	}
	public String getO_time() {
		return o_time;
	}
	public void setO_time(String o_time) {
		this.o_time = o_time;
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
	public int getO_weight() {
		return o_weight;
	}
	public void setO_weight(int o_weight) {
		this.o_weight = o_weight;
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
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public String getO_name() {
		return o_name;
	}
	public void setO_name(String o_name) {
		this.o_name = o_name;
	}
	
	
	
}
