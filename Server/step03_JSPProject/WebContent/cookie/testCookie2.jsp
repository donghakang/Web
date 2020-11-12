<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>testCookie2.jsp</title>
</head>
<body>
<%
	/* 설정에 쿠키 설정을 차단으로 하면, 아래의 아웃풋이 보이지 않는다. */
	Cookie[] cook = request.getCookies();
	if(cook!=null) {
		for (int i = 0; i < cook.length; i++) {			
%>
			쿠키 이름 : <%=cook[i].getName() %> <br />
			쿠키 값 : <%=cook[i].getValue() %> <br /><br />
<%
		}
	}
%>

</body>
</html>