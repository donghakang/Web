<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품정보관리</title>
<style>
#menu {
	background-color: #ffffff;
	display: flex;
	padding-top: 12px;
	padding-bottom: 8px;
}

.log {
	margin-left: auto;
}

a {
	text-decoration: none;
	color: #aaa;
	padding: 20px;
}

a:hover {
	color: black;
}
</style>
</head>
<body>
<%
	String userId = (String)session.getAttribute("loginComplete");
%>
	<div id="menu">
		<div class="contents">
			<a href="/product/home.jsp" target="main">HOME</a> 
<%
			if (userId != null) {
%>
				<a href="/product/product/productInput.jsp" target="main">상품등록</a>
				<a href="/product/LIST" target="main">상품전체조회</a>
<%				
			}
%>
		</div>
		<div class="log">
<% 
			if (userId != null) {
%>			
				<a href="/product/LOGOUT">로그아웃</a>
<%
			} else {
%>
				<a href="/product/index.jsp">로그인</a>
<%
			}
%>			
		</div>
	</div>
</body>
</html>



