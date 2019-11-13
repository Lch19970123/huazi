package com.byzx.service;
/**@文件名: DataInfoService.java
 * @类功能说明: 
 * @作者: LiuChunHui
 * @Email: 508499598@qq.com
 * @日期: 2019年10月25日上午11:12:23
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: LiuChunHui</li> 
 * 	 <li>日期: 2019年10月25日上午11:12:23</li> 
 *	 <li>内容: </li>
 * </pre>
 */

import java.util.Map;

import com.byzx.model.DataInfo;

import net.sf.json.JSONArray;



public interface DataInfoService {

	public JSONArray findAllDataInfo(Map<String,Object> map);
	
	public int findAllDataInfoCount(Map<String,Object> map);
	
	public int addDataInfo(DataInfo dataInfo);
	
	public int updateDataInfo(DataInfo dataInfo);
	
	public int deleteDataInfo(int data_id);

	public JSONArray findDataInfoByDId(int data_id);
}
