package com.byzx.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.byzx.dao.CarInfoDao;
import com.byzx.model.CarInfo;
import com.byzx.service.CarInfoService;
import com.byzx.util.DateUtil;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/**@文件名: CarInfoServiceImpl.java
 * @类功能说明: 
 * @作者: ChongYangYang
 * @Email: 1103222824@qq.com
 * @日期: 2019年11月1日上午9:59:06
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: ChongYangYang</li> 
 * 	 <li>日期: 2019年11月1日上午9:59:06</li> 
 *	 <li>内容: </li>
 * </pre>
 */
@Service
public class CarInfoServiceImpl implements CarInfoService {

	@Autowired
	private CarInfoDao carInfoDao;
	
	@Override
	public JSONArray findAllCarInfo() {
		JSONArray jsonArray=new JSONArray();
		List<CarInfo> CarInfoList=carInfoDao.findAllCarInfo();
		JSONObject jsonObject = new JSONObject();
		for(int i=0;i<CarInfoList.size();i++) {
			jsonObject.put("c_carid", CarInfoList.get(i).getC_carid());
			jsonObject.put("c_number", CarInfoList.get(i).getC_number());
			jsonObject.put("c_location", CarInfoList.get(i).getC_location());
			jsonObject.put("c_capacity", CarInfoList.get(i).getC_capacity());
			jsonObject.put("c_state", CarInfoList.get(i).getC_state());
			jsonObject.put("d_id", CarInfoList.get(i).getD_id());
			jsonObject.put("remark", CarInfoList.get(i).getRemark());
			jsonArray.add(jsonObject);
		}
		return jsonArray;
	}

	@Override
	public JSONArray findThisCarInfo(String c_location) {
		JSONArray jsonArray=new JSONArray();
		List<CarInfo> CarInfoList1=carInfoDao.findThisCarInfo(c_location);
		JSONObject jsonObject = new JSONObject();
		for(int i=0;i<CarInfoList1.size();i++) {
			jsonObject.put("c_carid", CarInfoList1.get(i).getC_carid());
			jsonObject.put("c_number", CarInfoList1.get(i).getC_number());
			jsonObject.put("c_location", CarInfoList1.get(i).getC_location());
			jsonObject.put("c_capacity", CarInfoList1.get(i).getC_capacity());
			String state=CarInfoList1.get(i).getC_state();
			if(state.equals("0")) {
				state="空闲";
			}else if(state.equals("1")) {
				state="运行中";
			}else if(state.equals("2")) {
				state="调度中";
			}else if(state.equals("3")) {
				state="维修中";
			}
			/**
			 * jsonObject.put("c_state", CarInfoList1.get(i).getC_state());
			 */
			jsonObject.put("c_state", state);
			jsonObject.put("d_id", CarInfoList1.get(i).getD_id());
			jsonObject.put("remark", CarInfoList1.get(i).getRemark());
			jsonArray.add(jsonObject);
		}
		return jsonArray;
	}

	@Override
	public int deleteCarInfo(int c_carid) {
		
		return carInfoDao.deleteCarInfo(c_carid);
	}

	@Override
	public int saveCarInfo(CarInfo carInfo) {
		carInfo.setC_buytime(DateUtil.formatDate(new Date(), "yyyy-MM-dd HH:mm:ss"));
		carInfo.setDelflag(0);
		return carInfoDao.saveCarInfo(carInfo);
	}

	@Override
	public int updateCarInfo(CarInfo carInfo) {
		String state1=carInfo.getC_state();
		if(state1.equals("空闲")) {
			state1="0";
		}else if(state1.equals("运行中")) {
			state1="1";
		}else if(state1.equals("调度中")) {
			state1="2";
		}else if(state1.equals("维修中")) {
			state1="3";
		}
		carInfo.setC_state( state1);
		return carInfoDao.updateCarInfo(carInfo);
	}

	@Override
	public JSONArray findAllCar(Map<String, Object> map) {
		List<CarInfo> carInfoList=carInfoDao.findAllCar(map);
		JSONArray jsonArray=new JSONArray();
		for(int i=0;i<carInfoList.size();i++) {
			JSONObject jsonOBject=new JSONObject();
			CarInfo carInfo=carInfoList.get(i);
			jsonOBject.put("c_carid", carInfo.getC_carid());
			jsonOBject.put("c_number", carInfo.getC_number());
			jsonOBject.put("d_id", carInfo.getD_id());
			jsonOBject.put("c_buytime", carInfo.getC_buytime());
			jsonOBject.put("c_capacity", carInfo.getC_capacity());
			jsonOBject.put("c_state", carInfo.getC_state());
			jsonOBject.put("c_location", carInfo.getC_location());
			jsonOBject.put("delflag", carInfo.getDelflag());
			jsonOBject.put("opt_id", carInfo.getOpt_id());
			jsonOBject.put("remark", carInfo.getRemark());
			jsonArray.add(jsonOBject);
		}
		return jsonArray;
	}

	@Override
	public int findAllCarCount(Map<String, Object> map) {
		return carInfoDao.findAllCarCount(map);
	}
}









