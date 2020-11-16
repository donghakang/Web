<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<fmt:requestEncoding value="UTF-8"/>
<c:set var="avg" value="${(param.english + param.math)/2 }"/>

나의 이름은 ${param.name} 입니다. <br />
나의 평균은 ${avg} <br />

<c:if test="${avg >= 60 }">
	결과는 합격입니다.
</c:if>
<c:if test="${vag < 60 }">
	결과는 불합격입니다.
</c:if>
</body>
</html>