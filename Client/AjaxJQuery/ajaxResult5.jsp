<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
    String name = request.getParameter("name");
    String hobby = request.getParameter("hobby");
%>
나의 이름은 <b><%=name%></b>입니다. <br>
나의 취미는 <b><%=hobby%></b>입니다.
</body>
</html>