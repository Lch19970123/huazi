package com.byzx.service;

import java.util.Map;

import com.byzx.model.EnshrineInfo;

import net.sf.json.JSONArray;

/**@文件名: EnshrineInfoService.java
 * @类功能说明: 
 * @作者: SongXinLei
 * @Email: 248382500@qq.com
 * @日期: 2019年10月31日下午1:47:06
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: SongXinLei</li> 
 * 	 <li>日期: 2019年10月31日下午1:47:06</li> 
 *	 <li>内容: </li>
 * </pre>
 */
public interface EnshrineInfoService {

	
	public JSONArray findAllEnshrineInfo(Map<String, Object> map);

	public int findAllEnshrineInfoCount(Map<String, Object> map);

	public int saveEnshrineInfo(EnshrineInfo enshrineInfo);

	public int updateEnshrineInfo(EnshrineInfo enshrineInfo);

	public int deleteEnshrineInfo(String warehousIds);

	public int findEnshrineInfoByUName(String warehous_name);




}
