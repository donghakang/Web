<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"
%>
<%@ include file="../menu.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품 정보 등록</title>
<Script>
function confirm(){
	if(document.input.title.value==''){
		alert("제목을 입력하십시요.");
		document.input.title.focus();
		return;
	}
	if(document.input.content.value==''){
		alert("내용을 입력하십시요.");
		document.input.content.focus();
		return;
	}
	document.input.submit();
}
</Script>
<style>
h1 {
	color: #b1bfca
}

#input_table {
	margin-left: auto;
	margin-right: auto;
	width: 30%;
}

#product_name {
	width: 500px;
}

textarea {
	width: 500px;
	height: 200px;
	resize: none;
}

.buttons {
	display: flex;
	justify-content: center;
	padding: 18px;
}

#save {
	margin-right: 10px;
	padding: 6px 18px;
}

#cancel {
	margin-left: 10px;
	padding: 6px 18px;
}

tr {
	height: 40px;
}

th {
	width: 80px;
	background-color: #e3f2fd;
	font-weight: normal;
	color: #888888;
}

td {
	padding: 4px 2px 4px 4px;
}
</style>

</head>
<body>
	<%
		String id = (String) session.getAttribute("loginComplete");
	%>
	<form action="/product/SAVE" method="post" name="input">
	<table id="input_table">
		<caption>
			<h1>상품등록</h1>
		</caption>
		<tr height="40">
			<th>등록자
			</td>
			<td><%=id%></td>
		</tr>
		<tr>
			<th>상품명
			</td>
			<td>
				<input type="text" name="title" id="product_name" />
			</td>
		</tr>
		<tr>
			<th>메 모</th>
			<td>
				<textarea name="content" id="content"
					cols="num" rows="num"
				></textarea>
			</td>
		</tr>
	</table>
	<div class="buttons" >
		<input type=button  id="save" value="저장"  onclick="confirm();">
		<input type="reset" id="cancel" value="취소" />
	</div>
	</form>
</body>
</html>
