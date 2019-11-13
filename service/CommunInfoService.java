package com.byzx.service;

import com.byzx.model.CommunInfo;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/**@文件名: CommunInfoService.java
 * @类功能说明: 
 * @作者: LiuChunHui
 * @Email: 508499598@qq.com
 * @日期: 2019年10月31日上午9:51:29
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: LiuChunHui</li> 
 * 	 <li>日期: 2019年10月31日上午9:51:29</li> 
 *	 <li>内容: </li>
 * </pre>
 */
public interface CommunInfoService {
	
	public JSONArray findAllCommunInfo();
	
	public JSONObject findAllCommunInfoByPoint(String cm_point);
	
	public int saveCommunInfo(CommunInfo communInfo);
	
	public JSONArray findRecycleNames();
	
	public int deleteCommunInfo(int cm_id);
	
	public int updateCommunInfo(CommunInfo communInfo);

	public JSONArray findAllCommunInfoName();

}
