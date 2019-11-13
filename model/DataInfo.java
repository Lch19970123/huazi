package com.byzx.model;

import java.util.List;

/**@文件名: DataInfo.java
 * @类功能说明: 
 * @作者: LiuChunHui
 * @Email: 508499598@qq.com
 * @日期: 2019年10月25日上午10:58:44
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: LiuChunHui</li> 
 * 	 <li>日期: 2019年10月25日上午10:58:44</li> 
 *	 <li>内容: </li>
 * </pre>
 */
public class DataInfo {

	private Integer data_id;		//数据主键
	private String data_name;		//数据名称
	private int state;			//状态
	private int delflag;		//删除标记
	private String createtime;		//创建时间
	private String remark;		//备注
	private List<DataDetailInfo> dataDetailInfo;
	private int opt_id;	
	public int getOpt_id() {
		return opt_id;
	}
	public void setOpt_id(int opt_id) {
		this.opt_id = opt_id;
	}
	public Integer getData_id() {
		return data_id;
	}
	public void setData_id(Integer data_id) {
		this.data_id = data_id;
	}
	public String getData_name() {
		return data_name;
	}
	public void setData_name(String data_name) {
		this.data_name = data_name;
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
	public List<DataDetailInfo> getDataDetailInfo() {
		return dataDetailInfo;
	}
	public void setDataDetailInfo(List<DataDetailInfo> dataDetailInfo) {
		this.dataDetailInfo = dataDetailInfo;
	}
	
	
}
