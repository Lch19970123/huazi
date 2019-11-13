package com.byzx.service;

import java.util.Map;

import com.byzx.model.RoleInfo;

import net.sf.json.JSONArray;

/**@文件名: RoleInfoService.java
 * @类功能说明: 
 * @作者: LiuChunHui
 * @Email: 508499598@qq.com
 * @日期: 2019年10月19日上午9:22:51
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: LiuChunHui</li> 
 * 	 <li>日期: 2019年10月19日上午9:22:51</li> 
 *	 <li>内容: </li>
 * </pre>
 */
public interface RoleInfoService {

	public String getMenuIdsByRoleId(int roleId);
	
	public JSONArray findAllRoleInfo(Map<String,Object> map);
	
	public int findAllRoleInfoCount(Map<String,Object> map);
	
	public int saveRoleInfo(RoleInfo roseInfo);
	
	public int findRoleInfoByRName(String role_name);
	
	public int updateRoleInfo(RoleInfo roseInfo);
	
	public int deleteRoleInfo(String roleIds);
	
	public int roleInfoEmpower(Map<String,Object> map);
}
