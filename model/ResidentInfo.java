package com.byzx.model;
/**@文件名: ResidentInfo.java
 * @类功能说明: 居民用户登录信息
 * @作者: HeGuangYao
 * @Email: 105302097@qq.com
 * @日期: 2019年10月30日上午10:54:31
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: HeGuangYao</li> 
 * 	 <li>日期: 2019年10月30日上午10:54:31</li> 
 *	 <li>内容: </li>
 * </pre>
 */
public class ResidentInfo {

	private Integer r_id; //居民用户id
	private String r_name;//居民用户姓名
	private String r_nickname;//居民用户昵称
	private String r_password;//居民用户密码
	private String r_sex;//居民用户性别
	private String iDCard;//居民用户身份证号
	private String address;//居民用户住址
	private String contact;//居民用户联系方式
	private String regdata;//居民用户注册时间
	private String remark;//备注
	private int delflag; //删除标记
	private int opt_id;//操作人id
	private int state;//状态
	
	
	
	public Integer getR_id() {
		return r_id;
	}
	public void setR_id(Integer r_id) {
		this.r_id = r_id;
	}
	public String getR_name() {
		return r_name;
	}
	public void setR_name(String r_name) {
		this.r_name = r_name;
	}
	public String getR_nickname() {
		return r_nickname;
	}
	public void setR_nickname(String r_nickname) {
		this.r_nickname = r_nickname;
	}
	public String getR_password() {
		return r_password;
	}
	public void setR_password(String r_password) {
		this.r_password = r_password;
	}
	public String getR_sex() {
		return r_sex;
	}
	public void setR_sex(String r_sex) {
		this.r_sex = r_sex;
	}
	public String getiDCard() {
		return iDCard;
	}
	public void setiDCard(String iDCard) {
		this.iDCard = iDCard;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getRegdata() {
		return regdata;
	}
	public void setRegdata(String regdata) {
		this.regdata = regdata;
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
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	
}
