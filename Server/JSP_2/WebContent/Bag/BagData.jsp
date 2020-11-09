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
	String name = request.getParameter("name");
	String[] effects = request.getParameterValues("effects");
%>

<form action="Bag.html">
	<h1>입력결과</h1>
	<br /><br />
	이름은 <%=name %>입니다. <br /><br />
	선택하신 소지품은 <br />
	<% 
		for (int i = 0; i < effects.length; i ++) {
	%>
			<%=effects[i]%> <br />
	<%	
		}		
	%>
	입니다.
	<br /><br />
	<input type="submit" value="닫기" />
</form>
</body>
</html>