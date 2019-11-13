package com.byzx.service;
/**@文件名: MenuInfoService.java
 * @类功能说明: 
 * @作者: LiuChunHui
 * @Email: 508499598@qq.com
 * @日期: 2019年10月19日上午9:45:49
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: LiuChunHui</li> 
 * 	 <li>日期: 2019年10月19日上午9:45:49</li> 
 *	 <li>内容: </li>
 * </pre>
 */

import java.util.List;

import com.byzx.model.MenuInfo;

import net.sf.json.JSONArray;

public interface MenuInfoService {

	public JSONArray findAllMenuInfo(String parentId,List<Integer> listMenuIds);
	
	public JSONArray findAllMenuInfoEmpower(String parentId,String menu_ids);
	
	public JSONArray findMenuInfoAll(String parentId);
	
	public int saveMenuInfo(MenuInfo menuInfo);
	
	public int updateMenuInfo(MenuInfo menuInfo);
	
	public int deleteMenuInfo(int menu_id);

	public JSONArray findAllMenuInForEmpower(String parentId, String menu_ids);

	public JSONArray getMenuInfoByParentIdAndMenuIds(String parentId, List<Integer> listMenusIds);

	public JSONArray findMenuInfoForAll(String parentId);
}
