package com.huazi.garage.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.huazi.garage.service.GarageService;

/**
 * Servlet implementation class ReisterServlet
 */

public class ReisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String nick = request.getParameter("nickname");
		String uname = request.getParameter("uname");
		String password = request.getParameter("password");
		String sex = request.getParameter("sex");
		String status = request.getParameter("status");
		System.out.println("用户名:" + uname);
		System.out.println("密码:" + password);
		System.out.println("身份:" + nick);
		GarageService bs = new GarageService();
		if( bs.updateTable(nick,uname,password,sex,status)) {
			out.println("<script>alert('注册成功');location.href='login.jsp';</script>");
		}else {
			out.println("<script>alert('该用户已存在');location.href='register.jsp';</script>");
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
