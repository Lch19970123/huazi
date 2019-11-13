package com.byzx.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.byzx.dao.RoleInfoDao;
import com.byzx.model.RoleInfo;
import com.byzx.service.RoleInfoService;
import com.byzx.util.DateUtil;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/**@文件名: RoleInfoServiceImpl.java
 * @类功能说明: 
 * @作者: LiuChunHui
 * @Email: 508499598@qq.com
 * @日期: 2019年10月19日上午9:26:02
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: LiuChunHui</li> 
 * 	 <li>日期: 2019年10月19日上午9:26:02</li> 
 *	 <li>内容: </li>
 * </pre>
 */
@Service
public class RoleInfoServiceImpl implements RoleInfoService {

	@Autowired
	private RoleInfoDao roleInfoDao;
	@Override
	public String getMenuIdsByRoleId(int roleId) {
		return roleInfoDao.getMenuIdsByRoleId(roleId);
	}
	@Override
	public JSONArray findAllRoleInfo(Map<String, Object> map) {
		List<RoleInfo> roleInfo=roleInfoDao.findAllUserInfo(map);
		JSONArray jsonArray=new JSONArray();
		for(int i=0;i<roleInfo.size();i++) {
			JSONObject jsonObject=new JSONObject();
			jsonObject.put("role_id", roleInfo.get(i).getRole_id());
			jsonObject.put("role_name", roleInfo.get(i).getRole_name());
			jsonObject.put("menu_ids", roleInfo.get(i).getMenu_ids());
			jsonObject.put("createtime", roleInfo.get(i).getCreatetime());
			jsonObject.put("remark", roleInfo.get(i).getRemark());
			jsonArray.add(jsonObject);
		}
		return jsonArray;
	}
	@Override
	public int findAllRoleInfoCount(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return roleInfoDao.findAllUserInfoCount(map);
	}
	@Override
	public int saveRoleInfo(RoleInfo roseInfo) {
		roseInfo.setCreatetime(DateUtil.formatDate(new Date(), "yyyy-MM-dd hh:mm:ss"));
		roseInfo.setDelflag(0);
		roseInfo.setState(0);
		return roleInfoDao.saveRoleInfo(roseInfo);
	}
	@Override
	public int findRoleInfoByRName(String role_name) {
		return roleInfoDao.findRoleInfoByRName(role_name);
	}
	@Override
	public int updateRoleInfo(RoleInfo roseInfo) {
		return roleInfoDao.updateRoleInfo(roseInfo);
	}
	@Override
	public int deleteRoleInfo(String roleIds) {
		String role_id[]=roleIds.split(",");
		int count=0;
		for(int i=0;i<role_id.length;i++) {
			roleInfoDao.deleteRoleInfo(Integer.parseInt(role_id[i]));
			count++;
		}
		return count;
	}
	@Override
	public int roleInfoEmpower(Map<String, Object> map) {
		return roleInfoDao.roleInfoEmpower(map);
	}

}
