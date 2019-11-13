package com.byzx.service.impl;

import java.util.Date;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.byzx.dao.OrderInfoHgyDao;
import com.byzx.model.OrderInfoHgy;
import com.byzx.service.OrderInfoHgyService;
import com.byzx.util.DateUtil;

/**@文件名: OrderInfoServiceImpl.java
 * @类功能说明: 
 * @作者: HeGuangYao
 * @Email: 105302097@qq.com
 * @日期: 2019年11月1日下午2:57:33
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: HeGuangYao</li> 
 * 	 <li>日期: 2019年11月1日下午2:57:33</li> 
 *	 <li>内容: </li>
 * </pre>
 */
@Service
public class OrderInfoHgyServiceImpl implements OrderInfoHgyService {

	@Autowired
	private OrderInfoHgyDao orderInfoDao;
	@Override
	public int addOrderInfo(OrderInfoHgy orderInfo) {
		orderInfo.setCreatetime(DateUtil.formatDate(new Date(), "yyyy-MM-dd HH:mm:ss"));
		orderInfo.setDelflag(0);
		orderInfo.setState(0);
		orderInfo.setO_time(orderInfo.getO_time()+"");
		return orderInfoDao.addOrderInfo(orderInfo);
	}

}
