package com.huazi.garage.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.huazi.garage.service.GarageService;
import com.huazi.garage.vo.User;

/**
 * Servlet implementation class GarageShopcartServlet
 */

public class GarageShopcartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GarageShopcartServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@SuppressWarnings("null")
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		Object obj = session.getAttribute("USER");
		if(null == obj) {
			response.sendRedirect("login.jsp");
			return;
		}
		User user = (User)obj;
		int uid = user.getUid();
		// bid和num是detail.jsp传过来
		String gidstr = request.getParameter("gid");
		String numstr = request.getParameter("num");
		System.out.println("wqwe"+gidstr);
		System.out.println("ww"+numstr);
		if(null == gidstr && !gidstr.equals("") || null == numstr && !numstr.equals("")) {
			response.sendRedirect("index.jsp");
			return;
		}
		int gid = Integer.parseInt(gidstr);
		int num = Integer.parseInt(numstr);
		// 调用service方法，修改shopcart表
		GarageService bs = new GarageService();
		bs.updateShopcart(uid, gid, num);
		// 跳转到购物车页面
		request.getRequestDispatcher("shopcart.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
