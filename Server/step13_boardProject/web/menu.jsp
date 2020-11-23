<%@page import="com.login.dto.LoginDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	p{	color:green;font-weight: bold;	font-size: 30px;}
	body { margin: 0; padding: 0; }
	#menu { height: 100px; background-color: #eee;	}
	a { display:inline-block;  margin-top:40px; text-decoration: none; font: bold;  width: 100px; text-align: center; }
	#login_info { font-size: 12px; }
</style>
</head>

<body>
<div id="menu">
<a href="/bbs/index.jsp">처음화면</a>
<%
	LoginDTO entity = (LoginDTO)session.getAttribute("logOK");
	if(entity == null)
	{
%>
		<a href="/bbs/login/login.jsp" >로그인화면</a>
<%
	}else{
%>
		<a href="/bbs/board/boardWrite.jsp" >글쓰기</a>
		<a href="/bbs/boardList.do?pg=1" >글읽기</a>
		<a href="/bbs/logout.do" >로그아웃</a>
		<span id="login_info"><b><%=entity.getName()%></b>님이 로그인 하셨습니다 &nbsp;&nbsp;
		현재 소유하신 포인터는 <b><%=entity.getPoint()%></b>점 입니다</span>		
<%                         
	}
%>
</div>
<hr>