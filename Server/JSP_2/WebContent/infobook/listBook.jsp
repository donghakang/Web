<%@page import="java.util.ArrayList"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<%
response.setContentType("text/html;charset=UTF-8");

// Connection
Connection conn = null;
try {
	Class.forName("oracle.jdbc.driver.OracleDriver");
	conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE", "edu", "1234");
} catch (ClassNotFoundException e) {
	e.printStackTrace();
} catch (SQLException e) {
	e.printStackTrace();
}

// INSERTION
PreparedStatement stmt = null;
ResultSet rs = null;

ArrayList<String> isbn = new ArrayList<>();
ArrayList<String> name = new ArrayList<>();
ArrayList<String> price = new ArrayList<>();

try {
	String sql = "SELECT * FROM BOOKS";
	stmt = conn.prepareStatement(sql);
	rs = stmt.executeQuery();

	while (rs.next()) {
		isbn.add(rs.getString("isbn"));
		name.add(rs.getString("name"));
		price.add(rs.getString("price"));
	}
} catch (SQLException e) {
	e.printStackTrace();
} finally {
	try {
		if (stmt != null)
	stmt.close(); // 5.연결객체해제
		if (rs != null)
	rs.close();
	} catch (SQLException e) {
		e.printStackTrace();
	}
}
%>
</head>
<body>
	<form action="index.html">
		<table border="1px">
			<tr>
				<th>isbn</th>
				<th>도서</th>
				<th>가격</th>
			</tr>
			<%
				for (int i = 0; i < isbn.size(); i++) {
			%><tr>
				<td><%=isbn.get(i)%></td>
				<td><%=name.get(i)%></td>
				<td><%=price.get(i)%></td>
			</tr>
			<%
				}
			%>
		</table>
		<input type="submit" value="확인" />
	</form>
</body>
</html>