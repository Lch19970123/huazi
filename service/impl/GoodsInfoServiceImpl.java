package com.byzx.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.byzx.dao.GoodsInfoDao;
import com.byzx.dao.UserInfoDao;
import com.byzx.model.GoodsInfo;
import com.byzx.model.UserInfo;
import com.byzx.service.GoodsInfoService;
import com.byzx.util.DateUtil;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/**@文件名: GoodsInfoServiceImpl.java
 * @类功能说明: 
 * @作者: LiuChunHui
 * @Email: 508499598@qq.com
 * @日期: 2019年10月30日上午10:45:46
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: LiuChunHui</li> 
 * 	 <li>日期: 2019年10月30日上午10:45:46</li> 
 *	 <li>内容: </li>
 * </pre>
 */
@Service
public class GoodsInfoServiceImpl implements GoodsInfoService {

	@Autowired
	private GoodsInfoDao goodsInfoDao;
	private Object 可用;
	private Object 不可用;
	
	@Override
	public JSONArray findAllGoodsInfo(Map<String, Object> map) {
		List<GoodsInfo> goodsInfos=goodsInfoDao.findAllGoodsInfo(map);
		JSONArray jsonArray=new JSONArray();
		for(int i=0;i<goodsInfos.size();i++) {
			JSONObject jsonObject=new JSONObject();
			jsonObject.put("g_id", goodsInfos.get(i).getG_id());
			jsonObject.put("g_code", goodsInfos.get(i).getG_code());
			jsonObject.put("g_name", goodsInfos.get(i).getG_name());
			jsonObject.put("g_gtid", goodsInfos.get(i).getG_gtid());
			jsonObject.put("g_price", goodsInfos.get(i).getG_price());
			jsonObject.put("g_model", goodsInfos.get(i).getG_model());
			jsonObject.put("g_format", goodsInfos.get(i).getG_format());
			jsonObject.put("g_qualitytime", goodsInfos.get(i).getG_qualitytime());
			jsonObject.put("g_stopflag", goodsInfos.get(i).getG_stopflag());
			jsonObject.put("g_deptid", goodsInfos.get(i).getG_deptid());
			jsonObject.put("gt_name", goodsInfos.get(i).getGt_name());
			jsonObject.put("g_stopflag", goodsInfos.get(i).getG_stopflag());
			jsonObject.put("remark", goodsInfos.get(i).getRemark());
			jsonArray.add(jsonObject);
		}
		return jsonArray;
	}

	@Override
	public int findAllGoodsInfoCount(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return goodsInfoDao.findAllGoodsInfoCount(map);
	}

	@Override
	public int saveGoodsInfo(GoodsInfo goodsInfo) {
		goodsInfo.setOptime(DateUtil.formatDate(new Date(), "yyyy-MM-dd HH:mm:ss"));
		goodsInfo.setDelflag(0);
		goodsInfo.setState(0);
		return goodsInfoDao.saveGoodsInfo(goodsInfo);
	}

	@Override
	public int updateGoodsInfo(GoodsInfo goodsInfo) {
		// TODO Auto-generated method stub
		return goodsInfoDao.updateGoodsInfo(goodsInfo);
	}

	@Override
	public int deleteGoodsInfo(String goodsIds) {
		String g_id[]=goodsIds.split(",");
		int count=0;
		for(int i=0;i<g_id.length;i++) {
			goodsInfoDao.deleteGoodsInfo(Integer.parseInt(g_id[i]));
			count++;
		}
		return count;
	}

	@Override
	public int findGoodsInfoByGCode(String g_code) {
		// TODO Auto-generated method stub
		return goodsInfoDao.findGoodsInfoByGCode(g_code);
	}

	//查找物资名称
	@Override
	public JSONArray findAllGoodsId() {
		JSONArray jsonArray = new JSONArray();
		JSONObject jsonObject = new JSONObject();
		List<GoodsInfo> goodsInfo = goodsInfoDao.findAllGoodsId();
		for(int i=0;i<goodsInfo.size();i++) {
			jsonObject.put("g_name", goodsInfo.get(i).getG_name());
			jsonObject.put("g_id", goodsInfo.get(i).getG_id());
			jsonArray.add(jsonObject);
		}
		return jsonArray;
	}
}
