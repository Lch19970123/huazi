package com.byzx.service;

import java.util.Map;

import com.byzx.model.UserInfo;

import net.sf.json.JSONArray;

/**@文件名: UserInfoService.java
 * @类功能说明: 
 * @作者: LiuChunHui
 * @Email: 508499598@qq.com
 * @日期: 2019年10月17日下午6:12:20
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: LiuChunHui</li> 
 * 	 <li>日期: 2019年10月17日下午6:12:20</li> 
 *	 <li>内容: </li>
 * </pre>
 */
public interface UserInfoService {

	public UserInfo findUserInfo(UserInfo userInfo);

	public JSONArray findAllUserInfo(Map<String,Object> map);
	
	public int findAllUserInfoCount(Map<String,Object> map);
	
	public int saveUserInfo(UserInfo userInfo);
	
	public int findUserInfoByUName(String user_name);
	
	public int updateUserInfo(UserInfo userInfo);
	
	public int deleteUserInfo(String userIds);

	public JSONArray findAllUserId();
}
