<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="exam" uri="/WEB-INF/el-function.tld" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
${param.x } + ${param.y } = ${exam:sum(param.x, param.y) } <br /><br />
${param.x } * ${param.y } = ${exam:multi(param.x, param.y) } <br /><br /> 
</body>
</html>