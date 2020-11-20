<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	* { margin:0px; padding:0px;}
	html,body {
		width:100%; height:100%;
	}
	#container {
		width:100%; height:100%;
		display:flex; justify-content: center; align-items: center;
	}
	#inputBox{
		width:50%; min-height:30%; border-radius:10px; border:1px solid black;
		display:flex; justify-content:center; padding:20px;
	}
	#inputBox>form {
		width:70%; height:80%;
	}	
</style>
</head>
<body>
<div id="container">
	<div id="inputBox">
		<form action="lunchData.jsp" method="post">
			<h2>급식일입력</h2>
			<input type="date" name="date"/><br/>
			<input type="submit" value="급식보기"/>
		</form>
	</div>
</div>
</body>
</html>








