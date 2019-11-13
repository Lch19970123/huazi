<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
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
		<form action="register" method="get" onsubmit="return verify();">
			<div id="park">
				<div>昵&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp称：<input type="text" class="zt" name="nickname" placeholder="请输入昵称"/></div>
				<div class="hg">性 &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp别：&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
					<input type="radio" name="sex" value="男"  />男&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
					<input type="radio" name="sex" value="女"  />女&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</div>
				<div class="hg">身&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp份：&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
					<input type="radio" name="status" value="0"   checked/>会员&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
					<input type="radio" name="status" value="1"  />管理员</div>
				<div>账&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp号：<input type="text" class="zt" name="uname" placeholder="请输入账号"/></div>
				<div>密&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp码：<input type="password" class="zt" name="password" placeholder="请输入密码" /></div>
				<div>确认密码：<input type="password" class="zt" name="confirmPassword" placeholder="请输入密码" /></div>
				<div><input type="submit" class="dq" value="注册"/>
				<input type="reset" class="dq" value="取消" /></div>
			</div>
		</form>
		<script>
			var nick_input = document.getElementsByName("nickname")[0];
			var user_input = document.getElementsByName("uname")[0];
			var pass_input = document.getElementsByName("password")[0];
			var conf_input = document.getElementsByName("confirmPassword")[0];
			console.log(user_input.value);
			function verify(){
				var nick_txt = nick_input.value;
				var user_txt = user_input.value;
				var pass_txt = pass_input.value;
				var conf_txt = conf_input.value;
				console.log(nick_txt);
				console.log(user_txt);
				console.log(pass_txt);
				console.log(conf_txt);
				if(nick_txt.length<2 || nick_txt.length>8){
					alert("昵称不正确");
					return false;
				}
				if(user_txt.length<2 || user_txt.length>20){
					alert("账号不正确");
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
				if(conf_txt != pass_txt){
					alert("请输入俩次相同的密码");
					return false;
				}
				return true;
			}
		</script>
	</body>
</html>