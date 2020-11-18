<%@page import="entity.Emp"%>
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
	Emp ob = (Emp)request.getAttribute("emp");
%>
<%=ob.getEno() %> <br />
<%=ob.getEname() %> <br />
<%=ob.getPhone() %> <br />
<%=ob.getDept() %> <br />
</body>
</html>