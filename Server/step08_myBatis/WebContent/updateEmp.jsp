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
%>
<form action="/update" method="post">
	<table border="1">
		<tr>
			<td>번호</td>
			<td> <input type="text" name="eno" id="" value="<%=request.getParameter("eno") %>"   readonly /> </td>
		</tr>
		<tr>
			<td>이름</td>
			<td> <input type="text" name="ename" id="" value="<%=request.getParameter("ename") %>"  /> </td>
		</tr>
		<tr>
			<td>연락처</td>
			<td> <input type="text" name="phone" id="" value="<%=request.getParameter("phone") %>" /> </td>
		</tr>
		<tr>
			<td>부서명</td>
			<td> <input type="text" name="dept" id="" value="<%=request.getParameter("dept") %>" /> </td>
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