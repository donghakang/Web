<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<script>
	$(document).ready(function() {
		$("#loginBtn").on('click', function(){
			if ($("#id").val() == "") {
				alert("아이디를 입력하세요.");
				$('#id').focus();
			} else if ($("#pw").val() == "") {
				alert("패스워드를 입력하세요.");
				$('#pw').focus();
			} else {
				$('#login').submit();
			}
		});	
	})
</script>
</head>
<body>
<form action="/login" method="post" id="login"> 
<table>
	<tr>
		<td>
			<input type="text" name="id" id="id" placeholder="아이디를 입력하세요" />
		</td>
		<td rowspan="2">
			<input type="button" value="로그인" id="loginBtn" />
		</td>
	</tr>
	<tr>
		<td>
			<input type="password" name="pw" id="pw" placeholder="패스워드를 입력하세요" />
		</td>
	</tr>
</table>
</form>
</body>
</html>