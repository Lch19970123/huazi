package com.byzx.model;
/**@鏂囦欢鍚�: RecycleGoods.java
 * @绫诲姛鑳借鏄�: 
 * @浣滆��: BaiHaoJie
 * @Email: 596315150@qq.com
 * @鏃ユ湡: 2019骞�10鏈�30鏃ヤ笅鍗�5:22:23
 * @淇敼璇存槑:<br> 
 * <pre>
 * 	 <li>浣滆��: BaiHaoJie</li> 
 * 	 <li>鏃ユ湡: 2019骞�10鏈�30鏃ヤ笅鍗�5:22:23</li> 
 *	 <li>鍐呭: </li>
 * </pre>
 */
public class RecycleGoodsInfo {


	private Integer sg_id;  //鍥炴敹绔檌d
	private Integer sg_gid; //鐗╄祫id
	private Integer allocation_num; //鍙拌处鍒嗛厤鏁伴噺
	private Integer inventory_num; //搴撳瓨鏁伴噺
	private Integer use_num; //宸蹭娇鐢ㄦ暟閲�
	private Integer scrap_num; //鎶ュ簾鏁伴噺
	private int delflag; //鍒犻櫎鏍囪
	private Integer g_id;
	private String g_name;
	private Integer optid; //鎿嶄綔浜哄憳
	private String optime; //鎿嶄綔鏃堕棿
	private String remark; //澶囨敞
	private int state; //鐘舵��
	public Integer getSg_id() {
		return sg_id;
	}
	public void setSg_id(Integer sg_id) {
		this.sg_id = sg_id;
	}
	public Integer getSg_gid() {
		return sg_gid;
	}
	public void setSg_gid(Integer sg_gid) {
		this.sg_gid = sg_gid;
	}
	public Integer getAllocation_num() {
		return allocation_num;
	}
	public void setAllocation_num(Integer allocation_num) {
		this.allocation_num = allocation_num;
	}
	public Integer getInventory_num() {
		return inventory_num;
	}
	public void setInventory_num(Integer inventory_num) {
		this.inventory_num = inventory_num;
	}
	public Integer getUse_num() {
		return use_num;
	}
	public void setUse_num(Integer use_num) {
		this.use_num = use_num;
	}
	public Integer getScrap_num() {
		return scrap_num;
	}
	public void setScrap_num(Integer scrap_num) {
		this.scrap_num = scrap_num;
	}
	public int getDelflag() {
		return delflag;
	}
	public void setDelflag(int delflag) {
		this.delflag = delflag;
	}
	public Integer getG_id() {
		return g_id;
	}
	public void setG_id(Integer g_id) {
		this.g_id = g_id;
	}
	public String getG_name() {
		return g_name;
	}
	public void setG_name(String g_name) {
		this.g_name = g_name;
	}
	public Integer getOptid() {
		return optid;
	}
	public void setOptid(Integer optid) {
		this.optid = optid;
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
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
}
