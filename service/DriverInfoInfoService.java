package com.byzx.service;

import java.util.Map;

import net.sf.json.JSONArray;

/**@文件名: DriverInfoInfoService.java
 * @类功能说明: 
 * @作者: WangSiYuan
 * @Email: 1512972568@qq.com
 * @日期: 2019年11月1日下午5:12:38
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: WangSiYuan
 * 	 <li>日期: 2019年11月1日下午5:12:38</li> 
 *	 <li>内容: </li>
 * </pre>
 */
public interface DriverInfoInfoService {
	
	public JSONArray findAllDriverInfo(Map<String,Object> map);
	
	public int findAllDriverInfoCount(Map<String,Object> map);

}



