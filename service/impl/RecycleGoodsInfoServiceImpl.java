package com.byzx.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.byzx.dao.RecycleGoodsInfoDao;
import com.byzx.model.RecycleGoodsInfo;
import com.byzx.service.RecycleGoodsInfoService;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/**@鏂囦欢鍚�: GoodsInfoServiceImpl.java
 * @绫诲姛鑳借鏄�: 
 * @浣滆��: BaiHaoJie
 * @Email: 596315150@qq.com
 * @鏃ユ湡: 2019骞�11鏈�4鏃ヤ笂鍗�10:18:03
 * @淇敼璇存槑:<br> 
 * <pre>
 * 	 <li>浣滆��: BaiHaoJie</li> 
 * 	 <li>鏃ユ湡: 2019骞�11鏈�4鏃ヤ笂鍗�10:18:03</li> 
 *	 <li>鍐呭: </li>
 * </pre>
 */
@Service
public class RecycleGoodsInfoServiceImpl implements RecycleGoodsInfoService {

	@Autowired
	private RecycleGoodsInfoDao recycleGoodsInfoDao;
	
	@Override
	public JSONArray findAllRecycleGoodsId() {
		List<RecycleGoodsInfo>  recycleGoodsInfoId = recycleGoodsInfoDao.findAllRecycleGoodsId();
		JSONArray jsonArray = new JSONArray();
		JSONObject jsonObject = new JSONObject();
		for(int i=0;i<recycleGoodsInfoId.size();i++) {
			jsonObject.put("sg_gid", recycleGoodsInfoId.get(i).getSg_gid());
			System.out.println(recycleGoodsInfoId.get(i).getSg_gid());
			jsonArray.add(jsonObject);
		}
		
		return jsonArray;
	}

}
