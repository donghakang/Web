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
	request.setCharacterEncoding("UTF-8");
	String str = request.getParameter("str");
	int num = Integer.parseInt(request.getParameter("num"));
	
	int i = 0;
	while (i < num) {
%>

		<%=str %> <br>

<% 
	i+=1;
	}
%>

</body>
</html>