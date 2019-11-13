<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<meta charset="UTF-8">
		<title></title>
		<style>
			h1{text-align: center;}
			#user{
				font-size: 20px;
				padding-left: 30px;
			}
			table{
				font-size: 20px;
				margin: 20px auto;
			}
			td,th{
				width: 140px;
				height: 40px;
				text-align: center;
			}
			th{
				background-color: yellow;
			}
			tr:nth-child(2n+2){
				background-color: skyblue;
			}
			tr:nth-child(2n+1){
				background-color: white;
			}
			button{
				font-size: 20px;
				margin-left: 155px;
				margin-top: 10px;
			}
		</style>
	</head>
	<body>
		<h1>豪车榜</h1>
		<%@ include file="nologin.jsp" %>
		<div id="user">
			你好，${USER.pname} 
			<a href="index.jsp?flag=exit">退出</a>
		</div>
		<hr size="5" color="green" />
		<button onclick="location.href='insert.jsp';">+添加豪车</button>
		
		<table border="1">
			<tr>
				<td colspan="7">
					每页显示${pageSize }条，共${count }条， 当前是第${pageNum }页，共${pageCount }页。
				</td>
			</tr>
			<tr>
				<th>编号</th>
				<th>车名</th>
				<th>价格</th>
				<th>出厂商</th>
				<th>说明</th>
				<th>图片</th>
				<th>操作</th>
			</tr>
			<c:forEach items="${GARAGES }" var="GARAGES" begin="${begin }" end="${end }">
				<tr>
					<td>${GARAGES.gid }</td>
					<td>${GARAGES.gname }</td>
					<td>${GARAGES.cost }</td>
					<td>${GARAGES.yieldly }</td>
					<td>${GARAGES.details }</td>
					<td>${GARAGES.src }</td>
					<td>
						<a href="#">修改</a>
						<a href="delete?bid=${book.bid }">删除</a>
					</td>
				</tr>
			
			
			</c:forEach>
			<tr>
				<td colspan="7">
					<c:if test="${pageNum eq 1 }">
						首页 上一页
					</c:if>
					<c:if test="${pageNum ne 1 }">
						<a href="admin?pn=1">首页</a>
						<a href="admin?pn=${pageNum-1 }">上一页</a>
					</c:if>
					<c:if test="${pageNum eq pageCount }">
						下一页 末页
					</c:if>
					<c:if test="${pageNum ne pageCount }">
						<a href="admin?pn=${pageNum+1 }">下一页</a>
						<a href="admin?pn=${pageCount }">末页</a>
					</c:if>
				</td>
			</tr>
		</table>
	</body>
</html>