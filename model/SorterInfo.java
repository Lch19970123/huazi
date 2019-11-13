package com.byzx.model;
/**@文件名: SorterInfo.java
 * @类功能说明: 分拣员
 * @作者: LiuKaiWem
 * @Email: 1519960668@qq.com
 * @日期: 2019年10月30日下午3:45:28
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: LiuKaiWem</li> 
 * 	 <li>日期: 2019年10月30日下午3:45:28</li> 
 *	 <li>内容: </li>
 * </pre>
 */
public class SorterInfo {

	private Integer sorter_jobNum;//分拣员工号
	private Integer ss_id; //分拣站id
	private Integer s_usid; //分拣员ID
	private Integer sorter_busy; //分拣员状态0-空闲，1-有任务
	private Integer sorter_work;//分拣员是否在线0-没上班 1-上班
	private Integer state;//状态
	private Integer delflag;//删除标记
	private Integer opt_id;//操作人员id
	private String sorter_workTop;//分拣员工种
	private String remark;//备注
	private String optime;//操作时间
	
	public Integer getOpt_id() {
		return opt_id;
	}
	public void setOpt_id(Integer opt_id) {
		this.opt_id = opt_id;
	}
	public Integer getSorter_jobNum() {
		return sorter_jobNum;
	}
	public void setSorter_jobNum(Integer sorter_jobNum) {
		this.sorter_jobNum = sorter_jobNum;
	}
	public Integer getSs_id() {
		return ss_id;
	}
	public void setSs_id(Integer ss_id) {
		this.ss_id = ss_id;
	}
	public Integer getS_usid() {
		return s_usid;
	}
	public void setS_usid(Integer s_usid) {
		this.s_usid = s_usid;
	}
	public Integer getSorter_busy() {
		return sorter_busy;
	}
	public void setSorter_busy(Integer sorter_busy) {
		this.sorter_busy = sorter_busy;
	}
	public Integer getSorter_work() {
		return sorter_work;
	}
	public void setSorter_work(Integer sorter_work) {
		this.sorter_work = sorter_work;
	}
	public Integer getState() {
		return state;
	}
	public void setState(Integer state) {
		this.state = state;
	}
	public Integer getDelflag() {
		return delflag;
	}
	public void setDelflag(Integer delflag) {
		this.delflag = delflag;
	}
	
	public String getSorter_workTop() {
		return sorter_workTop;
	}
	public void setSorter_workTop(String sorter_workTop) {
		this.sorter_workTop = sorter_workTop;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getOptime() {
		return optime;
	}
	public void setOptime(String optime) {
		this.optime = optime;
	}

	
	
	
}
