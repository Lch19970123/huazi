package com.huazi.garage.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.huazi.garage.service.GarageService;
import com.huazi.garage.vo.Garage;

/**
 * Servlet implementation class AdminServlet
 */

public class AdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 每页显示多少条数据
				int pageSize = 3;
				// 总条数
				int count = 0;
				// 当前是第几页
				int pageNum = 1;
				// 获取传递过来的页码
				String pn = request.getParameter("pn"); // "3"
				if(null != pn){
					pageNum = Integer.parseInt(pn);
				}
				// 总页数
				int pageCount = 0;
				GarageService gs = new GarageService();
				List<Garage> garages = gs.findAllGarage();
				count = garages.size();
				pageCount = count%pageSize==0?count/pageSize:count/pageSize+1;
				// 开始索引
				int begin = (pageNum-1)*pageSize;
				// 结束索引
				int end = pageNum==pageCount?count-1:pageNum*pageSize-1;
				
				request.setAttribute("pageNum", pageNum);
				request.setAttribute("pageSize", pageSize);
				request.setAttribute("count", count);
				request.setAttribute("pageCount", pageCount);
				request.setAttribute("begin", begin);
				request.setAttribute("end", end);
				request.setAttribute("GARAGES", garages);
				
				request.getRequestDispatcher("admin.jsp").forward(request, response);
			
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
