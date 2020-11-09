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
	String str = "Korea";
%>

<%-- 
	이 부분은 JSP페이지 에서만 보이며, 소스코드를 해도 보이지 않습니다.
	브라우저로 내보내지 않는 문장입니다.
 --%>

<%=str /*표현식 안에서도 주석처리 가능*/ %>
</body>
</html>