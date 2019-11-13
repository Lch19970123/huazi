package com.byzx.service;

import java.util.Map;

import com.byzx.model.GoodsInfo;

import net.sf.json.JSONArray;

/**@文件名: GoodsInfoService.java
 * @类功能说明: 
 * @作者: LiuChunHui
 * @Email: 508499598@qq.com
 * @日期: 2019年10月30日上午10:43:06
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: LiuChunHui</li> 
 * 	 <li>日期: 2019年10月30日上午10:43:06</li> 
 *	 <li>内容: </li>
 * </pre>
 */
public interface GoodsInfoService {

	public JSONArray findAllGoodsInfo(Map<String,Object> map);
	
	public int findAllGoodsInfoCount(Map<String,Object> map);
	
	public int saveGoodsInfo(GoodsInfo goodsInfo);
	
	public int updateGoodsInfo(GoodsInfo goodsInfo);
	
	public int deleteGoodsInfo(String goodsIds);
	
	public int findGoodsInfoByGCode(String g_code);

	public JSONArray findAllGoodsId();
}
