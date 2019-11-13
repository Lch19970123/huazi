package com.byzx.model;
/**@文件名: GoodsInfo.java
 * @类功能说明: 物资表
 * @作者: LiuChunHui
 * @Email: 508499598@qq.com
 * @日期: 2019年10月30日上午9:48:52
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: LiuChunHui</li> 
 * 	 <li>日期: 2019年10月30日上午9:48:52</li> 
 *	 <li>内容: </li>
 * </pre>
 */
public class GoodsInfo {

	private Integer g_id;		//物品ID
	private String g_code;		//物品编码
	private String g_name;		//物品名称
	private int g_gtid;		//物品类型ID
	private double g_price;		//价格
	private int g_model;		//物品型号
	private String g_format;		//物品规格
	private String g_qualitytime;		//保质期
	private int g_deptid;		//所属部门（回收站/分拣站）
	private int state;			//状态
	private int g_stopflag;			//停用标记（0表示为停用；1表示已停用）
	private int delflag;		//删除标记
	private String optime;		//创建时间
	private String remark;		//备注
	private int optid;			//操作人
	private String gt_name;
	public Integer getG_id() {
		return g_id;
	}
	public void setG_id(Integer g_id) {
		this.g_id = g_id;
	}
	public String getG_code() {
		return g_code;
	}
	public void setG_code(String g_code) {
		this.g_code = g_code;
	}
	public String getG_name() {
		return g_name;
	}
	public void setG_name(String g_name) {
		this.g_name = g_name;
	}
	public int getG_gtid() {
		return g_gtid;
	}
	public void setG_gtid(int g_gtid) {
		this.g_gtid = g_gtid;
	}
	public double getG_price() {
		return g_price;
	}
	public void setG_price(double g_price) {
		this.g_price = g_price;
	}
	public int getG_model() {
		return g_model;
	}
	public void setG_model(int g_model) {
		this.g_model = g_model;
	}
	public String getG_format() {
		return g_format;
	}
	public void setG_format(String g_format) {
		this.g_format = g_format;
	}
	public String getG_qualitytime() {
		return g_qualitytime;
	}
	public void setG_qualitytime(String g_qualitytime) {
		this.g_qualitytime = g_qualitytime;
	}
	public int getG_deptid() {
		return g_deptid;
	}
	public void setG_deptid(int g_deptid) {
		this.g_deptid = g_deptid;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public int getG_stopflag() {
		return g_stopflag;
	}
	public void setG_stopflag(int g_stopflag) {
		this.g_stopflag = g_stopflag;
	}
	public int getDelflag() {
		return delflag;
	}
	public void setDelflag(int delflag) {
		this.delflag = delflag;
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
	public int getOptid() {
		return optid;
	}
	public void setOptid(int optid) {
		this.optid = optid;
	}
	public String getGt_name() {
		return gt_name;
	}
	public void setGt_name(String gt_name) {
		this.gt_name = gt_name;
	}
	
}
