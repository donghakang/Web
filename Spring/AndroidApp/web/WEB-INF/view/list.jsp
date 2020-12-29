<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<%@page import="org.json.JSONObject"%>
<%@page import="org.json.JSONArray" %>

<%
JSONObject json = new JSONObject();
json.put("name", "aaa");
json.put("age", "256");
json.put("hobby", "bike");
%>
{json}
<%-- 

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:if test="${!empty list}">
<table border="1">
      <tr>
         <td>이름</td>
         <td>나이</td>
         <td>취미</td>
      </tr>
      <c:forEach items="${list}" var="ob">
      <tr>
         <td>${ob.name}</td>
         <td>${ob.age}</td>
         <td>${ob.hobby}</td>
      </tr>
     </c:forEach>
   </table>
</c:if>
<br><br>
<a href="/app/index.jsp">처음화면</a>
</body>
</html>  --%>
