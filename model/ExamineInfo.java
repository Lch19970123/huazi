package com.byzx.model;
/**@文件名: ExamineInfo.java
 * @类功能说明: 质量考核表实体类
 * @作者: LiuKaiWem
 * @Email: 1519960668@qq.com
 * @日期: 2019年10月30日下午3:59:14
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: LiuKaiWem</li> 
 * 	 <li>日期: 2019年10月30日下午3:59:14</li> 
 *	 <li>内容: </li>
 * </pre>
 */
public class ExamineInfo {
	private int	examine_id;      //考核id            
	private int	s_usid;          //分拣员id         
	private int	allot;           //分配的质量     
	private int	accomplish;      //完成的质量     
	private int	massDeviation;   //质量偏差        
	private int	budgetTime;      //预算完成时间  
	private int	realityTime;     //实际完成时间  
	private int	timeDeviation;   //时间偏差        
	private int	state;           //状态              
	private int	opt_id;           //操作人员        
	private int	delflag;         //删除标记        
	private String optime;       //登记时间        
	private String remark;       //备注  
	public int getExamine_id() {
		return examine_id;
	}
	public void setExamine_id(int examine_id) {
		this.examine_id = examine_id;
	}
	public int getS_usid() {
		return s_usid;
	}
	public void setS_usid(int s_usid) {
		this.s_usid = s_usid;
	}
	public int getAllot() {
		return allot;
	}
	public void setAllot(int allot) {
		this.allot = allot;
	}
	public int getAccomplish() {
		return accomplish;
	}
	public void setAccomplish(int accomplish) {
		this.accomplish = accomplish;
	}
	public int getMassDeviation() {
		return massDeviation;
	}
	public void setMassDeviation(int massDeviation) {
		this.massDeviation = massDeviation;
	}
	public int getBudgetTime() {
		return budgetTime;
	}
	public void setBudgetTime(int budgetTime) {
		this.budgetTime = budgetTime;
	}
	public int getRealityTime() {
		return realityTime;
	}
	public void setRealityTime(int realityTime) {
		this.realityTime = realityTime;
	}
	public int getTimeDeviation() {
		return timeDeviation;
	}
	public void setTimeDeviation(int timeDeviation) {
		this.timeDeviation = timeDeviation;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public int getOpt_id() {
		return opt_id;
	}
	public void setOpt_id(int opt_id) {
		this.opt_id = opt_id;
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
}
