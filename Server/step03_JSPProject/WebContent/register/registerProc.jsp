<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("UTF-8");
%>
<html>
<head><title>회원가입 확인</title></head>

<body>

<%
request.setCharacterEncoding("UTF-8");
%>

<jsp:useBean id="mem" class="register.RegisterEntity" scope="session"/>
<jsp:setProperty property="*" name="mem"/>
<%
	String post1 = request.getParameter("post1");
	String post2 = request.getParameter("post2");
	
	mem.setMem_zipcode(post1+"-"+post2);
%>

<form name="regForm" method="post" action="registerInsert.jsp">
<table width="80%" align="center" border="0" cellspacing="0"
	cellpadding="5">
	<tr>
		<td align="center" valign="middle" >
		<table width="90%" border="1"bgcolor="#FFFFCC" cellspacing="0" cellpadding="2"
			align="center">
			<tr align="center" bgcolor="#996600">
				<td colspan="3">
					<font color="#FFFFFF"><b>
					<jsp:getProperty property="mem_name" name="mem"/>
					 회원님이 작성하신 내용입니다. 확인해 주세요</b>
					</font>
				</td>
			</tr>
			<tr>
				<td width="24%">아이디</td>
				<td width="41%"><%=mem.getMem_id() %></td>
			</tr>
			<tr>
				<td>패스워드</td>
				<td><%=mem.getMem_passwd() %></td>
			</tr>
			<tr>
				<td>이름</td>
				<td><%=mem.getMem_name() %></td>
			</tr>
			<tr>
				<td>이메일</td>
				<td><%=mem.getMem_email() %></td>
			</tr>
			<tr>
				<td>전화번호</td>
				<td><%=mem.getMem_phone() %></td>
			</tr>
			<tr>
				<td>주소</td>
				<td>(<%=mem.getMem_zipcode() %>) <%=mem.getMem_addr() %></td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<input type="submit"	value="확인완료"> &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; 
					<input type="button" value="다시쓰기" onClick="history.back()"></td>
			</tr>
		</table>
		</td>
	</tr>
</table>
</form>
</body>
</html>
