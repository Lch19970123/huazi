package com.byzx.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.byzx.dao.EnshrineInfoDao;
import com.byzx.model.EnshrineInfo;
import com.byzx.service.EnshrineInfoService;
import com.byzx.util.DateUtil;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/**@文件名: EnshrineInfoServiceImpl.java
 * @类功能说明: 
 * @作者: SongXinLei
 * @Email: 248382500@qq.com
 * @日期: 2019年10月31日下午3:20:49
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: SongXinLei</li> 
 * 	 <li>日期: 2019年10月31日下午3:20:49</li> 
 *	 <li>内容: </li>
 * </pre>
 */
@Service
public class EnshrineInfoServiceImpl implements EnshrineInfoService {


	@Autowired
	private EnshrineInfoDao enshrineInfoDao;
	

	@Override
	public JSONArray findAllEnshrineInfo(Map<String,Object> map) {
		List<EnshrineInfo> enshrineInfos=enshrineInfoDao.findEnshrineInfo(map);
		JSONArray jsonArray=new JSONArray();
		for(int i=0;i<enshrineInfos.size();i++) {
			JSONObject jsonObject=new JSONObject();
			jsonObject.put("warehous_id", enshrineInfos.get(i).getWarehous_id());
			jsonObject.put("warehous_name", enshrineInfos.get(i).getWarehous_name());
			jsonObject.put("classes", enshrineInfos.get(i).getClasses());
			jsonObject.put("weight", enshrineInfos.get(i).getWeight());
			jsonObject.put("s_usid", enshrineInfos.get(i).getS_usid());
			jsonObject.put("collect", enshrineInfos.get(i).getCollect());
			jsonObject.put("delflag", enshrineInfos.get(i).getDelflag());
			jsonObject.put("remark", enshrineInfos.get(i).getRemark());
			jsonObject.put("state", enshrineInfos.get(i).getState());
			jsonObject.put("opt_id", enshrineInfos.get(i).getOpt_id());
			jsonArray.add(jsonObject);
		}
		return jsonArray;
	}

	@Override
	public int findAllEnshrineInfoCount(Map<String,Object> map) {
		return enshrineInfoDao.findAllEnshrineInfoCount(map);
	}

	@Override
	public int saveEnshrineInfo(EnshrineInfo enshrineInfo) {
		enshrineInfo.setCollect(DateUtil.formatDate(new Date(), "yyyy-MM-dd HH:mm:ss"));
		enshrineInfo.setDelflag(0);
		enshrineInfo.setState(0);
		return enshrineInfoDao.saveEnshrineInfo(enshrineInfo);
	}

	@Override
	public int findEnshrineInfoByUName(String warehous_name) {
		return enshrineInfoDao.findEnshrineInfoByUName(warehous_name);
	}


	@Override
	public int deleteEnshrineInfo(String warehousIds) {
		String warehous_id[]=warehousIds.split(",");
		int count=0;
		for(int i=0;i<warehous_id.length;i++) {
			enshrineInfoDao.deleteEnshrineInfo(Integer.parseInt(warehous_id[i]));
			count++;
		}
		return count;
	}

	@Override
	public int updateEnshrineInfo(EnshrineInfo enshrineInfo) {
		return enshrineInfoDao.updateEnshrineInfo(enshrineInfo);
	}

	
}
