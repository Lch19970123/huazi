package com.byzx.model;
/**@文件名: DatadetilInfo.java
 * @类功能说明: 
 * @作者: LiuChunHui
 * @Email: 508499598@qq.com
 * @日期: 2019年10月25日上午10:59:31
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: LiuChunHui</li> 
 * 	 <li>日期: 2019年10月25日上午10:59:31</li> 
 *	 <li>内容: </li>
 * </pre>
 */
public class DataDetailInfo {

	private Integer dataDet_id;		//数据从主键
	private int data_id;		//数据主键
	private String dataDet_name;		//数据从名称
	private int state;			//状态
	private int delflag;		//删除标记
	private String createtime;		//创建时间
	private String remark;		//备注
	private int opt_id;	
	public int getOpt_id() {
		return opt_id;
	}
	public void setOpt_id(int opt_id) {
		this.opt_id = opt_id;
	}
	public Integer getDataDet_id() {
		return dataDet_id;
	}
	public void setDataDet_id(Integer dataDet_id) {
		this.dataDet_id = dataDet_id;
	}
	public int getData_id() {
		return data_id;
	}
	public void setData_id(int data_id) {
		this.data_id = data_id;
	}
	public String getDataDet_name() {
		return dataDet_name;
	}
	public void setDataDet_name(String dataDet_name) {
		this.dataDet_name = dataDet_name;
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
	
}
