package com.byzx.model;
/**@文件名: GoodsDetailInfo.java
 * @类功能说明: 
 * @作者: LiuChunHui
 * @Email: 508499598@qq.com
 * @日期: 2019年10月30日下午12:13:36
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: LiuChunHui</li> 
 * 	 <li>日期: 2019年10月30日下午12:13:36</li> 
 *	 <li>内容: </li>
 * </pre>
 */
public class GoodsDetailInfo {

	private Integer gt_id;		//物品类型ID
	private String gt_code;		//物品类型编码
	private String gt_name;		//物品类型名称
	private int gt_state;			//状态
	private int gt_delflag;		//删除标记
	private String gt_creattime;		//创建时间
	private String gt_remark;		//备注
	private int gt_optid;		//操作员ID
	public Integer getGt_id() {
		return gt_id;
	}
	public void setGt_id(Integer gt_id) {
		this.gt_id = gt_id;
	}
	public String getGt_code() {
		return gt_code;
	}
	public void setGt_code(String gt_code) {
		this.gt_code = gt_code;
	}
	public String getGt_name() {
		return gt_name;
	}
	public void setGt_name(String gt_name) {
		this.gt_name = gt_name;
	}
	public int getGt_state() {
		return gt_state;
	}
	public void setGt_state(int gt_state) {
		this.gt_state = gt_state;
	}
	public int getGt_delflag() {
		return gt_delflag;
	}
	public void setGt_delflag(int gt_delflag) {
		this.gt_delflag = gt_delflag;
	}
	public String getGt_creattime() {
		return gt_creattime;
	}
	public void setGt_creattime(String gt_creattime) {
		this.gt_creattime = gt_creattime;
	}
	public String getGt_remark() {
		return gt_remark;
	}
	public void setGt_remark(String gt_remark) {
		this.gt_remark = gt_remark;
	}
	public int getGt_optid() {
		return gt_optid;
	}
	public void setGt_optid(int gt_optid) {
		this.gt_optid = gt_optid;
	}
	
}
