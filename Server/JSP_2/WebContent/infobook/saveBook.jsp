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

String isbn = request.getParameter("isbn");
String name = request.getParameter("name");
String price = request.getParameter("price");

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
int n = 0;

try {
	String sql = "INSERT INTO BOOKS VALUES (?,?,?)";
	stmt = conn.prepareStatement(sql);
	stmt.setString(1, isbn);
	stmt.setString(2, name);
	stmt.setString(3, price);
	n = stmt.executeUpdate();

	if(n > 0) {
        conn.commit();
    }
}catch(SQLException e) {
    e.printStackTrace();
    try {
        conn.rollback();
    } catch (SQLException e1) {
        e1.printStackTrace();
    }
}finally {
    try {
        if(stmt != null) stmt.close();   // 5.연결객체해제
    } catch (SQLException e) {
        e.printStackTrace();
    }
}
%>


</head>

<body>
	<form action="index.html">
		isbn:
		<%=isbn%>
		<br /> 도서명:
		<%=name%>
		<br /> 가격:
		<%=price%>
		<br />
		<!-- 저장 시키 -->
		<%
			if (n > 0) {
		%>
		저장되었습니다.
		<%
			} else {
		%>
		저장시 오류가 있습니다.
		<%		
			}
		%>
		<br /><br />
		<input type="submit" value="홈으로 가기" />
	</form>
</body>
</html>