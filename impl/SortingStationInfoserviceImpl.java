package com.byzx.service.impl;


import java.util.Date;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.byzx.dao.SortGoodsInfoDao;
import com.byzx.dao.SorterInfoDao;
import com.byzx.dao.SortingStationInfoDao;
import com.byzx.model.SortGoodsInfo;
import com.byzx.model.SorterInfo;
import com.byzx.model.SortingStationInfo;
import com.byzx.service.SortingStationInfoservice;
import com.byzx.util.DateUtil;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/**@�ļ���: SorterInfoImpl.java
 * @�๦��˵��: 
 * @����: LiuKaiWem
 * @Email: 1519960668@qq.com
 * @����: 2019��10��31������1:51:37
 * @�޸�˵��:<br> 
 * <pre>
 * 	 <li>����: LiuKaiWem</li> 
 * 	 <li>����: 2019��10��31������1:51:37</li> 
 *	 <li>����: </li>
 * </pre>
 */
@Service
public class SortingStationInfoserviceImpl implements SortingStationInfoservice {

	@Autowired
	private SortingStationInfoDao sortingStationInfoDao;
	
	@Autowired
	private SorterInfoDao sorterInfoDao;
	
	@Autowired
	private SortGoodsInfoDao sortGoodsInfoDao;
	

	@Override
	public JSONArray findAllSortingStation() {
		List<SortingStationInfo> sortingStationInfoDaoList= sortingStationInfoDao.findAllSortingStation();
		JSONArray jsonArray =new JSONArray();
		for (int i = 0; i < sortingStationInfoDaoList.size(); i++) {
			JSONObject jsonObject =new JSONObject();
			jsonObject.put("ss_id", sortingStationInfoDaoList.get(i).getSs_id());
			jsonObject.put("s_usid", sortingStationInfoDaoList.get(i).getS_usid());
			jsonObject.put("ss_name", sortingStationInfoDaoList.get(i).getSs_name());
			jsonObject.put("sg_id", sortingStationInfoDaoList.get(i).getSg_id());
			jsonObject.put("rss_ids", sortingStationInfoDaoList.get(i).getRs_ids());
			jsonObject.put("ss_date", sortingStationInfoDaoList.get(i).getSs_date());
			jsonObject.put("ss_capacity", sortingStationInfoDaoList.get(i).getSs_capacity());
			jsonObject.put("ss_address", sortingStationInfoDaoList.get(i).getSs_address());
			jsonObject.put("ss_coordinate", sortingStationInfoDaoList.get(i).getSs_coordinate());
			jsonObject.put("remark", sortingStationInfoDaoList.get(i).getRemark());
			jsonObject.put("opt_id", sortingStationInfoDaoList.get(i).getOpt_id());
			jsonObject.put("optime", sortingStationInfoDaoList.get(i).getOptime());
			jsonArray.add(jsonObject);
	}
		return jsonArray;
	}
	
	
	@Override
	public JSONObject findAllSSByAddress(String ss_address) {
		SortingStationInfo sortingStationInfoDaoList= sortingStationInfoDao.findAllSSByAddress(ss_address);
		JSONObject jsonObject =new JSONObject();
			
			jsonObject.put("ss_id", sortingStationInfoDaoList.getSs_id());
			jsonObject.put("s_usid", sortingStationInfoDaoList.getS_usid());
			jsonObject.put("ss_name", sortingStationInfoDaoList.getSs_name());
			jsonObject.put("sg_id", sortingStationInfoDaoList.getSg_id());
			jsonObject.put("rss_ids", sortingStationInfoDaoList.getRs_ids());
			jsonObject.put("ss_date", sortingStationInfoDaoList.getSs_date());
			jsonObject.put("ss_capacity", sortingStationInfoDaoList.getSs_capacity());
			jsonObject.put("ss_address", sortingStationInfoDaoList.getSs_address());
			jsonObject.put("ss_coordinate", sortingStationInfoDaoList.getSs_coordinate());
			jsonObject.put("remark", sortingStationInfoDaoList.getRemark());
			jsonObject.put("opt_id", sortingStationInfoDaoList.getOpt_id());
			jsonObject.put("optime", sortingStationInfoDaoList.getOptime());
			
			List<SorterInfo> sorterInfoList= sortingStationInfoDaoList.getSorterInfo();
			JSONArray jsonArray1 =new JSONArray();
			for (int j = 0; j < sorterInfoList.size(); j++) {
				JSONObject jsonObject1 =new JSONObject();
				jsonObject1.put("s_usid", sorterInfoList.get(j).getS_usid());
				jsonObject1.put("sorter_workTop", sorterInfoList.get(j).getSorter_workTop());
				jsonObject1.put("sorter_busy", sorterInfoList.get(j).getSorter_busy());
				jsonObject1.put("sorter_work", sorterInfoList.get(j).getOpt_id());
				jsonObject1.put("opt_id", sorterInfoList.get(j).getOpt_id());
				jsonObject1.put("optime", sorterInfoList.get(j).getOptime());
				jsonObject1.put("remark", sorterInfoList.get(j).getRemark());
				jsonArray1.add(jsonObject1);
			}
			//�����ּ������ӱ�
			List<SortGoodsInfo> sortGoodsInfoList= sortingStationInfoDaoList.getSortGoodsInfo();
			JSONArray jsonArray2 =new JSONArray();
			for (int j = 0; j < sortGoodsInfoList.size(); j++) {
				JSONObject jsonObject2 =new JSONObject();
				jsonObject2.put("sg_id", sortGoodsInfoList.get(j).getSg_id());
				jsonObject2.put("allocation_num", sortGoodsInfoList.get(j).getAllocation_num());
				jsonObject2.put("inventory_num", sortGoodsInfoList.get(j).getInventory_num());
				jsonObject2.put("use_num", sortGoodsInfoList.get(j).getUse_num());
				jsonObject2.put("scrap_num", sortGoodsInfoList.get(j).getOpt_id());
				jsonObject2.put("opt_id", sortGoodsInfoList.get(j).getOpt_id());
				jsonObject2.put("optime", sortGoodsInfoList.get(j).getOptime());
				jsonObject2.put("remark", sortGoodsInfoList.get(j).getRemark());
				jsonArray2.add(jsonObject2);
			}
			jsonObject.put("sortGoodsInfo", jsonArray2);
			jsonObject.put("sorterInfo", jsonArray1);
		return jsonObject;
	}


	@Override
	public int addSortingStationInfo(SortingStationInfo sortingStationInfo) {
		sortingStationInfo.setSs_date(DateUtil.formatDate(new Date(),"yyyy-MM-dd hh:mm:ss"));
		sortingStationInfo.setSs_state(1);
		sortingStationInfo.setDelflag(0);
		int result =sortingStationInfoDao.addSortingStationInfo(sortingStationInfo);
		if (result>0) {
			int maxSS_id =sortingStationInfoDao.getSortingStationInfoMaxId();
			
			List<SorterInfo> sorterInfoList = sortingStationInfo.getSorterInfo();
			for (int i = 0; i < sorterInfoList.size(); i++) {
				SorterInfo sorterInfo=sorterInfoList.get(i);
				sorterInfo.setOptime(DateUtil.formatDate(new Date(),"yyyy-MM-dd hh:mm:ss"));
				sorterInfo.setSs_id(maxSS_id);
				sorterInfo.setDelflag(0);
				sorterInfo.setState(1);
				sorterInfo.setOpt_id(sortingStationInfo.getOpt_id());
				sorterInfoDao.addSorterInfo(sorterInfo);
			}
			//������ʱ��ӱ�
			List<SortGoodsInfo> sortGoodsInfoList = sortingStationInfo.getSortGoodsInfo();
			for (int i = 0; i < sortGoodsInfoList.size(); i++) {
				SortGoodsInfo sortGoodsInfo=sortGoodsInfoList.get(i);
				sortGoodsInfo.setOptime(DateUtil.formatDate(new Date(),"yyyy-MM-dd hh:mm:ss"));
				sortGoodsInfo.setDelflag(0);
				sortGoodsInfo.setOpt_id(sortingStationInfo.getOpt_id());
				sortGoodsInfoDao.addSortGoodsInfo(sortGoodsInfo);
			}
		}
		return result;
	}


	@Override
	public int deleteSortingStationInfo(int ss_id) {
		int resultDataInfo=sortingStationInfoDao.deleteSortingStationInfo(ss_id);
		/*if (resultDataInfo>0) {
			sorterInfoDao.deleteSorterInfo(ss_id);
			sortGoodsInfoDao.deleteSortGoodsInfo(ss_id);
		}*/
		return resultDataInfo;
	}


	@Override
	public int updateSortingStationInfo(SortingStationInfo sortingStationInfo) {
		int result=sortingStationInfoDao.updateSortingStationInfo(sortingStationInfo);
		if (result>0) {
			List<SorterInfo> oldSortInfoList= sorterInfoDao.findAllSSByAddress(sortingStationInfo.getSs_id());
			List<SorterInfo> newSortInfoList=sortingStationInfo.getSorterInfo();
			if (oldSortInfoList!=null) {
				for (SorterInfo oldSorter:oldSortInfoList) {
					boolean flag = true;
					if (newSortInfoList!=null) {
						for (SorterInfo newSorter : newSortInfoList) {
							if (newSorter.getS_usid() != null && newSorter.getS_usid()==oldSorter.getS_usid()) {
								flag=false;
							}
						}
					}
					if (flag) {
						sorterInfoDao.deleteSorterInfoBySs_id(oldSorter.getS_usid());
					}
				}
			}
			if (newSortInfoList!=null) {
				for (SorterInfo newSorter : newSortInfoList) {
					if (newSorter.getS_usid()!=null) {
						sorterInfoDao.updateSorterInfoBySs_id(newSorter);
					}else {
						newSorter.setSs_id(sortingStationInfo.getSs_id());
						newSorter.setOptime(DateUtil.formatDate(new Date(),"yyyy-MM-dd hh:mm:ss"));
						newSorter.setDelflag(0);
						newSorter.setState(0);
						newSorter.setOpt_id(sortingStationInfo.getOpt_id());
						sorterInfoDao.addSorterInfo(newSorter);
					}
				}
			}
			
			
			//�����ӱ�
			List<SortGoodsInfo> oldSortGoodsInfoList=sortGoodsInfoDao.findAllSSByAddress(sortingStationInfo.getSs_id());
			List<SortGoodsInfo> newSortGoodsInfoList=sortingStationInfo.getSortGoodsInfo();
			if (oldSortGoodsInfoList!=null) {
				for (SortGoodsInfo oldSortGoodsInfo : oldSortGoodsInfoList) {
					boolean flag = true;
					if (newSortGoodsInfoList!=null) {
						for (SortGoodsInfo newSortGoodsInfo : newSortGoodsInfoList) {
							if (newSortGoodsInfo.getSg_id() != null && newSortGoodsInfo.getSg_id()==oldSortGoodsInfo.getSg_id()) {
								flag=false;
							}
						}
					}
					if (flag) {
						sortGoodsInfoDao.deleteSortGoodsInfoBySs_id(oldSortGoodsInfo.getSg_id());
					}
				}
			}
			if (newSortGoodsInfoList!=null) {
				for (SortGoodsInfo newSortGoodsInfo : newSortGoodsInfoList) {
					if (newSortGoodsInfo.getSg_id()!=null) {
						sortGoodsInfoDao.updateSortGoodsInfoBySs_id(newSortGoodsInfo);
					}else {
						newSortGoodsInfo.setSs_id(sortingStationInfo.getSs_id());
						newSortGoodsInfo.setOptime(DateUtil.formatDate(new Date(),"yyyy-MM-dd hh:mm:ss"));
						newSortGoodsInfo.setDelflag(0);
						newSortGoodsInfo.setOpt_id(sortingStationInfo.getOpt_id());
						sortGoodsInfoDao.addSortGoodsInfo(newSortGoodsInfo);
					}
				}
			}
			
		}
		return result;
	}

	@Override
	public JSONArray findSortStationNames() {
		JSONArray jsonArray = new JSONArray();
		List<SortingStationInfo> sortStationInfo = sortingStationInfoDao.findSortStationNames();
		JSONObject jsonObject = new JSONObject();
		for(int i=0;i<sortStationInfo.size();i++) {
			jsonObject.put("ss_id", sortStationInfo.get(i).getSs_id());
			System.out.println(sortStationInfo.get(i).getSs_id()+"000000000000");
			jsonObject.put("ss_name", sortStationInfo.get(i).getSs_name());
			/*jsonObject.put("ss_date", sortStationInfo.get(i).getSs_date());
			jsonObject.put("opt_id", sortStationInfo.get(i).getOptid());
			jsonObject.put("optime", sortStationInfo.get(i).getOptime());
			jsonObject.put("ss_state", sortStationInfo.get(i).getSs_state());
			jsonObject.put("remark", sortStationInfo.get(i).getRemark());*/
			jsonArray.add(jsonObject);
		}
		return jsonArray;
	}
	
}