package com.byzx.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.byzx.dao.DriverInfoDao;
import com.byzx.model.UserInfo;
import com.byzx.service.DriverInfoInfoService;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/**@文件名: DriverInfoInfoServiceImpl.java
 * @类功能说明: 司机接口实现类
 * @作者: WangSiYuan
 * @Email: 1512972568@qq.com
 * @日期: 2019年11月1日下午5:14:08
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: WangSiYuan
 * 	 <li>日期: 2019年11月1日下午5:14:08</li> 
 *	 <li>内容: </li>
 * </pre>
 */
@Service
public class DriverInfoInfoServiceImpl implements DriverInfoInfoService {
	
	@Autowired
	private DriverInfoDao driverInfoDao;

	@Override
	public JSONArray findAllDriverInfo(Map<String, Object> map) {
		List<UserInfo> driverInfoList=driverInfoDao.findAllDriverInfo(map);
		JSONArray jsonArray=new JSONArray();
		for(int i=0;i<driverInfoList.size();i++) {
			JSONObject jsonOBject=new JSONObject();
			UserInfo driverInfo=driverInfoList.get(i);
			jsonOBject.put("user_id", driverInfo.getUser_id());
			jsonOBject.put("user_name", driverInfo.getUser_name());
			jsonOBject.put("user_pwd", driverInfo.getUser_pwd());
			jsonOBject.put("user_phone", driverInfo.getUser_phone());
			jsonOBject.put("user_idCard", driverInfo.getUser_idCard());
			jsonOBject.put("role_id", driverInfo.getRole_id());
			jsonOBject.put("state", driverInfo.getState());
			jsonOBject.put("delflag", driverInfo.getDelflag());
			jsonOBject.put("createtime", driverInfo.getCreatetime());
			jsonOBject.put("remark", driverInfo.getRemark());
			jsonOBject.put("opt_id", driverInfo.getOpt_id());
			jsonArray.add(jsonOBject);
		}
		return jsonArray;
	}

	@Override
	public int findAllDriverInfoCount(Map<String, Object> map) {
		
		return driverInfoDao.findAllDriverInfoCount(map);
	}
}
