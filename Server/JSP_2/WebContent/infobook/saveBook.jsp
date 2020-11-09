<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<%
	String isbn = request.getParameter("isbn");
	String name = request.getParameter("name");
	String price = request.getParameter("price");
%>
<body>
<form action="index.html">
	isbn: <%=isbn %> <br />
	도서명: <%=name %> <br />
	가격: <%=price %> <br />
	
	<!-- 저장 시키 -->
	
	<input type="button" value="저장하기" />
	<input type="submit" value="홈으로 가기" />

</form>
</body>
</html>