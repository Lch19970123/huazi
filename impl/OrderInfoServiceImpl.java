package com.byzx.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.byzx.dao.OrderInfoDao;
import com.byzx.model.OrderInfo;
import com.byzx.service.OrderInfoService;
import com.byzx.util.DateUtil;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/**@文件名: OrderInfoServiceImpl.java
 * @类功能说明: 
 * @作者: WangSiYuan
 * @Email: 1512972568@qq.com
 * @日期: 2019年11月2日上午11:50:37
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: WangSiYuan
 * 	 <li>日期: 2019年11月2日上午11:50:37</li> 
 *	 <li>内容: </li>
 * </pre>
 */
@Service
public class OrderInfoServiceImpl implements OrderInfoService {
	
	@Autowired
	private OrderInfoDao orderInfoDao;

	@Override
	public JSONArray findAllOrderInfo(Map<String, Object> map) {
		List<OrderInfo> orderList=orderInfoDao.findAllUserInfo(map);
		JSONArray jsonArray = new JSONArray();
		for(int i=0;i<orderList.size();i++) {
			JSONObject jsonObject=new JSONObject();
			OrderInfo orderInfo=orderList.get(i);
			jsonObject.put("oid", orderInfo.getOid());
			jsonObject.put("odid", orderInfo.getOdid());
			jsonObject.put("o_uid", orderInfo.getO_uid());
			jsonObject.put("r_nickname", orderInfo.getR_nickname());
			jsonObject.put("o_uaddress", orderInfo.getO_uaddress());
			jsonObject.put("createtime", orderInfo.getCreatetime());
			jsonObject.put("regenerant", orderInfo.getRegenerant());
			jsonObject.put("o_weight", orderInfo.getO_weight());
			jsonObject.put("receiving", orderInfo.getReceiving());
			jsonObject.put("o_clerkid", orderInfo.getO_clerkid());
			jsonObject.put("o_ucid", orderInfo.getO_ucid());
			jsonObject.put("o_money", orderInfo.getO_money());
			jsonObject.put("o_fintime", orderInfo.getO_fintime());
			jsonObject.put("delflag", orderInfo.getDelflag());
			jsonObject.put("optid", orderInfo.getOptid());
			jsonObject.put("optime", orderInfo.getOptime());
			jsonObject.put("remark", orderInfo.getRemark());
			jsonArray.add(jsonObject);
		}
		return jsonArray;
	}

	@Override
	public int findAllOrderInfoCount(Map<String, Object> map) {
		return orderInfoDao.findAllOrderInfoCount(map);
	}

	@Override
	public int saveOrderInfo(OrderInfo orderInfo) {
		orderInfo.setCreatetime(DateUtil.formatDate(new Date(), "yyyy-MM-dd hh:mm:ss"));
		orderInfo.setOptime(DateUtil.formatDate(new Date(), "yyyy-MM-dd hh:mm:ss"));
		orderInfo.setDelflag(0);
		orderInfo.setReceiving(1);
		orderInfo.setO_uid(orderInfoDao.findRidByNickname(orderInfo.getR_nickname()));
		return orderInfoDao.saveOrderInfo(orderInfo);
	}

	@Override
	public int updateOrderInfo(OrderInfo orderInfo) {
		return orderInfoDao.updateOrderInfo(orderInfo);
	}

	@Override
	public int deleteOrderInfo(String orderIds) {
		String oid[]=orderIds.split(",");
		int count=0;
		for(int i=0;i<oid.length;i++) {
			orderInfoDao.deleteOrderInfo(Integer.parseInt(oid[i]));
			count++;
		}
		return count;
	}

}
