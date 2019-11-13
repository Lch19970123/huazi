<%@page import="java.net.URLDecoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>登录页面</title>
		<style>
			div{
			text-align: center;
			font-size: 80px; 
			}
			table{margin: 20px auto;
				width: 60%;
			} 
			tr{
				width: 100%;
				height: 120px;
				text-align: center;
				font-size: 40px; 
			}
			.sh{
				width: 600px;
				height: 60px;
				font-size: 40px; 
			}
			.dq{
				width: 220px;
				height: 60px;
				margin-left: 120px;
				font-size: 40px;
			} 
			.hg{
				margin-left: 70px;
				
			}
			a{
				float: right;
				text-decoration: none;
				margin-right: 50px;
			}
		</style>
	</head>
	<body bgcolor="greenyellow">
		<div>
			登录页面
		</div>
		<hr size="5" color="green"/>
		<%
			String uname = "";
			String upass = "";
			Cookie[] cks = request.getCookies();
			if(null != cks){
				for(Cookie ck: cks){
					if(ck.getName().equals("UNAME")){
						uname = ck.getValue();
						uname = URLDecoder.decode(uname,"UTF-8");
					}
					if(ck.getName().equals("PASSWORD")){
						upass = ck.getValue();
					}
				}
			}
		%>
		<form action="login" method="post" onsubmit="return checkuser();">
			<table border="1">
				<tr>
					<td>账号</td>
					<td><input type="text" name="uname" class="sh" value="<%=uname %>" placeholder="请输入账号"  /> </td>
				</tr>
				<tr>
					<td>密码</td>
					<td><input type="password" name="password" class="sh" value="<%=upass %>" placeholder="请输入6~20位密码"  /> </td>
				</tr>
				<tr>
					<td>身份</td>
					<td>
						<input type="radio" name="status" value="0" class="hg" checked/>会员 
						<input type="radio" name="status" value="1" class="hg" />管理员
					</td>
				</tr>
				<tr>
					<td colspan="2">
						<input type="checkbox" name="rem" />记住密码<br/>
						<input type="submit" class="dq" value="登录" />
						<input type="reset" class="dq" value="取消" />
						<a href="register.jsp">注册</a>
					</td>
				</tr>		
			</table>
		</form>
		<script>
			var user_input = document.getElementsByName("uname")[0];
			var pass_input = document.getElementsByName("password")[0];
			var username = "<%=uname %>";
			var password = "<%=upass %>";
			console.log(username);
			console.log(password);
			var rem_input = document.getElementsByName("rem")[0];
			if(username != "" && password != ""){
				rem_input.checked = true;
			} 
			console.log(user_input.value);
			function checkuser(){
				var user_txt = user_input.value;
				var pass_txt = pass_input.value;
				console.log(pass_txt);
				if(user_txt.length<2 || user_txt.length>20){
					alert("用户名不正确");
					return false;
				}
				if(pass_txt.length<6 || pass_txt.length>20){
					alert("密码长度不符合要求");
					return false;
		
				}
				var numberCount = 0;
				var letterCount = 0;
				for(var i=0;i<pass_txt.length;i++){
					var ch = pass_txt.charAt(i);
					if(ch >= '0' && ch <= '9'){
						numberCount++;
					}
					if(ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z'){
						letterCount++;
					}
				}
				console.log(numberCount);
				console.log(letterCount);
				if(numberCount==0 || letterCount==0){
					alert("密码必须同时包含字母和数字");
					return false;
				}
				return true;
			}
		</script>
	</body>
</html>