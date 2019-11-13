package com.byzx.model;
/**@文件名: UserInfo.java
 * @类功能说明: 未分拣入库管理实体类
 * @作者: LiuKaiWem
 * @Email: 1519960668@qq.com
 * @日期: 2019年10月17日下午6:13:24
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: LiuKaiWem</li> 
 * 	 <li>日期: 2019年10月17日下午6:13:24</li> 
 *	 <li>内容: </li>
 * </pre>
 */
public class WarehouseInfo {
	private int	wh_id;           //入库id              
	private int	wh_carid;        //车辆id             
	private int	wh_udid;         //司机id              
	private int	oid;             //订单id              
	private int	wh_tid;          //回收站转运单id  
	private String creatTime;    //到站时间          
	private int	weight;          //重量                
	private int	deviation;       //偏差记录          
	private String	remark;      //备注                
	private int	state;           //状态                
	private int	op_tid;           //操作人员          
	private int	delflag;         //删除标记       
	public int getWh_id() {
		return wh_id;
	}
	public void setWh_id(int wh_id) {
		this.wh_id = wh_id;
	}
	public int getWh_carid() {
		return wh_carid;
	}
	public void setWh_carid(int wh_carid) {
		this.wh_carid = wh_carid;
	}
	public int getWh_udid() {
		return wh_udid;
	}
	public void setWh_udid(int wh_udid) {
		this.wh_udid = wh_udid;
	}
	public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	public int getWh_tid() {
		return wh_tid;
	}
	public void setWh_tid(int wh_tid) {
		this.wh_tid = wh_tid;
	}
	public String getCreatTime() {
		return creatTime;
	}
	public void setCreatTime(String creatTime) {
		this.creatTime = creatTime;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getDeviation() {
		return deviation;
	}
	public void setDeviation(int deviation) {
		this.deviation = deviation;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	
	public int getOp_tid() {
		return op_tid;
	}
	public void setOp_tid(int op_tid) {
		this.op_tid = op_tid;
	}
	public int getDelflag() {
		return delflag;
	}
	public void setDelflag(int delflag) {
		this.delflag = delflag;
	}
}
