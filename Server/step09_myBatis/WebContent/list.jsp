<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>전체보기</h2>
<table border="1">
	<tr>
		<td>부서번호</td>
		<td>이름</td>
		<td>연락처</td>
		<td>부서명</td>
		<td>수정</td>
		<td>삭제</td>
	</tr>
	<c:if test="${!empty list}">
	<c:forEach items="${list}" var="ob">
			<tr>
				<td>${ob.eno}</td>
				<td>${ob.ename}</td>
				<td>${ob.phone}</td>
				<td>${ob.dept}</td>
				<td>
					<form action="updateEmp.jsp" method="post">
						<a href="javascript:;" onclick="parentNode.submit();">수정</a>
						<input type="hidden" name="eno" value="${ob.eno}"/>
						<input type="hidden" name="ename" value="${ob.dept}"/>
						<input type="hidden" name="phone" value="${ob.phone}"/>
						<input type="hidden" name="dept" value="${ob.dept}"/>
					</form>
				</td>
				<td>
					<a href="delete?eno=${ob.eno}" 
					         onclick="javascript:return confirm('삭제할까요?')">삭제</a>
				</td>
			</tr>
	</c:forEach>
	</c:if>
</table>
</body>
</html>












