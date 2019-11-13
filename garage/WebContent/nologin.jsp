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
	</body>
</html>