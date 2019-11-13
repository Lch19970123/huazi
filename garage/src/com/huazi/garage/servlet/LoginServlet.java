package com.huazi.garage.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.huazi.garage.service.GarageService;
import com.huazi.garage.vo.User;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String uname = request.getParameter("uname");
		String password = request.getParameter("password");
		String identity = request.getParameter("status");
		String rem = request.getParameter("rem");
		System.out.println("用户名:" + uname);
		System.out.println("密码:" + password);
		System.out.println("身份:" + identity);
		System.out.println("记住密码:" + rem);
		GarageService bs = new GarageService();
		if(bs.isRightUser(uname, password)) {
			HttpSession session = request.getSession();
			User user = bs.findUserByName(uname);
			session.setAttribute("USER", user);
			Cookie ckName = null;
			Cookie ckPass = null;
			if(null == rem) { 
				ckName = new Cookie("UNAME", "");
				ckPass = new Cookie("PASSWORD", "");
			}else { 
				ckName = new Cookie("UNAME", URLEncoder.encode(uname,"UTF-8"));
				ckPass = new Cookie("PASSWORD", password);
				ckName.setMaxAge(60*60*24*30);
				ckPass.setMaxAge(60*60*24*30);
			}
			response.addCookie(ckName);
			response.addCookie(ckPass);
			if(bs.isAdmin(uname)) {
				out.println("<script>alert('管理员登录成功');location.href='admin.jsp';</script>");
			}else {
				out.println("<script>alert('会员登录成功');location.href='index.jsp';</script>");
			}
			
		}else {
			out.println("<script>alert('登录失败');location.href='login.jsp';</script>");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
