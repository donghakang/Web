<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<%
	request.setCharacterEncoding("UTF-8");
String president = request.getParameter("president");
String national_flower = request.getParameter("national_flower");
String sportsman = request.getParameter("sportsman");
String program = request.getParameter("program");
String language = request.getParameter("language");

int num = 0;

if (president.equals("문재인")) {
	num += 10;
}
if (national_flower.equals("무궁화")) {
	num += 10;
}
if (sportsman.equals("박명수")) {
	num += 10;
}
if (program.equals("ms-office")) {
	num += 10;
}
if (language.equals("Winter")) {
	num += 10;
}
%>


<body>
	<form action="Quiz.html">
		당신의 점수는 <%=num%>점 입니다.
		<br />
		<br /> 
		<input type="submit" value="다시시도" />
	</form>
</body>
</html>