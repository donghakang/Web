<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:set var="country" value="${'korea'}"/>
<c:if test="${!empty country}">
	국가명: ${country}
</c:if>
<c:if test="${!empty country}">
	국가명: empty
</c:if>

<br /><br />

<c:if test="${country=='korea' }">
	국가명: 대한민국
</c:if>
<c:if test="${country!='korea'}">
	국가명: 기타 다란 나라
</c:if>

</body>
</html>