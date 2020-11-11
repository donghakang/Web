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
int[] sol = {11, 5, 42, 5};
String[] ans = new String[4];
String name = request.getParameter("examinee");
ans[0] = request.getParameter("que00");
ans[1] = request.getParameter("que01");
ans[2] = request.getParameter("que02");
ans[3] = request.getParameter("que03");

int count = 0;

for (int i = 0; i < sol.length; i ++) {
	if ((sol[i]+"").equals(ans[i])) {
		count ++;
	}
}
%>

총 <%=sol.length %>문제 중 <%=sol.length - count %>문제를 틀렸습니다.
<br /><br />
최종 점수는 <span style="color:blue; font-weight:bold;"><%=25*count %></span>점 입니다.
</body>
</html>