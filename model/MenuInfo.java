package com.byzx.model;
/**@文件名: Menu.java
 * @类功能说明: 
 * @作者: LiuChunHui
 * @Email: 508499598@qq.com
 * @日期: 2019年10月18日上午9:24:27
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: LiuChunHui</li> 
 * 	 <li>日期: 2019年10月18日上午9:24:27</li> 
 *	 <li>内容: </li>
 * </pre>
 */
public class MenuInfo {

	private Integer menu_id;		//菜单ID
	private String menu_name;		//菜单名称
	private String menu_iconCls;		//菜单图标
	private String menu_path;		//路径
	private String menu_state;		//是否有子菜单
	private int state;			//状态
	private int delflag;		//删除标记
	private String createtime;		//创建时间
	private String remark;			//备注
	private int parentId;		//父节点
	private int opt_id;			//操作员
	public Integer getMenu_id() {
		return menu_id;
	}
	public void setMenu_id(Integer menu_id) {
		this.menu_id = menu_id;
	}
	public String getMenu_name() {
		return menu_name;
	}
	public void setMenu_name(String menu_name) {
		this.menu_name = menu_name;
	}
	public String getMenu_iconCls() {
		return menu_iconCls;
	}
	public void setMenu_iconCls(String menu_iconCls) {
		this.menu_iconCls = menu_iconCls;
	}
	public String getMenu_path() {
		return menu_path;
	}
	public void setMenu_path(String menu_path) {
		this.menu_path = menu_path;
	}
	public String getMenu_state() {
		return menu_state;
	}
	public void setMenu_state(String menu_state) {
		this.menu_state = menu_state;
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
	public int getParentId() {
		return parentId;
	}
	public void setParentId(int parentId) {
		this.parentId = parentId;
	}
	public int getOpt_id() {
		return opt_id;
	}
	public void setOpt_id(int opt_id) {
		this.opt_id = opt_id;
	}
	
	
}
