<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
table {
	border: 1px double #000;
	margin: 20px;
	padding: 20px;
}
</style>
</head>
<body>
	<form action="saveBook.jsp">
		<table>
			<tr>
				<td>isbn:</td>
				<td><input type="text" name="isbn" id="book_isbn" /></td>
			</tr>
			<tr>
				<td>도서:</td>
				<td><input type="text" name="name" id="book_name" /></td>
			</tr>
			<tr>
				<td>가격:</td>
				<td><input type="text" name="price" id="book_price" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="확인" /></td>
				<td><input type="reset" value="취소" /></td>
			</tr>
		</table>

	</form>

</body>
</html>