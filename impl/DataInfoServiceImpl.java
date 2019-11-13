package com.byzx.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.byzx.dao.DataInfoDao;
import com.byzx.dao.DataDetailInfoDao;
import com.byzx.model.DataInfo;
import com.byzx.model.DataDetailInfo;
import com.byzx.service.DataInfoService;
import com.byzx.util.DateUtil;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/**@文件名: DataInfoServiceImp.java
 * @类功能说明: 
 * @作者: LiuChunHui
 * @Email: 508499598@qq.com
 * @日期: 2019年10月25日上午11:24:55
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: LiuChunHui</li> 
 * 	 <li>日期: 2019年10月25日上午11:24:55</li> 
 *	 <li>内容: </li>
 * </pre>
 */
@Service
public class DataInfoServiceImpl implements DataInfoService {
	
	@Autowired
	private DataInfoDao dataInfoDao;
	
	@Autowired
	private DataDetailInfoDao dataDetailInfoDao;

	@Override
	public JSONArray findAllDataInfo(Map<String, Object> map) {
		List<DataInfo> dataInfos=dataInfoDao.findAllDataInfo(map);
		JSONArray jsonArray=new JSONArray();
		for(int i=0;i<dataInfos.size();i++) {
			JSONObject jsonObject=new JSONObject();
			jsonObject.put("data_id", dataInfos.get(i).getData_id());
			jsonObject.put("data_name", dataInfos.get(i).getData_name());
			jsonObject.put("createtime", dataInfos.get(i).getCreatetime());
			jsonObject.put("remark", dataInfos.get(i).getRemark());
			List<DataDetailInfo> DatadetilInfo=dataInfos.get(i).getDataDetailInfo();
			
			JSONArray jsonArr1=new JSONArray();
			for(int j=0;j<DatadetilInfo.size();j++) {
				JSONObject jsonObjec1=new JSONObject();
				jsonObjec1.put("dataDet_id", DatadetilInfo.get(j).getDataDet_id());
				jsonObjec1.put("data_id", DatadetilInfo.get(j).getData_id());
				jsonObjec1.put("dataDet_name", DatadetilInfo.get(j).getDataDet_name());
				jsonObjec1.put("createtime", DatadetilInfo.get(j).getCreatetime());
				jsonObjec1.put("remark", DatadetilInfo.get(j).getRemark());
				jsonArr1.add(jsonObjec1);
				
			};
			jsonObject.put("dataDetailInfo", jsonArr1);
			jsonArray.add(jsonObject);
		}
		return jsonArray;
	}

	@Override
	public int findAllDataInfoCount(Map<String, Object> map) {
		return dataInfoDao.findAllDataInfoCount(map);
	}

	@Override
	public int addDataInfo(DataInfo dataInfo) {
		dataInfo.setCreatetime(DateUtil.formatDate(new Date(), "yyyy-MM-dd HH:mm:ss"));
		dataInfo.setDelflag(0);
		dataInfo.setState(0);
		int result = dataInfoDao.addDataInfo(dataInfo);
		if(result>0) {
			int maxData_id = dataInfoDao.getDataInfoMaxId();
			List<DataDetailInfo> dataDetailInfoList = dataInfo.getDataDetailInfo();
			System.out.println(dataDetailInfoList);
			for(int i = 0;i<dataDetailInfoList.size();i++) {
				
				DataDetailInfo dataDetailInfo = dataDetailInfoList.get(i);
				dataDetailInfo.setCreatetime(DateUtil.formatDate(new Date(), "yyyy-MM-dd hh:mm:ss"));
				dataDetailInfo.setData_id(maxData_id);
				dataDetailInfo.setDelflag(0);
				dataDetailInfo.setState(0);
				dataDetailInfo.setOpt_id(dataInfo.getOpt_id());
				dataDetailInfoDao.addDatadetilInfo(dataDetailInfo);
			}
		}

		return result;
	}

	@Override
	public int updateDataInfo(DataInfo dataInfo) {
		int result=dataInfoDao.updateDataInfo(dataInfo);
		if(result>0) {
			List<DataDetailInfo> oldDDS = dataDetailInfoDao.findAllDatadetilInfo(dataInfo.getData_id());
			List<DataDetailInfo> newDDS = dataInfo.getDataDetailInfo();
			if(oldDDS!=null) {
				for(DataDetailInfo oldDD:oldDDS) {
					boolean flag=true;
					if(newDDS!=null) {
						for(DataDetailInfo newDD:newDDS) {
							if(newDD.getDataDet_id()!=null && newDD.getDataDet_id()==oldDD.getDataDet_id()) {
								flag=false;
							}
						}
					}
					if(flag) {
						dataDetailInfoDao.deleteDataDetailInfoById(oldDD.getDataDet_id());
					}
				}
			}
			if(newDDS!=null) {
				for(DataDetailInfo newDD:newDDS) {
					if(newDD.getDataDet_id()!=null) {
						dataDetailInfoDao.updateDetailInfo(newDD);
						
					}else  {
						newDD.setData_id(dataInfo.getData_id());
						newDD.setCreatetime(DateUtil.formatDate(new Date(), "yyyy-MM-dd hh:mm:ss"));
						newDD.setDelflag(0);
						newDD.setState(0);
						newDD.setOpt_id(dataInfo.getOpt_id());
						dataDetailInfoDao.addDatadetilInfo(newDD);
					}
				}
			}
		
		
		}
		return result;
	}

	@Override
	public int deleteDataInfo(int data_id) {
		int result=dataInfoDao.deleteDataInfo(data_id);
		if(result>0) {
			dataDetailInfoDao.deleteDataInfo(data_id);
		}
		return result;
	}


	@Override
	public JSONArray findDataInfoByDId(int data_id) {
		List<DataDetailInfo> dataDetailInfoList=dataDetailInfoDao.findAllDataInfoDetail(data_id);
		JSONArray jsonArray = new JSONArray();
		for(int j=0;j<dataDetailInfoList.size();j++) {
			JSONObject jsonObject1 = new JSONObject();
			jsonObject1.put("detail_id", dataDetailInfoList.get(j).getDataDet_id());
			jsonObject1.put("data_id", dataDetailInfoList.get(j).getData_id());
			jsonObject1.put("detail_name", dataDetailInfoList.get(j).getDataDet_name());
			jsonObject1.put("createtime", dataDetailInfoList.get(j).getCreatetime());
			jsonObject1.put("opt_id", dataDetailInfoList.get(j).getOpt_id());
			jsonObject1.put("delflag", dataDetailInfoList.get(j).getDelflag());
			jsonObject1.put("state", dataDetailInfoList.get(j).getState());
			jsonObject1.put("remark", dataDetailInfoList.get(j).getRemark());
			jsonArray.add(jsonObject1);
		}
		return jsonArray;
	}
}

	
