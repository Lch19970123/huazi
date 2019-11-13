<%@page import="com.huazi.garage.vo.Garage"%>
<%@page import="java.util.List"%>
<%@page import="com.huazi.garage.service.GarageService"%>
<%@page import="com.huazi.garage.vo.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>首页面</title>
		<style>
			#head{
			
				font-size: 40px;
				width :900px;
				height :60px;
				margin: 10px auto;
				text-align: center;			
			}
			.hd{
				background-color: yellow;
				display:inline-block;
				width: 100px;
				margin-left: 45px;
				margin-right: 45px; 
			}
			.cars{
				width: 30%;
				height: 480px;
				float: left;
				margin: 20px 30px;
			}
			.cars img{
				display: block;
				margin: 0 auto;
				width: 90%;
				height: 400px;
			}
			.cars div{
				font-size: 20px;
				text-align: center;
				margin-top: 10px;
			}
			#foot{
				font-size: 20px;
				text-align: center;
			}
		</style>
	</head>
	<body bgcolor="# adff2f">
		<%
				String flag =request.getParameter("flag");
				if(null!=flag && flag.equals("exit")){
					session.invalidate();
					session=request.getSession(true);
				}
				Object user = session.getAttribute("USER");
				if(null==user){
			%>
					<div>请<a href="login.jsp">登录</a>或<a href="register.jsp">注册</a>
			<% 	
				}else{
					User us=(User)user;
			%>
					你好，<%=us.getPname() %>
			<%if(us.getSex().equals("男")){ %>
			先生<%}else{ %>
			女士<%} %>		
				<a href="index.jsp?flag=exit">退出</a></div>
			<%
				}
			%>
			<div id="head">
				<div class="hd">
					豪
				</div>
				<div class="hd">
					车
				</div>
				<div class="hd">
					秀
				</div>
			</div>
		<hr size="5" color="green"/>
		<%
			GarageService bs = new GarageService();
			List<Garage> garages = bs.findAllGarage();
			for(Garage garage: garages){
		%>	
			<div class="cars">
				<a href="detail.jsp?bid=<%=garage.getGid() %>">
					<img src="<%=garage.getSrc() %>" />
				</a>
				<div>
					车名: <%=garage.getGname() %><br/>
					价格:￥<%=garage.getCost() %>元
				</div>
			</div>
		<%		
			}
		%>
		<hr size="5" color="green" />
		<div id="foot">
			书店地址：银河系地球村彩虹街窝窝乡258号<br/>
			电话：975-8899166<br/>
			©最炫高富帅店 <br/><br/><br/><br/><br/><br/><br/>
		</div>
	</body>
</html>























