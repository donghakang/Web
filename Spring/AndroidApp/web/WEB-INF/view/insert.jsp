<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form  method="post" action="/app/insertProc.do">
<table>
	<tr>
		<td>이름</td>
		<td><input type="text"  name="name"></td>
	</tr>	
	<tr>	
		<td>나이</td>
		<td><input type="text"  name="age"></td>
	</tr>
	<tr>	
		<td>취미</td>
		<td><input type="text"  name="hobby"></td>
	</tr>
	<tr>
		<td colspan="2">
			<input type="submit"  value="추가하기">
			<input type="button"  value="전체보기" onclick="location.href='/app/list.do'">   
		</td>
	</tr>
</table>
</form><br>
<a href="/app/index.jsp">처음화면</a>
</body>
</html>












