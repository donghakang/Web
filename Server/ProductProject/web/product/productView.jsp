<!--
* NAME		: productView.jsp
* DESC		: 상품정보보기 페이지
* VER		: 1.0
-->

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"   errorPage="error.jsp"  %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>상품 상세 정보</title>
<style>
h1 {
	color: #b1bfca
}

table {
	margin-left: auto;
	margin-right: auto;
	width: 30%;
}

table input {
	width: 500px;
}
textarea {
	width: 500px;
	height: 200px;
	resize: none;
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

.fix {
	margin-top: 200px;
}

.fix input{
	width: 85px;
	height: 85px;
	border-radius: 50%;
	background: #bbdefb;
 
    border:0 none;
	color: black;
}

.fix input:hover{
	background: #ffe7f9;
}

.fix a{
	margin-left: 200px;
	color: #b1bfca
}

#list {
	color: #b1bfca
	font-size: 20px;
	font-style: none;
}
</style>
<script>
	function deleting(i) {
		var r = confirm('정말로 삭제하시겠습니까?');
		if (r == true) {
			window.location.href = '/product/DELETE?num=' + i;
		}
	}
</script>
</head>

<body>
<form action="UPDATE" method="post">
<center><h1>상품정보보기</h1>
  <table border=0>
	<tr>
		<th>번호</th>
		<td><input type="text" name="num" value="${product.num }" readonly></td>
	</tr>
	<tr>
		<th>등록자</th>
		<td><input type="text" name="writer" value="${product.writer }" readonly></td>
	</tr>
	<tr>
		<th>상품명</th>
		<td><input type="text" name="name" value="${product.name}"></td>
	</tr>
	<tr>
		<th>메모</th>
		<td colspan="2">
			<textarea name="description" id="description" cols="30" rows="10" >${product.description }</textarea>
		</td>
	</tr>
  </table>
  
  <div class="fix">
	<input type="submit" value="수정하기" />
	<input type="button" value="삭제하기" onclick="deleting(${product.num});"/>
	<a href="LIST" id="list">목록보기</a>
  </div>
  
</center>



</form>


</body>
</html>		


