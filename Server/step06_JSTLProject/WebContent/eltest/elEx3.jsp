<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>    
<%@ taglib prefix="exam" uri="/WEB-INF/el-function.tld" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>표현언어에서 함수 사용하기 - 두수의 덧셈, 뺄셈 </h3>
<form action=""elEx3.jsp" method="post">
	x: <input type="text" name="x" id="" value="${param.x }" /><br />
	y: <input type="text" name="y" id="" value="${param.y }" /><br />
	<input type="submit" value="계산하기" />
</form>

두 수의 합: <b>${exam:sum(param.x, param.y) }</b>
두 수의 곱: <b>${exam:multi(param.x, param.y) }</b>
</body>
</html>