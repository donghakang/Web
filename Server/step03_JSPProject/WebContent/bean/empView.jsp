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
%>

<jsp:useBean id="ob" class="bean.EmpVo"/>
<%-- 
<jsp:setProperty property="name" name="ob"/>
<jsp:setProperty property="phone" name="ob"/>
<jsp:setProperty property="addr" name="ob"/>
 --%>
 
<jsp:setProperty property="*" name="ob"/>

이름: <%=ob.getName() %> <br />
전화: <%=ob.getPhone() %> <br />
주소: <%=ob.getAddr() %> <br />
</body>
</html>

<!-- import bean.EmpVo;

EmpVo ob=new EmpVo();
ob.setName(request.getParameter("name"));
ob.setPhone(request.getParameter("phone"));
ob.setAddr(request.getParameter("addr")); -->