<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h3> *** 상품 수정 *** </h3>
<br><br>
<form action ="updateProc" method="post">
	<table>
		<tr>
			<td>상품명</td>
			<td> <input type="text" name="item"  value="${product.item }"/> </td>
		</tr>
		<tr>
			<td>가격</td>
		<td>
			 <input type="text" name="price"  value="${product.price }" /> </td>
		</tr>
		<tr>
			<td>출고일</td>
			<td> <input type="text" name="regdate"  value="${product.regdate }" /> </td>
		</tr>
		<tr>
			<td colspan=2 align=center >
			<input type="hidden" name="no"  value="${product.no }"/>
			<input type="submit" value="수정" />
		</td>
		</tr>
	</table>
</form>
</body>
</html>