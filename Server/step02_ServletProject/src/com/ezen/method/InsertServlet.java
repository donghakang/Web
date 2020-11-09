package com.ezen.method;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Insert", urlPatterns = { "/insert.do" })
public class InsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1.한글처리(UTF-8, EUC-KR등)
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		
		//2.데이타 가져오기
		String name=request.getParameter("name");
 		String phone=request.getParameter("phone");
 		String addr=request.getParameter("addr");
		
		//3.출력
		response.getWriter().append("<html><head><title></title></head>");
		response.getWriter().append("<body>");
		
		response.getWriter().append("나의이름은" + name +"이고 ");
		response.getWriter().append("전화번호는" + phone + "이며 ");
		response.getWriter().append("사는곳은" + addr + "입니다<br>");
		
		//---------------------------------------------------------------
		//4. JDBC연동
		Connection conn=null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn=DriverManager.getConnection(
					              "jdbc:oracle:thin:@127.0.0.1:1521:XE", 
					              "edu", "1234");
			conn.setAutoCommit(false);
//			System.out.println("ok");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		//---------------------------------------------------------------------
/*		PreparedStatement pstmt=null;
		
		try {
			String sql="INSERT INTO USERS(NUM,NAME,PHONE,ADDR) VALUES(SEQ_NO.NEXTVAL,?,?,?)";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setString(2, phone);
			pstmt.setString(3, addr);
			
			int n=pstmt.executeUpdate();
			if(n>0) {
				conn.commit();
				response.getWriter().append("<br>저장되었습니다");
			}
		}catch(SQLException e){
			e.printStackTrace();
			try {
				conn.rollback();
				response.getWriter().append("<br>저장 실패 했습니다");
			}catch(SQLException e1) {}
		}finally {
			try {
				if(pstmt != null) pstmt.close();
			}catch(SQLException e1) {}
		}
*/		
		//-----------------------------------------------------------------
		Statement stmt=null;
		
		try {
			String sql="INSERT INTO USERS VALUES(SEQ_NO.NEXTVAL,'" + name + "','" + phone + "','" 
		                                         + addr + "')";
//			System.out.println("sql:" +sql);
			stmt=conn.createStatement();  
			
			int n=stmt.executeUpdate(sql);
			if(n>0) {
				conn.commit();
				response.getWriter().append("<br>저장되었습니다");
			}
		}catch(SQLException e) {
			e.printStackTrace();
			try {
				conn.rollback();
				response.getWriter().append("<br>저장 실패 했습니다");
			}catch(SQLException e1) {}
		}finally {
			try {
				if(stmt != null) stmt.close();
				if(conn != null) conn.close();
			}catch(SQLException e1) {}
		}
		
		response.getWriter().append("<a href='dbTest.html'>처음으로</a>");
		response.getWriter().append("</body></html>");
	}
}
/*
MySQL 드라이버

https://dev.mysql.com/downloads/connector/j/ 
  ==> mysql-connector-java-8.0.16.jar

[설정 방법]
Drivers: MySQL JDBC Driver

Database : test
URL : jdbc:mysql://127.0.0.1:3306/test?serverTimezone=UTC
User name: root
Password: 123456
*/




























