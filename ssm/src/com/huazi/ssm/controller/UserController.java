package com.huazi.ssm.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.huazi.ssm.service.UserService;
import com.huazi.ssm.vo.User;

import net.sf.json.JSONObject;

@Controller
public class UserController {

		
	@Autowired
	private UserService userService;
	

	
	@RequestMapping("/queryuser.action")
	public void queryuser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		List<User> users = userService.findUser();
		System.out.println("********"+userService);
		request.setAttribute("USER", users);
		// 请求转发
		request.getRequestDispatcher("jsp/showusers.jsp").forward(request, response);
	}
	
	@RequestMapping("/queryuser1.action")
	public void queryuser1(int uio, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		User user = userService.findUserById(uio);
		System.out.println("********"+userService);
		request.setAttribute("USER", user);
		// 请求转发
		request.getRequestDispatcher("jsp/showusers.jsp").forward(request, response);
	}
	
	/*@RequestMapping("/queryuser1.action")
	public void queryuser2(User user, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		int a = userService.insertUser(user);
		System.out.println("********"+userService);
		request.setAttribute("USER", user);
		// 请求转发
		request.getRequestDispatcher("jsp/showusers.jsp").forward(request, response);
	}*/
	
	@RequestMapping("/queryItems3.action")
	public void queryItems3(User user,HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		int a = userService.insertUser(user);
		System.out.println("********"+user);
		/*request.getSession().setAttribute("USER", user);*/
		// 重定向
		response.sendRedirect("queryuser.action");
	}
	
	@RequestMapping("/deleteUser.action")
	public void deleteUser(int uid,HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		int a=userService.deleteUser(uid);;
		System.out.println("********"+uid);
		/*request.getSession().setAttribute("USER", user);*/
		// 重定向
		response.sendRedirect("queryuser.action");
	}
	
	@RequestMapping("/isExistUserJson.action")
	@ResponseBody
	public JSONObject isExistUserJson(String uname,HttpServletResponse response) throws IOException {
		System.out.println("后台接收的用户名:" + uname);
		Boolean b = userService.findUserByName(uname);
		JSONObject json = new JSONObject();
		json.put("msg", b);
		return json;
	}
	
	/*@RequestMapping("/queryItems1.action")
	public ModelAndView queryItems1(){
		List<Items> items = itemsService.findAllItem();
		ModelAndView mav = new ModelAndView();
		mav.addObject("ITEMS", items);
		mav.setViewName("jsp/showitems.jsp");
		return mav;
	}*/

}
