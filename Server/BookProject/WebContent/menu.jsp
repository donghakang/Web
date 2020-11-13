<%@page import="book.dto.LoginDTO"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	p{
	color:green;
	font-weight: bold;
	font-size: 30px;
	}
	
	body{
	margin: 0;
	padding: 0;
	
	}
	
	#menu {
	background-color: skyblue;
	height: 100px;
	}
	
	a {
	display:inline-block;
	margin-top: 40px;
	text-decoration: none;
	font-weight: bold;
	width: 100px;
	text-align: center;
	}

	#login-info {
	font-size: 12px;
	}
</style>
</head>
<body>

<div id="menu">
<%
	LoginDTO user = (LoginDTO)session.getAttribute("logIn");
	if (user == null) {
%>
		<a href="/book/index.jsp">처음화면 </a>
		<a href="/book/login/login.jsp">로그인화면</a>	

<%
	} else {
%>		
		<a href="/book/index.jsp">HOME</a>
		<a href="/book/book/bookInput.jsp">도서등록</a>
		<a href="/book/list">도서목록</a>
		<a href="/book/logout">로그아웃</a>
		<span id="loginInfo"> <b><%=user.getId() %></b>님이 로그인 하셨습니다.</span>
<%
	}
%>
	
</div>

</body>
</html>