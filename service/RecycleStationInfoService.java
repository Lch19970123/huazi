package com.byzx.service;

import com.byzx.model.RecycleStationInfo;

import net.sf.json.JSONArray;

/**@鏂囦欢鍚�: RecycleInfoService.java
 * @绫诲姛鑳借鏄�: 
 * @浣滆��: BaiHaoJie
 * @Email: 596315150@qq.com
 * @鏃ユ湡: 2019骞�10鏈�31鏃ヤ笅鍗�3:02:46
 * @淇敼璇存槑:<br> 
 * <pre>
 * 	 <li>浣滆��: BaiHaoJie</li> 
 * 	 <li>鏃ユ湡: 2019骞�10鏈�31鏃ヤ笅鍗�3:02:46</li> 
 *	 <li>鍐呭: </li>
 * </pre>
 */
public interface RecycleStationInfoService {

	public JSONArray findAllRecycle();

	public JSONArray findRecycleByAddress(String recycle_address);

	public int saveRecycleInfo(RecycleStationInfo recycleStationInfo);

	public int deleteRecycleInfo(int rsid);

	public int updateRecycleInfo(RecycleStationInfo recycleInfo);


}
