package com.byzx.service.impl;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.builder.ResultMapResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.byzx.dao.CollectorInfoDao;
import com.byzx.dao.CommunInfoDao;
import com.byzx.dao.GoodsInfoDao;
import com.byzx.dao.RecycleGoodsInfoDao;
import com.byzx.dao.RecycleStationInfoDao;
import com.byzx.dao.SortingStationInfoDao;
import com.byzx.dao.UserInfoDao;
import com.byzx.model.CollectorInfo;
import com.byzx.model.GoodsInfo;
import com.byzx.model.RecycleGoodsInfo;
import com.byzx.model.RecycleStationInfo;
import com.byzx.service.RecycleStationInfoService;
import com.byzx.util.DateUtil;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/**@鏂囦欢鍚�: RecycleStationInfoServiceImpl1.java
 * @绫诲姛鑳借鏄�: 
 * @浣滆��: BaiHaoJie
 * @Email: 596315150@qq.com
 * @鏃ユ湡: 2019骞�11鏈�2鏃ヤ笂鍗�10:38:41
 * @淇敼璇存槑:<br> 
 * <pre>
 * 	 <li>浣滆��: BaiHaoJie</li> 
 * 	 <li>鏃ユ湡: 2019骞�11鏈�2鏃ヤ笂鍗�10:38:41</li> 
 *	 <li>鍐呭: </li>
 * </pre>
 */
@Service
public class RecycleStationInfoServiceImpl implements  RecycleStationInfoService{

	@Autowired
	private RecycleStationInfoDao recycleStationInfoDao;

	@Autowired
	private RecycleGoodsInfoDao recycleGoodsInfoDao;
	
	@Autowired
	private SortingStationInfoDao sortStationInfoDao;
	
	@Autowired
	private GoodsInfoDao goodsInfoDao;
	
	@Autowired
	private	UserInfoDao userInfoDao;
	
	@Autowired
	private CollectorInfoDao collectorInfoDao;
	
	@Autowired
	private CommunInfoDao communInfoDao;
	@Override
	public JSONArray findAllRecycle() {
		JSONArray jsonArray = new JSONArray();
		List<RecycleStationInfo> recycleStationInfo = recycleStationInfoDao.findAllRecycle();
		JSONObject jsonObject = new JSONObject();
		for(int i=0;i<recycleStationInfo.size();i++) {
			jsonObject.put("rs_id", recycleStationInfo.get(i).getRsid());
			jsonObject.put("ss_id", recycleStationInfo.get(i).getRsid());
			jsonObject.put("ss_name", recycleStationInfo.get(i).getRsname());
			jsonObject.put("address", recycleStationInfo.get(i).getAddress());
			jsonObject.put("scope", recycleStationInfo.get(i).getScope());
			jsonObject.put("opt_id", recycleStationInfo.get(i).getOptid());
			jsonObject.put("optime", recycleStationInfo.get(i).getOptime());
			jsonObject.put("remark", recycleStationInfo.get(i).getRemark());
			jsonObject.put("volume", recycleStationInfo.get(i).getVolume());
			jsonArray.add(jsonObject);
		}
		return jsonArray;
	}

	@Override
	public JSONArray findRecycleByAddress(String recycle_address) {
		JSONArray jsonArray = new JSONArray();
		List<RecycleStationInfo> recycleStationInfo = recycleStationInfoDao.findRecycleByAddress(recycle_address);
		JSONObject jsonObject = new JSONObject();
		for(int i=0;i<recycleStationInfo.size();i++) {
			System.out.println(recycleStationInfo.get(i).getAddress());
			jsonObject.put("rsid", recycleStationInfo.get(i).getRsid());
			jsonObject.put("rsname", recycleStationInfo.get(i).getRsname());
			jsonObject.put("address", recycleStationInfo.get(i).getAddress());
			jsonObject.put("scope", recycleStationInfo.get(i).getScope());
			System.out.println(recycleStationInfo.get(i).getSs_id()+"???????????????????");
			String ss_name = sortStationInfoDao.findSortStationNameById(recycleStationInfo.get(i).getSs_id());
			jsonObject.put("ss_name", ss_name);
			jsonObject.put("opt_id", recycleStationInfo.get(i).getOptid());
			jsonObject.put("optime", recycleStationInfo.get(i).getOptime());
			jsonObject.put("remark", recycleStationInfo.get(i).getRemark());
			System.out.println(recycleStationInfo.get(i).getRsid()+"!!!!!!!!!!!!!!!!!!!!!!");
			String plot_name = communInfoDao.findCommunNameById(recycleStationInfo.get(i).getRsid());
			jsonObject.put("plot_name", plot_name);
			List<RecycleGoodsInfo> recycleGoodsInfo = recycleStationInfo.get(i).getRecycleGoodsInfo();
			List<CollectorInfo> collectorInfo = recycleStationInfo.get(i).getCollectorInfo();
			JSONArray jsonArray1 = new JSONArray();
			for(int j=0;j<recycleGoodsInfo.size();j++) {
				JSONObject jsonObject1 = new JSONObject();
				GoodsInfo g_name = goodsInfoDao.findGoodsNameById(recycleGoodsInfo.get(j).getSg_gid());
				jsonObject1.put("g_name", g_name.getG_name());
				jsonObject1.put("sg_gid",recycleGoodsInfo.get(j).getSg_gid());
				jsonObject1.put("allocation_num", recycleGoodsInfo.get(j).getAllocation_num());
				jsonObject1.put("use_num", recycleGoodsInfo.get(j).getUse_num());
				jsonObject1.put("inventory_num", recycleGoodsInfo.get(j).getInventory_num());
				jsonObject1.put("scrap_num", recycleGoodsInfo.get(j).getScrap_num());
				jsonObject1.put("remark", recycleGoodsInfo.get(j).getRemark());
				jsonArray1.add(jsonObject1);
			}
			JSONArray jsonArray2 = new JSONArray();
			for(int k=0;k<collectorInfo.size();k++) {
				JSONObject jsonObject2 = new JSONObject();
				String userName = userInfoDao.findNameById(collectorInfo.get(k).getUser_id());
				jsonObject2.put("c_ucid",collectorInfo.get(k).getC_ucid());
				jsonObject2.put("collector_name", userName);
				jsonObject2.put("state", collectorInfo.get(k).getState());
				jsonObject2.put("c_type", collectorInfo.get(k).getC_type());
				jsonObject2.put("user_id", collectorInfo.get(k).getUser_id());
				jsonObject2.put("remark", collectorInfo.get(k).getRemark());
				jsonArray2.add(jsonObject2);
			}
			jsonObject.put("recycleGoodsInfo", jsonArray1);
			jsonObject.put("collectorInfo", jsonArray2);
			jsonArray.add(jsonObject);
		}
		return jsonArray;
	}

	@Override
	public int saveRecycleInfo(RecycleStationInfo recycleStationInfo) {
		int rsid = Integer.parseInt(recycleStationInfo.getPlot_name());
		int ss_id = Integer.parseInt(recycleStationInfo.getSs_name());
		recycleStationInfo.setSs_id(ss_id);
		recycleStationInfo.setRsid(rsid);
		recycleStationInfo.setDate(DateUtil.formatDate(new Date(), "yyyy-MM-dd hh:mm:ss"));
		recycleStationInfo.setOptime(DateUtil.formatDate(new Date(), "yyyy-MM-dd hh:mm:ss"));
		recycleStationInfo.setState(0);
		recycleStationInfo.setVolume(10000);
		recycleStationInfo.setDelflag(0);
		List<CollectorInfo> collectorInfoList = recycleStationInfo.getCollectorInfo();
		String c_ucid="";
		for(int i=0;i<collectorInfoList.size();i++) {
			c_ucid+=collectorInfoList.get(i).getUser_id();
		}
		System.out.println(c_ucid+"..............333333333");
		recycleStationInfo.setC_ucid(c_ucid);
		int result = recycleStationInfoDao.saveRecycleInfo(recycleStationInfo);
		if(result>0) {
			int maxrs__id = recycleStationInfoDao.getrecycleStationInfoMaxId();
			for(int i = 0;i<collectorInfoList.size();i++) {
				CollectorInfo collectorInfo = collectorInfoList.get(i);
				collectorInfo.setOptime(DateUtil.formatDate(new Date(), "yyyy-MM-dd hh:mm:ss"));
				collectorInfo.setC_rsid(maxrs__id);
				collectorInfo.setDelflag(0);
				collectorInfo.setOptid(recycleStationInfo.getOptid());
				collectorInfoDao.addCollectorInfo(collectorInfo);
			}
			List<RecycleGoodsInfo> recycleGoodsInfoList = recycleStationInfo.getRecycleGoodsInfo();
			for(int i = 0;i<recycleGoodsInfoList.size();i++) {
				RecycleGoodsInfo recycleGoodsInfo = recycleGoodsInfoList.get(i);
				recycleGoodsInfo.setOptime(DateUtil.formatDate(new Date(), "yyyy-MM-dd hh:mm:ss"));
				recycleGoodsInfo.setSg_id(maxrs__id);
				System.err.println(recycleGoodsInfo.getG_id()+"fbisdhbivhs1504404494646566+060569");
				Integer sg_gid = Integer.parseInt(recycleGoodsInfo.getG_name());
				recycleGoodsInfo.setSg_gid(sg_gid);
				recycleGoodsInfo.setDelflag(0);
				recycleGoodsInfo.setState(0);
				recycleGoodsInfo.setOptid(recycleStationInfo.getOptid());
				recycleGoodsInfoDao.addRecycleGoodsInfo(recycleGoodsInfo);
			}
		}
		return result;
	}

	@Override
	public int deleteRecycleInfo(int rsid){
		int result = recycleStationInfoDao.deleteRecycleInfo(rsid);
		if(result>0) {
			recycleGoodsInfoDao.deleteRecycleGoodsInfo(rsid);
			collectorInfoDao.deleteCollectorInfo(rsid);
		}
		return result;
	}
	
	@Override
	public int updateRecycleInfo(RecycleStationInfo recycleInfo){
		int result = recycleStationInfoDao.updateRecycleInfo(recycleInfo);
		if(result>0) {
			List<RecycleGoodsInfo> newRecycleGoodsInfo = recycleInfo.getRecycleGoodsInfo();
			List<RecycleGoodsInfo> oldRecycleGoodsInfo = recycleGoodsInfoDao.findAllRecycleGoodsInfo(recycleInfo.getRsid());
			List<CollectorInfo> oldCollectorInfo = collectorInfoDao.findAllCollectorInfo1(recycleInfo.getRsid());
			List<CollectorInfo> newCollectorInfo = recycleInfo.getCollectorInfo();
			if(oldCollectorInfo!=null) {
				for(CollectorInfo oldCollector:oldCollectorInfo) {
					boolean flag=true;
					if(newCollectorInfo!=null) {
						for(CollectorInfo newCollector:newCollectorInfo) {
							if(newCollector.getUser_id()!=null && newCollector.getUser_id()==oldCollector.getUser_id()) {
								flag=false;
							}
						}
					}
					if(flag) {
						collectorInfoDao.deleteCollectorInfo(oldCollector.getC_rsid());
					}
				}
			}
			if(newCollectorInfo!=null) {
				for(CollectorInfo newCollector:newCollectorInfo) {
					if(newCollector.getC_ucid()!=null) {
						collectorInfoDao.updataCollectorInfo(newCollector);
					}else {
						newCollector.setOptid(recycleInfo.getOptid());
						newCollector.setOptime(DateUtil.formatDate(new Date(), "yyyy-MM-dd hh:mm:ss"));
						newCollector.setDelflag(0);
						newCollector.setState(0);
						collectorInfoDao.addCollectorInfo(newCollector);
					}
				}
			}
			if(oldRecycleGoodsInfo!=null) {
				for(RecycleGoodsInfo oldRecycleGoods:oldRecycleGoodsInfo) {
					boolean flag=true;
					if(newRecycleGoodsInfo!=null) {
						for(RecycleGoodsInfo newRecycleGoods:newRecycleGoodsInfo) {
							if(newRecycleGoods.getSg_gid()!=null && newRecycleGoods.getSg_gid()==oldRecycleGoods.getSg_gid()) {
								flag=false;
							}
						}
					}
					if(flag) {
						recycleGoodsInfoDao.deleteRecycleGoodsInfo(oldRecycleGoods.getSg_id());
					}
				}
			}
			if(newRecycleGoodsInfo!=null) {
				for(RecycleGoodsInfo newRecycleGoods:newRecycleGoodsInfo) {
					if(newRecycleGoods.getSg_id()!=null) {
						recycleGoodsInfoDao.updateRecycleGoods(newRecycleGoods);
					}else {
						newRecycleGoods.setOptid(recycleInfo.getOptid());
						newRecycleGoods.setOptime(DateUtil.formatDate(new Date(), "yyyy-MM-dd hh:mm:ss"));
						newRecycleGoods.setDelflag(0);
						newRecycleGoods.setState(0);
						recycleGoodsInfoDao.addRecycleGoodsInfo(newRecycleGoods);
					}
				}
			}
			
		}
		return result;
	}
}



















