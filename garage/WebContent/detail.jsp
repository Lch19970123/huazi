<%@page import="com.huazi.garage.vo.Garage"%>
<%@page import="com.huazi.garage.service.GarageService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title></title>
		<style>
			h1{text-align: center;}
			#photo{
				float:left;
				width: 400px;
				height: 350px;
				padding-left: 30px;
			}
			img{
				display: block;
				width: 380px;
				height: 320px;
				margin: 10px auto;
			}
			#direction,#subject{
				margin: 0 auto;
				width: 80%;
				font-size: 20px;
			}
			#buy{
				width: 400px;
				height: 100px;
				margin: 0 auto;
			}
			.du{
				width:20%;
				float:left;
				text-align: center;
			}
			hr{
				width:80%;
				margin: 0 auto;
				clear: both;
				}
			.big{
				font-size: 25px;
				padding-top: 10px;
			}
			#num{
				width: 50px;
				height: 20px;
				font-size: 20px;
			}
			td{
				width: 600px;
				height: 50px;
				padding-left: 30px;
			}
			
		</style>
	</head>
	<body>
	<%
			String bidstr = request.getParameter("bid");
			if(null == bidstr){
				response.sendRedirect("index.jsp");
				return;
			}
			int bid = Integer.parseInt(bidstr);
			GarageService gs = new GarageService();
			Garage garage = gs.findgarageById(bid);
		%>
		<h1><a href="index.jsp">豪车</a><%=garage.getGname() %></h1>
		<hr size="5" color="green" />
		<div id=subject>
		<div id=photo><img src="<%=garage.getSrc() %>" /></div>
		<div id=message>
			<div class=du><h3>编号:</h3><%=garage.getGid() %></div>
			<div class=du><h3>车名:</h3><%=garage.getGname() %></div>
			<div class=du><h3>厂商:</h3><%=garage.getYieldly() %></div>
			<div class=du><h3>价格:</h3><%=garage.getCost() %></div>
			<div id=buy>
			<form action="GarageShopcartServlet" method="post">
				<table>
					<tr>
						<input type="hidden" value="<%=garage.getGid() %>" name="gid" />
						<td>
							<h3>数量:</h3><input type="number" class="big" id="num" name="num" value="1" min="1" />辆
						</td>
						<td>
							<input type="button" class="big" value=" 立 即 购 买  " />
							<input type="submit" class="big" value=" 添加购物车 " >
						</td>
					</tr>
				</table>
			</form></div>
		</div>		
		</div>
		<hr size="5" color="green" />
		<div id=direction ><%=garage.getDetails() %></div>
		<script>
			var num_input = document.getElementById("num");
			num_input.onblur = function(){
				if(this.value == null || this.value == ""){
					this.value = 1;
				}
			}
			num_input.onkeydown = function(ev){
				var keyCode = ev.keyCode;
				var ch = String.fromCharCode(keyCode);
				if(ch>='0' && ch<='9' || keyCode==8 || keyCode==37 || keyCode==39){
					return true;
				}
				return false;
			}
		</script>
	</body>
</html>