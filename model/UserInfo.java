package com.byzx.model;
/**@文件名: User.java
 * @类功能说明: 用户登录model层
 * @作者: LiuChunHui
 * @Email: 508499598@qq.com
 * @日期: 2019年10月17日下午5:08:19
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: LiuChunHui</li> 
 * 	 <li>日期: 2019年10月17日下午5:08:19</li> 
 *	 <li>内容: </li>
 * </pre>
 */
public class UserInfo {

	private Integer user_id;		//用户id
	private String user_name;		//用户姓名
	private String user_pwd;		//用户密码
	private String user_phone;		//用户电话
	private String user_idCard;		//用户身份证号
	private int role_id;		//角色
	private int state;			//状态
	private int delflag;		//删除标记
	private String createtime;		//创建时间
	private String remark;		//备注
	private int opt_id;	
	private String role_name;
	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getUser_pwd() {
		return user_pwd;
	}
	public void setUser_pwd(String user_pwd) {
		this.user_pwd = user_pwd;
	}
	public String getUser_phone() {
		return user_phone;
	}
	public void setUser_phone(String user_phone) {
		this.user_phone = user_phone;
	}
	public String getUser_idCard() {
		return user_idCard;
	}
	public void setUser_idCard(String user_idCard) {
		this.user_idCard = user_idCard;
	}
	public int getRole_id() {
		return role_id;
	}
	public void setRole_id(int role_id) {
		this.role_id = role_id;
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
	public String getCreatetime() {
		return createtime;
	}
	public void setCreatetime(String createtime) {
		this.createtime = createtime;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public int getOpt_id() {
		return opt_id;
	}
	public void setOpt_id(int opt_id) {
		this.opt_id = opt_id;
	}
	public String getRole_name() {
		return role_name;
	}
	public void setRole_name(String role_name) {
		this.role_name = role_name;
	}
	
	
}
