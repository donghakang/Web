<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품정보관리</title>
<style>
	#backTable {
		padding-left: 0;
		padding-right: 0;
		margin-left: auto;
		margin-right: auto;
		margin-top:200px;
	}
	
	#warning {
		font-size: 32px;
		color: #e53935;
		font-weight: 900;
		margin: 12px;
	}

	#imgcell {
		padding-top: 30px;
	}
</style>
</head>
<body>
<table id="backTable">
	<tr>
		<td rowspan="2" id="imgcell"><IMG SRC="images/dog.gif" WIDTH=100 HEIGHT=60 BORDER=0></td>
		<td height="100px"> <span id="warning">! 아이디 또는 패스워드가 틀립니다.</span> </td>
	</tr>
	<tr>
		<td><a href="index.jsp"> 뒤로가기 </a></td>
	</tr>
</table>
</body>
</html>

<!-- 
<BODY BGCOLOR="#FFFFFF" leftmargin="0" topmargin="0" marginwidth=0 marginheight=0>
		<TABLE BORDER=0 CELLPADDING=0 CELLSPACING=0 WIDTH=100% HEIGHT=100%>
			<TR>
				<TD align=center>
					<center><FONT face="굴림" size=3> 아이디 또는 패스워드가 틀립니다. </FONT></center>
					<p>
					<IMG SRC="images/dog.gif" WIDTH=100 HEIGHT=60 BORDER=0>
					<a href="login.jsp"> 뒤로가기 </a>
					<p> <p>
				</TD>
			</TR>
	</TABLE>
	</BODY> -->