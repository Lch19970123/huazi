package com.byzx.service;

import com.byzx.model.ResidentInfo;

/**@文件名: UserLoginService.java
 * @类功能说明: 
 * @作者: HeGuangYao
 * @Email: 105302097@qq.com
 * @日期: 2019年10月30日下午12:07:10
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: HeGuangYao</li> 
 * 	 <li>日期: 2019年10月30日下午12:07:10</li> 
 *	 <li>内容: </li>
 * </pre>
 */
public interface ResidentInfoService {

	public ResidentInfo findResidentInfo(ResidentInfo residentInfo);
	
	public int findResidentInfoByName(String r_name);
	
	public int insertResidentInfo(ResidentInfo residentInfo);
}
