<%@page import="com.huazi.garage.vo.GarageShopCart"%>
<%@page import="java.util.List"%>
<%@page import="com.huazi.garage.service.GarageService"%>
<%@page import="com.huazi.garage.vo.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title></title>
	</head>
	<body>
	<%
			Object obj = session.getAttribute("USER");
			if(null == obj){
				response.sendRedirect("login.jsp");
				return;
			}
			User user = (User)obj;
		%>
		<h1>购物车</h1>
		<div id="user">当前用户: <%=user.getPname() %></div>
		<hr size="5" color="green" />
		<table border="1">
			<tr>
				<th>
					<input type="checkbox" id="allSelected" />
					编号
				</th>
				<th>车名</th>
				<th>价格</th>
				<th>数量</th>
				<th>小计</th>
				<th>操作</th>
			</tr>
			<%
				GarageService bs = new GarageService();
				// 当前登录用户的购物车信息
				List<GarageShopCart> garageshopcarts = bs.findGarageShopcart(user.getUid());
				double total = 0; // 总价
				for(GarageShopCart garageshopcart: garageshopcarts){
					double subtotal = garageshopcart.getNum()*garageshopcart.getCost();
					total += subtotal;
			%>		
				<tr>
					<td>
						<input type="checkbox" class="book" onclick="changeMoney(this,<%=subtotal %>);" />
						<%=garageshopcart.getGid() %>
					</td>
					<td><%=garageshopcart.getGname() %></td>
					<td><%=garageshopcart.getCost() %></td>
					<td><%=garageshopcart.getNum() %></td>
					<td><%=subtotal %></td>
					<td>
						<a href="#">移除购物车</a>
					</td>
				</tr>	
			<%		
				}
			%>
			<tr>
				<td colspan="6">
					总计: <span id="cash">0.00</span>元
					<button>支付结算</button>
				</td>
			</tr>
		</table>
		<a href="index.jsp">继续购物</a>			
		
			
	</body>
</html>