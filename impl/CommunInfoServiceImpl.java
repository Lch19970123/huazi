package com.byzx.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.byzx.dao.BuildInfoDao;
import com.byzx.dao.CommunInfoDao;
import com.byzx.model.BuildInfo;
import com.byzx.model.CollectorInfo;
import com.byzx.model.CommunInfo;
import com.byzx.model.RecycleStationInfo;
import com.byzx.service.CommunInfoService;
import com.byzx.util.DateUtil;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/**@文件名: CommunInfoServiceImpl.java
 * @类功能说明: 
 * @作者: LiuChunHui
 * @Email: 508499598@qq.com
 * @日期: 2019年10月31日上午9:53:14
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: LiuChunHui</li> 
 * 	 <li>日期: 2019年10月31日上午9:53:14</li> 
 *	 <li>内容: </li>
 * </pre>
 */
@Service
public class CommunInfoServiceImpl implements CommunInfoService {

	@Autowired
	private CommunInfoDao communInfoDao;
	
	@Autowired
	private BuildInfoDao buildInfoDao;
	
	@Override
	public JSONArray findAllCommunInfo() {
		List<CommunInfo> communInfos=communInfoDao.findAllCommunInfo();
		JSONArray jsonArray=new JSONArray();
		for(int i=0;i<communInfos.size();i++) {
			JSONObject jsonObject=new JSONObject();
			jsonObject.put("cm_id", communInfos.get(i).getCm_id());
			jsonObject.put("cm_rsid", communInfos.get(i).getRsid());
			jsonObject.put("cm_address", communInfos.get(i).getCm_address());
			jsonObject.put("cm_name", communInfos.get(i).getCm_name());
			jsonObject.put("cm_point", communInfos.get(i).getCm_point());
			jsonObject.put("cm_area", communInfos.get(i).getCm_area());
			jsonObject.put("cm_range", communInfos.get(i).getCm_range());
			jsonObject.put("state", communInfos.get(i).getState());
			jsonObject.put("bidding", communInfos.get(i).getBidding());
			jsonObject.put("cm_population", communInfos.get(i).getCm_population());
			jsonObject.put("delflag", communInfos.get(i).getDelflag());
			jsonObject.put("opt_id", communInfos.get(i).getOptid());
			jsonObject.put("cm_remark", communInfos.get(i).getCm_remark());
			List<CollectorInfo> collectorInfo=communInfos.get(i).getCollectorInfo();
			JSONArray jsonArr1=new JSONArray();
			for(int j=0;j<collectorInfo.size();j++) {
				JSONObject jsonObjec1=new JSONObject();
				jsonObjec1.put("c_ucid", collectorInfo.get(j).getC_ucid());
				jsonObjec1.put("state", collectorInfo.get(j).getState());
				jsonObjec1.put("c_uid", collectorInfo.get(j).getC_uid());
				jsonObjec1.put("c_type", collectorInfo.get(j).getC_type());
				jsonObjec1.put("coord", collectorInfo.get(j).getCoord());
				jsonObjec1.put("remark", collectorInfo.get(j).getRemark());
				jsonArr1.add(jsonObjec1);
				System.out.println("******************"+jsonObjec1);
			};
			jsonObject.put("collectorInfo", jsonArr1);
			jsonArray.add(jsonObject);
		}
		return jsonArray;
	}
	
	@Override
	public JSONArray findAllCommunInfoName() {
		List<CommunInfo> communInfos=communInfoDao.findAllCommunInfoName();
		JSONArray jsonArray=new JSONArray();
		for(int i=0;i<communInfos.size();i++) {
			JSONObject jsonObject=new JSONObject();
			jsonObject.put("cm_id", communInfos.get(i).getCm_id());
			jsonObject.put("cm_name", communInfos.get(i).getCm_name());
			/*jsonObject.put("cm_rsid", communInfos.get(i).getRsid());
			jsonObject.put("cm_address", communInfos.get(i).getCm_address());*/
			/*jsonObject.put("cm_point", communInfos.get(i).getCm_point());
			jsonObject.put("cm_area", communInfos.get(i).getCm_area());
			jsonObject.put("cm_range", communInfos.get(i).getCm_range());
			jsonObject.put("state", communInfos.get(i).getState());
			jsonObject.put("bidding", communInfos.get(i).getBidding());
			jsonObject.put("cm_population", communInfos.get(i).getCm_population());
			jsonObject.put("delflag", communInfos.get(i).getDelflag());
			jsonObject.put("opt_id", communInfos.get(i).getOptid());
			jsonObject.put("cm_remark", communInfos.get(i).getCm_remark());
			List<CollectorInfo> collectorInfo=communInfos.get(i).getCollectorInfo();
			JSONArray jsonArr1=new JSONArray();
			for(int j=0;j<collectorInfo.size();j++) {
				JSONObject jsonObjec1=new JSONObject();
				jsonObjec1.put("c_ucid", collectorInfo.get(j).getC_ucid());
				jsonObjec1.put("state", collectorInfo.get(j).getState());
				jsonObjec1.put("c_uid", collectorInfo.get(j).getC_uid());
				jsonObjec1.put("c_type", collectorInfo.get(j).getC_type());
				jsonObjec1.put("coord", collectorInfo.get(j).getCoord());
				jsonObjec1.put("remark", collectorInfo.get(j).getRemark());
				jsonArr1.add(jsonObjec1);
				System.out.println("******************"+jsonObjec1);
			};
			jsonObject.put("collectorInfo", jsonArr1);*/
			jsonArray.add(jsonObject);
		}
		return jsonArray;
	}

	@Override
	public JSONObject findAllCommunInfoByPoint(String cm_point) {
		CommunInfo communInfos=communInfoDao.findAllCommunInfoByPoint(cm_point);
		JSONObject jsonObject=new JSONObject();
		jsonObject.put("cm_id", communInfos.getCm_id());
		jsonObject.put("rsid", communInfos.getRsid());
		jsonObject.put("cm_address", communInfos.getCm_address());
		jsonObject.put("cm_name", communInfos.getCm_name());
		jsonObject.put("cm_point", communInfos.getCm_point());
		jsonObject.put("cm_area", communInfos.getCm_area());
		jsonObject.put("cm_range", communInfos.getCm_range());
		jsonObject.put("state", communInfos.getState());
		jsonObject.put("bidding", communInfos.getBidding());
		jsonObject.put("cm_population", communInfos.getCm_population());
		jsonObject.put("delflag", communInfos.getDelflag());
		jsonObject.put("opt_id", communInfos.getOptid());
		jsonObject.put("cm_remark", communInfos.getCm_remark());
		List<BuildInfo> buildInfos=communInfos.getBuildInfo();
		JSONArray jsonArr1=new JSONArray();
		for(int j=0;j<buildInfos.size();j++) {
			JSONObject jsonObjec1=new JSONObject();
			jsonObjec1.put("b_id", buildInfos.get(j).getB_id());
			jsonObjec1.put("cm_id", buildInfos.get(j).getCm_id());
			jsonObjec1.put("b_unit", buildInfos.get(j).getB_unit());
			jsonObjec1.put("b_floor", buildInfos.get(j).getB_floor());
			jsonObjec1.put("b_population", buildInfos.get(j).getB_population());
			jsonObjec1.put("state", buildInfos.get(j).getState());
			jsonObjec1.put("delflag", buildInfos.get(j).getDelflag());
			jsonObjec1.put("optime", buildInfos.get(j).getOptime());
			jsonObjec1.put("optid", buildInfos.get(j).getOptid());
			jsonObjec1.put("remark", buildInfos.get(j).getRemark());
			jsonArr1.add(jsonObjec1);
			
		};
		jsonObject.put("buildInfo", jsonArr1);
		return jsonObject;
	}

	@Override
	public int saveCommunInfo(CommunInfo communInfo) {
		communInfo.setCreatTime(DateUtil.formatDate(new Date(), "yyyy-MM-dd HH:mm:ss"));
		communInfo.setBidding("是");
		communInfo.setDelflag(0);
		communInfo.setState(0);
		int result = communInfoDao.saveCommunInfo(communInfo);
		if(result>0) {
			int maxCm_id = communInfoDao.getCommunInfoMaxId();
			List<BuildInfo> buildInfos = communInfo.getBuildInfo();
			for(int i = 0;i<buildInfos.size();i++) {
				
				BuildInfo buildInfo = buildInfos.get(i);
				buildInfo.setOptime(DateUtil.formatDate(new Date(), "yyyy-MM-dd hh:mm:ss"));
				buildInfo.setCm_id(maxCm_id);
				buildInfo.setDelflag(0);
				buildInfo.setState(0);
				buildInfo.setOptid(communInfo.getOptid());
				buildInfoDao.addBuildInfo(buildInfo);
			}
		}
		return result;
	}

	@Override
	public JSONArray findRecycleNames() {
		List<RecycleStationInfo> standbyInfos=communInfoDao.findRecycleNames();
		JSONArray jsonArray=new JSONArray();
		for(int i=0;i<standbyInfos.size();i++) {
			JSONObject jsonObject=new JSONObject();
			jsonObject.put("rsid", standbyInfos.get(i).getRsid());
			jsonObject.put("rsname", standbyInfos.get(i).getRsname());
			jsonArray.add(jsonObject);
		}
		return jsonArray;
	}

	@Override
	public int deleteCommunInfo(int cm_id) {
		int result=communInfoDao.deleteCommunInfo(cm_id);
		if(result>0) {
			buildInfoDao.deleteBuildInfo(cm_id);
		}
		return result;
	}

	@Override
	public int updateCommunInfo(CommunInfo communInfo) {
		int result=communInfoDao.updateCommunInfo(communInfo);
		if(result>0) {
			List<BuildInfo> oldBDS = buildInfoDao.findAllBuildInfo(communInfo.getCm_id());
			List<BuildInfo> newBDS = communInfo.getBuildInfo();
			if(oldBDS!=null) {
				for(BuildInfo oldBD:oldBDS) {
					boolean flag=true;
					if(newBDS!=null) {
						for(BuildInfo newBD:newBDS) {
							if(newBD.getB_id()!=null && newBD.getB_id()==oldBD.getB_id()) {
								flag=false;
							}
						}
					}
					if(flag) {
						buildInfoDao.deleteBuildInfoById(oldBD.getB_id());
					}
				}
			}
			if(newBDS!=null) {
				for(BuildInfo newBD:newBDS) {
					if(newBD.getB_id()!=null) {
						buildInfoDao.updateBuildInfo(newBD);
						
					}else  {
						newBD.setCm_id(communInfo.getCm_id());
						newBD.setOptime(DateUtil.formatDate(new Date(), "yyyy-MM-dd hh:mm:ss"));
						newBD.setDelflag(0);
						newBD.setState(0);
						newBD.setOptid(communInfo.getOptid());
						buildInfoDao.addBuildInfo(newBD);
					}
				}
			}
		
		
		}
		return result;
	}
	
}
