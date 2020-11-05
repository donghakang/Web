<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Document</title>
</head>
<body>
    <%

    int bottom = Integer.parseInt(request.getParameter("bottom"));
    int height = Integer.parseInt(request.getParameter("height"));

    %>
    <br>
    삼각형의 넓이: <%=bottom*height/2.0%>
</body>
</html>