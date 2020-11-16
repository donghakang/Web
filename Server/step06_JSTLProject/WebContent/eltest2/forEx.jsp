<%@page import="java.util.ArrayList"%>
<%@page import="entity.Emp"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	List<Emp> list = new ArrayList<>();
	list.add(new Emp("kim", "developer"));
	list.add(new Emp("lee", "engineer"));
	list.add(new Emp("park", "developer"));

%>

<c:set var="emp" value="<%=list %>"/>
<c:forEach items="${emp }" var="ob">
	${ob.name} &nbsp;&nbsp;&nbsp;${ob.dept } <br /><br />

</c:forEach>
</body>
</html>