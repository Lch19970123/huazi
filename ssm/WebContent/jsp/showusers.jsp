<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title></title>
	</head>
	<body>
		<%-- ${pageContext.request.contextPath }  web项目的根路径 --%>
	<form action="${pageContext.request.contextPath }/queryuser.action"
		method="post">
		查询条件：
		<table width="100%" border=1>
			<tr>
				<td>
					<input type="hidden" name="uio" value="3" />
					<input type="hidden" name="username" value="scott" />
					<input type="hidden" name="age" value="38" />
					<input type="hidden" name="sex" value="男" />
					<input type="hidden" name="password" value="123456" />
					<input type="submit" value="查询" />
				</td>
			</tr>
		</table>
		商品列表：
		<table width="100%" border=1>
			<tr>
				<td>编号</td>
				<td>账号</td>
				<td>密码</td>
				<td>性别</td>
				<td>生日</td>
				<td>昵称</td>
				<td>操作</td>
			</tr>
			<c:forEach items="${USER }" var="USER">
				<tr>
					<td>${USER.uid }</td>
					<td>${USER.uname }</td>
					<td>${USER.password }</td>
					<td>${USER.sex }</td>
					<td>${USER.identity }</td>
					<%-- <td><fmt:formatDate value="${user.identity}" pattern="yyyy-MM-dd HH:mm:ss" /></td> --%>
					<td>${USER.pname }</td>
					<td><a href="${pageContext.request.contextPath }/editItem.action">修改</a>
						<a href="${pageContext.request.contextPath }/deleteUser.action?uid=${USER.uid}">删除</a></td>
				</tr>
			</c:forEach>
		</table>
	</form>
	</body>
</html>