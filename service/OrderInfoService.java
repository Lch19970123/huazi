package com.byzx.service;

import java.util.Map;

import com.byzx.model.OrderInfo;

import net.sf.json.JSONArray;

/**@文件名: OrderInfoService.java
 * @类功能说明: 
 * @作者: WangSiYuan
 * @Email: 1512972568@qq.com
 * @日期: 2019年11月2日上午11:48:12
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: WangSiYuan
 * 	 <li>日期: 2019年11月2日上午11:48:12</li> 
 *	 <li>内容: </li>
 * </pre>
 */
public interface OrderInfoService {

	public JSONArray findAllOrderInfo(Map<String,Object> map);
	
	public int findAllOrderInfoCount(Map<String,Object> map);
	
	public int saveOrderInfo(OrderInfo orderInfo);
	
	public int updateOrderInfo(OrderInfo orderInfo);
	
	public int deleteOrderInfo(String orderIds);
	
	
}



