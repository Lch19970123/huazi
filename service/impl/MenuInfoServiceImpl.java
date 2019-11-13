package com.byzx.service.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.byzx.dao.MenuInfoDao;
import com.byzx.model.MenuInfo;
import com.byzx.service.MenuInfoService;
import com.byzx.util.DateUtil;
import com.byzx.util.StringUtil;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/**@文件名: MenuInfoServiceImpl.java
 * @类功能说明: 
 * @作者: LiuChunHui
 * @Email: 508499598@qq.com
 * @日期: 2019年10月19日上午9:48:25
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: LiuChunHui</li> 
 * 	 <li>日期: 2019年10月19日上午9:48:25</li> 
 *	 <li>内容: </li>
 * </pre>
 */
@Service
public class MenuInfoServiceImpl implements MenuInfoService {

	@Autowired
	private MenuInfoDao menuInfoDao;
	
	@Override
	public JSONArray findAllMenuInfo(String parentId, List<Integer> listMenuIds) {
		JSONArray jsonArray=this.getMenuInfoByParentId(parentId, listMenuIds);
		for(int i=0;i<jsonArray.size();i++) {
			JSONObject jsonObject=jsonArray.getJSONObject(i);
			if("open".equals(jsonObject.get("state"))) {
				continue;
			}else {
				jsonObject.put("children", findAllMenuInfo(jsonObject.getInt("id")+"",listMenuIds));
			}
		}
		return jsonArray;
	}
	
	public JSONArray getMenuInfoByParentId(String parentId, List<Integer> listMenuIds) {
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("parentId", parentId);
		map.put("listMenuIds", listMenuIds);
		List<MenuInfo> menuInfoList=menuInfoDao.getMenunInfoByParentIdAndMenuIds(map);
		JSONArray jsonArray=new JSONArray();
		for(int i=0;i<menuInfoList.size();i++) {
			JSONObject jsonObject=new JSONObject();
			jsonObject.put("id", menuInfoList.get(i).getMenu_id());
			jsonObject.put("text", menuInfoList.get(i).getMenu_name());
			jsonObject.put("state", menuInfoList.get(i).getMenu_state());
			jsonObject.put("iconCls", menuInfoList.get(i).getMenu_iconCls());
			JSONObject jsonObject1=new JSONObject();
			jsonObject1.put("url", menuInfoList.get(i).getMenu_path());
			jsonObject.put("attributes", jsonObject1);
			jsonObject.put("parentId", menuInfoList.get(i).getParentId());
			jsonObject.put("createtime", menuInfoList.get(i).getCreatetime());
			jsonObject.put("remark", menuInfoList.get(i).getRemark());
			jsonObject.put("opt_id", menuInfoList.get(i).getOpt_id());
			jsonArray.add(jsonObject);
		}
		return jsonArray;
	}

	@Override
	public JSONArray findAllMenuInfoEmpower(String parentId,String menu_ids) {
		JSONArray jsonArray=this.getMenuInfoEmpowerByParentId(parentId,menu_ids);
		for(int i=0;i<jsonArray.size();i++) {
			JSONObject jsonObject=jsonArray.getJSONObject(i);
			if("open".equals(jsonObject.get("state"))) {
				continue;
			}else {
				jsonObject.put("children", findAllMenuInfoEmpower(jsonObject.getInt("id")+"",menu_ids));
			}
		}
		return jsonArray;
	}

	public JSONArray getMenuInfoEmpowerByParentId(String parentId,String menu_ids) {
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("parentId", parentId);
		map.put("menu_ids", menu_ids);
		List<MenuInfo> menuInfoList=menuInfoDao.getMenuInfoEmpowerByParentId(map);
		JSONArray jsonArray=new JSONArray();
		for(int i=0;i<menuInfoList.size();i++) {
			JSONObject jsonObject=new JSONObject();
			jsonObject.put("id", menuInfoList.get(i).getMenu_id());
			jsonObject.put("text", menuInfoList.get(i).getMenu_name());
			jsonObject.put("state", menuInfoList.get(i).getMenu_state());
			jsonObject.put("iconCls", menuInfoList.get(i).getMenu_iconCls());
			JSONObject jsonObject1=new JSONObject();
			jsonObject1.put("url", menuInfoList.get(i).getMenu_path());
			jsonObject.put("attributes", jsonObject1);
			jsonObject.put("parentId", menuInfoList.get(i).getParentId());
			jsonObject.put("createtime", menuInfoList.get(i).getCreatetime());
			jsonObject.put("remark", menuInfoList.get(i).getRemark());
			jsonObject.put("opt_id", menuInfoList.get(i).getOpt_id());
			if(StringUtil.existStrArr(menuInfoList.get(i).getMenu_id()+"", menu_ids.split(","))) {
				jsonObject.put("checked", true);
			}
			jsonArray.add(jsonObject);
		}
		return jsonArray;
	}

	@Override
	public JSONArray findMenuInfoAll(String parentId) {
		JSONArray jsonArray=this.getMenuInfoByParentIdAll(parentId);
		for(int i=0;i<jsonArray.size();i++) {
			JSONObject jsonObject=jsonArray.getJSONObject(i);
			if("open".equals(jsonObject.get("menu_state"))) {
				continue;
			}else {
				jsonObject.put("children", findMenuInfoAll(jsonObject.getInt("menu_id")+""));
			}
		}
		return jsonArray;
	}
	
	public JSONArray getMenuInfoByParentIdAll(String parentId) {
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("parentId", parentId);
		List<MenuInfo> menuInfoList=menuInfoDao.getMenuInfoEmpowerByParentId(map);
		JSONArray jsonArray=new JSONArray();
		for(int i=0;i<menuInfoList.size();i++) {
			JSONObject jsonObject=new JSONObject();
			jsonObject.put("menu_id", menuInfoList.get(i).getMenu_id());
			jsonObject.put("menu_name", menuInfoList.get(i).getMenu_name());
			jsonObject.put("menu_state", menuInfoList.get(i).getMenu_state());
			jsonObject.put("menu_iconCls", menuInfoList.get(i).getMenu_iconCls());
			jsonObject.put("url", menuInfoList.get(i).getMenu_path());
			jsonObject.put("parentId", menuInfoList.get(i).getParentId());
			jsonObject.put("createtime", menuInfoList.get(i).getCreatetime());
			jsonObject.put("remark", menuInfoList.get(i).getRemark());
			jsonObject.put("opt_id", menuInfoList.get(i).getOpt_id());
			jsonArray.add(jsonObject);
		}
		return jsonArray;
	}

	@Override
	public int saveMenuInfo(MenuInfo menuInfo) {
		menuInfo.setCreatetime(DateUtil.formatDate(new Date(), "yyyy-MM-dd HH:mm:ss"));
		menuInfo.setDelflag(0);
		menuInfo.setState(0);
		menuInfo.setMenu_state("open");
		int result=menuInfoDao.saveMenuInfo(menuInfo);
		if(result>0) {
			menuInfoDao.updateParentMenu(menuInfo.getParentId());
		}
		return result;
	}

	@Override
	public int updateMenuInfo(MenuInfo menuInfo) {
		return menuInfoDao.updateMenuInfo(menuInfo);
	}

	@Override
	public int deleteMenuInfo(int menu_id) {
		int ParentId=menuInfoDao.findMenuInfoParentIdByMId(menu_id);
		int result=menuInfoDao.findMenuInfoCognateByMId(ParentId);
		int resu=menuInfoDao.deleteMenuInfo(menu_id);
		if(result==1&&resu>0) {
			menuInfoDao.updateParentMenuInfo(ParentId);
		}
		return resu;
	}
	
	//白浩杰
	@Override
	public JSONArray getMenuInfoByParentIdAndMenuIds(String parentId, List<Integer> listMenusIds) {
		Map<String,Object> map = new HashMap<String,Object>(); 
		map.put("parentId", parentId);
		map.put("listMenusIds", listMenusIds);
		List<MenuInfo> listMenuInfo = menuInfoDao.getMenuInfoByParentIdAndMenuIds(map);
		JSONArray josnArray=new JSONArray();
		for(int i=0;i<listMenuInfo.size();i++) {
			System.out.println(listMenuInfo.get(i).getMenu_name());
			JSONObject jsonObject = new JSONObject();
			jsonObject.put("id", listMenuInfo.get(i).getMenu_id());
			jsonObject.put("text", listMenuInfo.get(i).getMenu_name());
			jsonObject.put("state", listMenuInfo.get(i).getMenu_state());
			jsonObject.put("iconCls", listMenuInfo.get(i).getMenu_iconCls());
			JSONObject jsonObject1 = new JSONObject();
			jsonObject1.put("url", listMenuInfo.get(i).getMenu_path());
			jsonObject.put("attributes",jsonObject1);
			jsonObject.put("parentId", listMenuInfo.get(i).getParentId());
			jsonObject.put("createtime", listMenuInfo.get(i).getCreatetime());
			jsonObject.put("remark", listMenuInfo.get(i).getRemark());
			jsonObject.put("otp_id", listMenuInfo.get(i).getOpt_id());
			josnArray.add(jsonObject);
		}
		return josnArray;
	}

	@Override
	public JSONArray findAllMenuInForEmpower(String parentId,String menu_ids) {
		JSONArray jsonArray=this.getMenuInfoByParentIdForEmpower(parentId,menu_ids);
		for(int i=0;i<jsonArray.size();i++) {
			JSONObject jsonObject=jsonArray.getJSONObject(i);
			System.out.println(jsonObject.get("state"));
			if("1".equals(String.valueOf(jsonObject.get("state")))) {
				continue;
			}else {
				jsonObject.put("children", findAllMenuInForEmpower(jsonObject.getInt("id")+"",menu_ids));
			}
		}
		return jsonArray;
	}
	
	public JSONArray getMenuInfoByParentIdForEmpower(String parentId,String menu_ids) {
		Map<String,Object> map = new HashMap<String,Object>(); 
		map.put("parentId", parentId);
		List<MenuInfo> listMenuInfo = menuInfoDao.getMenuInfoByParentIdForEmpower(map);
		JSONArray josnArray=new JSONArray();
		for(int i=0;i<listMenuInfo.size();i++) {
			System.out.println(listMenuInfo.get(i).getMenu_name());
			JSONObject jsonObject = new JSONObject();
			jsonObject.put("id", listMenuInfo.get(i).getMenu_id());
			jsonObject.put("text", listMenuInfo.get(i).getMenu_name());
			jsonObject.put("state", listMenuInfo.get(i).getMenu_state());
			jsonObject.put("iconCls", listMenuInfo.get(i).getMenu_iconCls());
			JSONObject jsonObject1 = new JSONObject();
			jsonObject1.put("url", listMenuInfo.get(i).getMenu_path());
			jsonObject.put("attributes",jsonObject1);
			jsonObject.put("parentId", listMenuInfo.get(i).getParentId());
			jsonObject.put("createtime", listMenuInfo.get(i).getCreatetime());
			jsonObject.put("remark", listMenuInfo.get(i).getRemark());
			jsonObject.put("otp_id", listMenuInfo.get(i).getOpt_id());
			if(StringUtil.existStrArr(listMenuInfo.get(i).getMenu_id()+"", menu_ids.split(","))) {
				jsonObject.put("checked", true);
			}
			josnArray.add(jsonObject);
		}
		return josnArray;
	}

	@Override
	public JSONArray findMenuInfoForAll(String parentId) {
		JSONArray jsonArray=this.getMenuInfoByParentIdForAll(parentId);
		for(int i=0;i<jsonArray.size();i++) {
			JSONObject jsonObject=jsonArray.getJSONObject(i);
			if("1".equals(String.valueOf(jsonObject.get("menu_state")))) {
				continue;
			}else {
				jsonObject.put("children", findMenuInfoForAll(jsonObject.getInt("menu_id")+""));
			}
		}
		return jsonArray;
	}
	
	public JSONArray getMenuInfoByParentIdForAll(String parentId) {
		Map<String,Object> map = new HashMap<String,Object>(); 
		map.put("parentId", parentId);
		List<MenuInfo> listMenuInfo = menuInfoDao.getMenuInfoByParentIdForEmpower(map);
		JSONArray josnArray=new JSONArray();
		for(int i=0;i<listMenuInfo.size();i++) {
			JSONObject jsonObject = new JSONObject();
			jsonObject.put("menu_id", listMenuInfo.get(i).getMenu_id());
			jsonObject.put("menu_name", listMenuInfo.get(i).getMenu_name());
			jsonObject.put("menu_state", listMenuInfo.get(i).getMenu_state());
			jsonObject.put("menu_iconCls", listMenuInfo.get(i).getMenu_iconCls());
			jsonObject.put("menu_path", listMenuInfo.get(i).getMenu_path());
			jsonObject.put("parentId", listMenuInfo.get(i).getParentId());
			jsonObject.put("createtime", listMenuInfo.get(i).getCreatetime());
			jsonObject.put("remark", listMenuInfo.get(i).getRemark());
			jsonObject.put("otp_id", listMenuInfo.get(i).getOpt_id());
			josnArray.add(jsonObject);
		}
		return josnArray;
	}

}
