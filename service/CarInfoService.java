package com.byzx.service;



import java.util.Map;

import com.byzx.model.CarInfo;

import net.sf.json.JSONArray;

/**@文件名: CarInfoService.java
 * @类功能说明: 
 * @作者: ChongYangYang
 * @Email: 1103222824@qq.com
 * @日期: 2019年10月30日下午5:24:52
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: ChongYangYang</li> 
 * 	 <li>日期: 2019年10月30日下午5:24:52</li> 
 *	 <li>内容: </li>
 * </pre>
 */
public interface CarInfoService {

	public JSONArray findAllCarInfo();

	public JSONArray findThisCarInfo(String c_location);

	public int deleteCarInfo(int c_carid);

	public int saveCarInfo(CarInfo carInfo);

	public int updateCarInfo(CarInfo carInfo);

	public JSONArray findAllCar(Map<String, Object> map);

	public int findAllCarCount(Map<String, Object> map);




}
