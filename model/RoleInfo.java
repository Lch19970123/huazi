package com.byzx.model;
/**@文件名: Role.java
 * @类功能说明: 角色表的java bean层
 * @作者: LiuChunHui
 * @Email: 508499598@qq.com
 * @日期: 2019年10月18日上午9:19:52
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: LiuChunHui</li> 
 * 	 <li>日期: 2019年10月18日上午9:19:52</li> 
 *	 <li>内容: </li>
 * </pre>
 */
public class RoleInfo {

	private Integer role_id;		//角色id
	private String role_name;		//角色名称
	private String menu_ids;		//菜单信息组
	private int state;			//状态
	private int delflag;		//删除标记
	private String createtime;		//创建时间
	private String remark;		//备注
	private int opt_id;
	public Integer getRole_id() {
		return role_id;
	}
	public void setRole_id(Integer role_id) {
		this.role_id = role_id;
	}
	public String getRole_name() {
		return role_name;
	}
	public void setRole_name(String role_name) {
		this.role_name = role_name;
	}
	public String getMenu_ids() {
		return menu_ids;
	}
	public void setMenu_ids(String menu_ids) {
		this.menu_ids = menu_ids;
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
	
	
}
