package com.byzx.service;

import com.byzx.model.SortingStationInfo;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/**@文件名: SortingStationInfoService.java
 * @类功能说明: 
 * @作者: LiuKaiWen
 * @Email: 508499598@qq.com
 * @日期: 2019年11月5日上午11:32:50
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: LiuKaiWen</li> 
 * 	 <li>日期: 2019年11月5日上午11:32:50</li> 
 *	 <li>内容: </li>
 * </pre>
 */
public interface SortingStationInfoservice {

	public JSONArray findSortStationNames();

	public JSONArray findAllSortingStation();

	public JSONObject findAllSSByAddress(String ss_address);

	public int addSortingStationInfo(SortingStationInfo sortingStationInfo);

	public int deleteSortingStationInfo(int ss_id);

	public int updateSortingStationInfo(SortingStationInfo sortingStationInfo);
}
