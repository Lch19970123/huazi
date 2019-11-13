package com.byzx.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.byzx.dao.ResidentInfoDao;
import com.byzx.model.ResidentInfo;
import com.byzx.service.ResidentInfoService;
import com.byzx.util.DateUtil;

/**@文件名: UserLoginServiceImpl.java
 * @类功能说明: 
 * @作者: HeGuangYao
 * @Email: 105302097@qq.com
 * @日期: 2019年10月30日下午12:12:02
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: HeGuangYao</li> 
 * 	 <li>日期: 2019年10月30日下午12:12:02</li> 
 *	 <li>内容: </li>
 * </pre>
 */
@Service
public class ResidentInfoServiceImpl implements ResidentInfoService {
	
	@Autowired
	private ResidentInfoDao residentInfoDao;

	@Override
	public ResidentInfo findResidentInfo(ResidentInfo residentInfo) {
		
		return residentInfoDao.findResidentInfo(residentInfo);
	}

	@Override
	public int findResidentInfoByName(String r_name) {
		return residentInfoDao.findResidentInfoByName(r_name);
	}

	@Override
	public int insertResidentInfo(ResidentInfo residentInfo) {
		residentInfo.setRegdata(DateUtil.formatDate(new Date(), "yyyy-MM-dd HH:mm:ss"));
		residentInfo.setDelflag(0);
		residentInfo.setState(0);
		return residentInfoDao.insertResidentInfo(residentInfo);
	}

	


}
