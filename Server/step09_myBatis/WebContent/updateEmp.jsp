<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<fmt:requestEncoding value="UTF-8"/>
<form action="/update"  method="post">
	<table border="1">
		<tr>
			<td>번호</td>
			<td><input type="text" name="eno" value="${param.eno}" readonly/></td>
		</tr>
		<tr>
			<td>이름</td>
			<td><input type="text" name="ename" value="${param.eno}" readonly/></td>
		</tr>
		<tr>
			<td>연락처</td>
			<td><input type="text" name="phone" value="${param.phone}" /></td>
		</tr>
		<tr>
			<td>부서</td>
			<td><input type="text" name="dept" value="${param.dept}" /></td>
		</tr>
		<tr>
			<td colspan="2" align="center">
				<input type="submit" value="수정" />
			</td>
		</tr>
	</table> 
</form>
</body>
</html>













