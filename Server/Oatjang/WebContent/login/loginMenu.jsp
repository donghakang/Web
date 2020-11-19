<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 페이지</title>
<style>
	body {
		padding: 0;
		margin: 0;
	}
	.menu { 
		display: flex;
		background-color: skyblue;
		height:20px;
		
	}
	a {
		margin-left: 12px;
		margin-right: 12px;
	}
	
</style>
</head>
<body>
	<div class="menu">
		<a href="/login/loginPage.jsp">로그인</a>
		<a href="/login/register.jsp">회원가입</a>
		<span id="myPage">마이페이지</span>
		<span id="login">로그인</span>
		<span id="logout">로그아웃</span>
		<span id="register">회원가입</span>
	</div>
</body>
</html>