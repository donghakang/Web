package com.ezen.method;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "List", urlPatterns = { "/list.do" })
public class ListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn=DriverManager.getConnection(
					              "jdbc:oracle:thin:@127.0.0.1:1521:XE", 
					              "edu", "1234");
			conn.setAutoCommit(false);
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		//------------------------------------------------------------------
		
		try {
			String sql="SELECT * FROM USERS ORDER BY NUM DESC";
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			
			response.getWriter().append("<table border='1' width='350px'>");
			while(rs.next())
			{
				response.getWriter().append("<tr>");
				response.getWriter().append("<td>"+ rs.getInt("NUM") + "</td>");
				response.getWriter().append("<td>"+ rs.getString("NAME") + "</td>");
				response.getWriter().append("<td>"+ rs.getString("PHONE") + "</td>");
				response.getWriter().append("<td>"+ rs.getString("ADDR") + "</td>");
				response.getWriter().append("</tr>");
			}
			response.getWriter().append("</table>");
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			}catch(SQLException e) {}
		}
		
		response.getWriter().append("<a href='dbTest.html'>처음으로</a>");
		response.getWriter().append("</body></html>");
	}
}









