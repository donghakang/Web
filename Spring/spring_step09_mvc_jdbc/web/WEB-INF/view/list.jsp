<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:if test="${!empty list }">

<table border="1">
      <tr>
         <td>이름</td>
         <td>나이</td>
         <td>취미</td>
      </tr>
      <c:forEach items="${list }" var="ob">
	     <tr>
	        <td>${ob.name }</td>
	        <td>${ob.age }</td>
	        <td>${ob.hobby }</td>
	     </tr>
      </c:forEach>
   </table>
</c:if>
<br><br>
<a href="/edu/index.jsp">처음화면</a>
</body>
</html>