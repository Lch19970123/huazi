<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<script src="jquery-3.1.1.js"></script>
		<title></title>
		<style>
			#front{
			text-align: center;
			font-size: 80px;
			background-color: "green";
			}
			#park{
			margin: 5px auto;
			text-align: center;
			font-size:40px;
			}
			.zt{
				margin-top:5px;
				width: 600px;
				height: 60px;
				font-size: 40px;
			}
			.dq{
				width: 260px;
				height: 40px;
				font-size: 30px;
			}
			.hg{
				margin:2px auto;
				width:1000px;
				height: 60px;
				font-size: 40px;
				
			}
		</style>
	</head>
	<body bgcolor="#f9fbf8">
		<div id="front">用户注册</div>
		<hr size="5" color="green"/>
		<form action="${pageContext.request.contextPath }/queryItems3.action" method="get" onsubmit="return verify();">
			<div id="park">
				<div>昵称：<input type="text" id="huazi" class="zt"  name="pname" placeholder="请输入昵称"/><label ></label></div>
				<div class="hg">性别：
					<input type="radio" name="sex" value="男"  />男
					
					<input type="radio" name="sex" value="女"  />女</div>
				<!-- <div class="hg">身&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp份：&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
					<input type="radio" name="status" value="0"   checked/>会员&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
					<input type="radio" name="status" value="1"  />管理员</div> -->
				<div>账号：<input type="text" class="zt" name="uname" placeholder="请输入账号"/></div>
				<div>密码：<input type="password" class="zt" name="password" placeholder="请输入密码" /></div>
				<div>确认密码：<input type="password" class="zt" name="confirmPassword" placeholder="请输入密码" /></div>
				<div><input type="submit" class="dq" value="注册"/>
				<input type="reset" class="dq" value="取消" /></div>
			</div>
		</form>
		<script>
		$(function(){
			
			$("#huazi").blur(function(){
				var user_txt = $(this).val();
				$.ajax({
					type: "POST",
					url: "${pageContext.request.contextPath }/isExistUserJson.action",
					data: {
						uname: user_txt
					},
					dataType: "json",
					success: function(data){  
						console.log("服务器返回成功，" + typeof(data.msg));
					if(data.msg){
						console.log("服务器789");
						$("label").html("该用户名已经存在").css({color:"red"})
					}else if(!data.msg){
						console.log("HUAZI");
						$("label").html("该用户名可以使用").css({color:"green"})
					}
					},
					error: function(data){
						console.log("服务器返回失败");
					}
				});
			});
			
		});
		</script>
	</body>
</html>