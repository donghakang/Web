<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.SQLException"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<body>
<jsp:useBean id="mem" class="register.RegisterEntity" scope="session"/>
<jsp:setProperty property="*" name="mem"/>
<%
	Connection conn = null;

	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		conn = DriverManager.getConnection(
				"jdbc:oracle:thin:@127.0.0.1:1521:XE",
				"edu", "1234");
		conn.setAutoCommit(false);
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	} catch (SQLException e) {
		e.printStackTrace();
	}
	
	
	//--- SQL insert
	int n = 0;
	
	PreparedStatement pstmt = null;
	
	
	try { 
		String sql = "INSERT INTO MEMBER VALUES (?, ?, ?, ?, ? ,? , ?)";
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, mem.getMem_id());
		pstmt.setString(2, mem.getMem_passwd());
		pstmt.setString(3, mem.getMem_name());
		pstmt.setString(4, mem.getMem_email());
		pstmt.setString(5, mem.getMem_phone());
		pstmt.setString(6, mem.getMem_zipcode());
		pstmt.setString(7, mem.getMem_addr());
		n = pstmt.executeUpdate();
		if (n > 0) {
%>
		<b><%=mem.getMem_name() %></b>님 회원가입 되셨습니다.
<%
		}
	} catch (SQLException e) {
		e.printStackTrace();
		try {
			conn.rollback();
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
	} finally {
		try {
			if (pstmt != null) pstmt.close();
			if (conn != null) conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

%>
</body>
</html>