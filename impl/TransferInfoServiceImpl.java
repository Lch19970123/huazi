package com.byzx.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.byzx.dao.DriverInfoDao;
import com.byzx.dao.TransferInfoDao;
import com.byzx.model.TransferInfo;
import com.byzx.util.DateUtil;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/**@文件名: TransferInfoService.java
 * @类功能说明: 
 * @作者: WangSiYuan
 * @Email: 1512972568@qq.com
 * @日期: 2019年10月30日下午3:46:55
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: WangSiYuan
 * 	 <li>日期: 2019年10月30日下午3:46:55</li> 
 *	 <li>内容: </li>
 * </pre>
 */
@Service
public class TransferInfoServiceImpl implements com.byzx.service.TransferInfoService {
	
	@Autowired
	private TransferInfoDao transferInfoDao;
	
	@Autowired
	private DriverInfoDao driverInfoDao;
	
	

	@Override
	public JSONArray findAllTransferInfo(Map<String, Object> map) {
		List<TransferInfo> transferInfoDaoList=transferInfoDao.findAllTransferInfo(map);
		JSONArray jsonArray=new JSONArray();
		for(int i=0;i<transferInfoDaoList.size();i++) {
			JSONObject jsonOBject=new JSONObject();
			TransferInfo transferInfo=transferInfoDaoList.get(i);
			jsonOBject.put("tid", transferInfo.getTid());
			jsonOBject.put("t_carid", transferInfo.getT_carid());
			jsonOBject.put("t_udid", transferInfo.getT_udid());
			jsonOBject.put("createtime", transferInfo.getCreatetime());
			jsonOBject.put("t_rsid", findIdByName(transferInfo.getRsname()));
			jsonOBject.put("rsname", transferInfo.getRsname());
			jsonOBject.put("t_ssid", transferInfo.getT_ssid());
			jsonOBject.put("depart_time", transferInfo.getDepart_time());
			jsonOBject.put("t_ueid", transferInfo.getT_ueid());
			jsonOBject.put("load", transferInfo.getLoad());
			jsonOBject.put("state", transferInfo.getState());
			jsonOBject.put("optid", transferInfo.getOptid());
			jsonOBject.put("optime", transferInfo.getOptime());
			jsonOBject.put("remark", transferInfo.getRemark());
			jsonArray.add(jsonOBject);
		}
		return jsonArray;
	}

	@Override
	public int findAllTransferInfoCount(Map<String, Object> map) {
		return transferInfoDao.findAllTransferInfoCount(map);
	}

	@Override
	public int saveTransferInfo(TransferInfo transferInfo) {
		transferInfo.setT_udid(driverInfoDao.findUdidByUsername(transferInfo.getUser_name()));
		transferInfo.setT_rsid(transferInfoDao.findIdByName(transferInfo.getRsname()));
		transferInfo.setT_ssid(transferInfoDao.findSsidByRsid(transferInfo.getT_rsid()));
		transferInfo.setCreatetime(DateUtil.formatDate(new Date(), "yyyy-MM-dd hh:mm:ss"));
		transferInfo.setOptime(DateUtil.formatDate(new Date(), "yyyy-MM-dd hh:mm:ss"));
		transferInfo.setUser_name(transferInfoDao.findUserNameByTudid(transferInfo.getT_udid()));
		transferInfo.setDelflag(0);
		transferInfo.setState(0);
		return transferInfoDao.saveTransferInfo(transferInfo);
	}

	@Override
	public int updateTransferInfo(TransferInfo transferInfo) {
		transferInfo.setT_udid(driverInfoDao.findUdidByUsername(transferInfo.getUser_name()));
		transferInfo.setT_rsid(transferInfoDao.findIdByName(transferInfo.getRsname()));
		transferInfo.setT_ssid(transferInfoDao.findSsidByRsid(transferInfo.getT_rsid()));
		transferInfo.setUser_name(transferInfoDao.findUserNameByTudid(transferInfo.getT_udid()));
		transferInfo.setOptime(DateUtil.formatDate(new Date(), "yyyy-MM-dd hh:mm:ss"));
		return transferInfoDao.updateTransferInfo(transferInfo);
	}

	@Override
	public int deleteTransferInfo(String transIds) {
		String tid[]=transIds.split(",");
		int count=0;
		for(int i=0;i<tid.length;i++) {
			transferInfoDao.deleteTransferInfo(Integer.parseInt(tid[i]));
			count++;
		}
		return count;
	}

	@Override
	public int findIdByName(String rsname) {
		
		return transferInfoDao.findIdByName(rsname);
	}
	
	

}
