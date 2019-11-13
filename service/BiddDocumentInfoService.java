package com.byzx.service;

import java.util.Map;

import com.byzx.model.BiddDocumentInfo;

import net.sf.json.JSONArray;

/**@文件名: BiddDocumentInfoService.java
 * @类功能说明: 
 * @作者: LiuChunHui
 * @Email: 508499598@qq.com
 * @日期: 2019年10月30日下午5:19:55
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: LiuChunHui</li> 
 * 	 <li>日期: 2019年10月30日下午5:19:55</li> 
 *	 <li>内容: </li>
 * </pre>
 */
public interface BiddDocumentInfoService {

	public JSONArray findAllBiddDocumentInfo(Map<String,Object> map);
	
	public int findAllBiddDocumentInfoCount(Map<String,Object> map);
	
	public int saveBiddDocumentInfo(BiddDocumentInfo biddDocumentInfo);
	
	public int updateBiddDocumentInfo(BiddDocumentInfo biddDocumentInfo);
	
	public int deleteBiddDocumentInfo(String roleIds);
}
