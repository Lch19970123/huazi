package com.byzx.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.byzx.dao.UserInfoDao;
import com.byzx.model.UserInfo;
import com.byzx.service.UserInfoService;
import com.byzx.util.DateUtil;
import com.byzx.util.Md5;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/**@文件名: UserInfoServiceImpl.java
 * @类功能说明: 
 * @作者: LiuChunHui
 * @Email: 508499598@qq.com
 * @日期: 2019年10月17日下午6:15:58
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: LiuChunHui</li> 
 * 	 <li>日期: 2019年10月17日下午6:15:58</li> 
 *	 <li>内容: </li>
 * </pre>
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {

	@Autowired
	private UserInfoDao userInfoDao;
	
	@Override
	public UserInfo findUserInfo(UserInfo userInfo) {
		return userInfoDao.findUserInfo(userInfo);
	}

	@Override
	public JSONArray findAllUserInfo(Map<String,Object> map) {
		List<UserInfo> userInfos=userInfoDao.findAllUserInfo(map);
		JSONArray jsonArray=new JSONArray();
		for(int i=0;i<userInfos.size();i++) {
			JSONObject jsonObject=new JSONObject();
			jsonObject.put("user_id", userInfos.get(i).getUser_id());
			jsonObject.put("user_name", userInfos.get(i).getUser_name());
			jsonObject.put("user_pwd", userInfos.get(i).getUser_pwd());
			jsonObject.put("user_phone", userInfos.get(i).getUser_phone());
			jsonObject.put("user_idCard", userInfos.get(i).getUser_idCard());
			jsonObject.put("role_id", userInfos.get(i).getRole_id());
			jsonObject.put("role_name", userInfos.get(i).getRole_name());
			jsonObject.put("remark", userInfos.get(i).getRemark());
			jsonArray.add(jsonObject);
		}
		return jsonArray;
	}

	@Override
	public int findAllUserInfoCount(Map<String,Object> map) {
		return userInfoDao.findAllUserInfoCount(map);
	}

	@Override
	public int saveUserInfo(UserInfo userInfo) {
		userInfo.setCreatetime(DateUtil.formatDate(new Date(), "yyyy-MM-dd HH:mm:ss"));
		userInfo.setDelflag(0);
		userInfo.setState(0);
		return userInfoDao.saveUserInfo(userInfo);
	}

	@Override
	public int findUserInfoByUName(String user_name) {
		return userInfoDao.findUserInfoByUName(user_name);
	}

	@Override
	public int updateUserInfo(UserInfo userInfo) {
		String newPassword = userInfoDao.findUserPasswordByUId(userInfo.getUser_id());
		if(!userInfo.getUser_pwd().equals(newPassword)) {
			userInfo.setUser_pwd(Md5.MD5(userInfo.getUser_pwd()));
		}
		return userInfoDao.updateUserInfo(userInfo);
	}

	@Override
	public int deleteUserInfo(String userIds) {
		String user_id[]=userIds.split(",");
		int count=0;
		for(int i=0;i<user_id.length;i++) {
			userInfoDao.deleteUserInfo(Integer.parseInt(user_id[i]));
			count++;
		}
		return count;
	}

	@Override
	public JSONArray findAllUserId() {
		List<UserInfo> userInfoId = userInfoDao.findAllUserId();
		JSONObject jsonObject = new JSONObject();
		JSONArray jsonArray = new JSONArray();
		for(int i=0;i<userInfoId.size();i++) {
			jsonObject.put("user_id", userInfoId.get(i).getUser_id());
			jsonArray.add(jsonObject);
		}
		return jsonArray;
	}
}
