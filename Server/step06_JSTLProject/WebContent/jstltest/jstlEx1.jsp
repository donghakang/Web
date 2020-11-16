<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:set var="num1" value="${10}"/>
<c:set var="num2">20</c:set>
num1 + num2 = ${num1 + num2 } <br /><br />

<!------------------------------------------------------------>
<%
	String[] color = {"red", "blue", "green"};
%>
<c:set var="colName" value="<%=color%>"/>
<c:forEach items="${colName }" varStatus="i">
	${i.count }&nbsp;&nbsp;&nbsp;${colName[i.index] } <br />
</c:forEach>
<br /><br />

<!------------------------------------------------------------>
<c:forTokens items="벤츠,소나타,아우디,BMW,포르쉐" delims="," var="car">
	${car }&nbsp;&nbsp;&nbsp;&nbsp;
</c:forTokens>
<br /><br />

<!------------------------------------------------------------>
<c:forEach begin="1" end="10" step="1" var="num">
	${num} &nbsp;&nbsp;&nbsp;
</c:forEach>
<br /><br />

<c:forEach begin="1" end="10" var="num">
	${num} &nbsp;&nbsp;&nbsp;
</c:forEach>
<br /><br />

<c:forEach begin="1" end="10" step="2" var="num">
	${num} &nbsp;&nbsp;&nbsp;
</c:forEach>
<br /><br />
</body>
</html>