<%@page import="com.ezen.entity.LoginEntity"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
<a href="/log/index.jsp">처음화면</a>
<c:if test="${!empty logOK}">
	<a href="/log/list">사원전체보기</a>
		<a href="/log/emptest/empInsert.jsp">사원추가하기</a>
		<a href="/log/logout">로그아웃</a>
		<span id="login_info"><b>${logOK.name}</b>님이 로그인 하셨습니다&nbsp;&nbsp;
		현재 소유하신 포인터는 <b>${logOK.point }</b>점 입니다</span>
</c:if>
<c:if test="${empty logOK }">
	<a href="/log/logtest/login.jsp">로그인화면</a>
</c:if>

</div>
<hr>



























