<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file= "menu.jsp" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품정보관리</title>
</head>
<body>
<%
	String id = (String)session.getAttribute("loginComplete");

	if (id != null) {
%>	
	<center>
	  	<h1> <%= id %> 로그인 되었습니다.</h1>
	 </center>
<%
	} else {
%>
		<%@ include file= "login.jsp" %>
<%	
	}
%>	 

</body>
</html>