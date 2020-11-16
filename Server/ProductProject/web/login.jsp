<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"
%>
<!--
* NAME		: Login.html
* DESC		: 로그인 페이지
* VER		: 1.0
-->

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<style>
#loginPage {
	padding-left: 0;
	padding-right: 0;
	margin-left: auto;
	margin-right: auto;
	margin-top:200px;
}

#str {	
	font-size: 24px;
	font-weight: bold;
	color: #999;
}
</style>
<script>
	function Login() {
		if (document.FrmLogin.user.value == "") {
			alert("ID를 입력하세요")
			document.FrmLogin.user.focus();
		} else if (document.FrmLogin.pass.value == "") {
			alert("비밀번호를 입력하세요")
			document.FrmLogin.pass.focus();
		} else {
			document.FrmLogin.submit();
		}
	}
</script>
</head>

<body BGCOLOR="#ffffff" leftmargin="0" topmargin="0" marginwidth=0
	marginheight=0
>
	<form action="LOGIN" method="post" name="FrmLogin">
		<div >

			<table id="loginPage">
				<tr>
					<td rowspan="5" width=107>
						<img src="images/login5_1.gif">
					</td>
					<td colspan="2" height="60px"> <span id="str">로그인해 주세요 </span></td>
				</tr>
				<tr>
					<td>
						<img src="images/id_id.gif" alt="id" border=0 />
					</td>
					<td>
						<input TYPE="text" name="user" class="input"
							style='width: 120; height: 20;'
						>
					</td>
				</tr>
				<tr>
					<td>
						<img src="images/id_pass.gif" alt="password" />
					</td>
					<td>
						<input TYPE="password" name="pass" class="input"
							style='width: 120; height: 20;'
						>
					</td>
				</tr>
				<tr>
					<td></td>
					<td height="5" background="images/line.gif"></td>
				</tr>
				<tr>
					<td></td>
					<td colspan="2">
						<a href="JavaScript:Login();"><img src="images/butt_login.gif"
							border="0" width=80 height=25 alt="Login"
						/></a>
					</td>
				</tr>
			</table>
		</div>
	</form>
</BODY>
</html>
