package com.byzx.service;

import java.util.Map;

import com.byzx.model.TransferInfo;

import net.sf.json.JSONArray;

/**@文件名: TransferInfoService.java
 * @类功能说明: 
 * @作者: WangSiYuan
 * @Email: 1512972568@qq.com
 * @日期: 2019年10月30日下午3:44:29
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: WangSiYuan
 * 	 <li>日期: 2019年10月30日下午3:44:29</li> 
 *	 <li>内容: </li>
 * </pre>
 */
public interface TransferInfoService {
	
	public JSONArray findAllTransferInfo(Map<String,Object> map);
	
	public int findAllTransferInfoCount(Map<String,Object> map);
	
	public int saveTransferInfo(TransferInfo transferInfo);
	
	public int updateTransferInfo(TransferInfo transferInfo);
	
	public int deleteTransferInfo(String transIds);
	
	public int findIdByName(String rsname);
	

}
