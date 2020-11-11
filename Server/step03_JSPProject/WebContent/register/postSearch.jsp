<%@page import="javax.naming.InitialContext"%>
<%@page import="javax.naming.Context"%>
<%@page import="javax.sql.DataSource"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.SQLException"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"
%>
<script>
	function inputPost(post1, post2, addr) {
		opener.regForm.post1.value = post1;
		opener.regForm.post2.value = post2;
		opener.regForm.mem_addr.focus();
		opener.regForm.mem_addr.value = addr;
		window.close();
	}
</script>
<link rel="stylesheet" href="zCodeStyle.css" type="text/css" />
<form name="frm" method="post" action="postSearch.jsp">
	<table align="center" width="340" border="0" cellpadding="0"
		cellspacing="0"
	>
		<tr>
			<td align="center">
				<table width="100%" class="join_table">
					<tr align="center" height="20">
						<th>우편번호검색</th>
					</tr>
					<tr align="center" height="20">
						<td>
							◈ 동이름
							<input type="text" name="dong">
							<input type="submit" value="검색">
						</td>
					</tr>
					<tr align="center" height="20">
						<td>
							※ 검색 후 아래 링크를 클릭하시면<br> 자동으로 입력 됩니다.
						</td>
					</tr>
				</table>
				<!-- ------------------------------------------------------------------------------------ -->
				<%
					request.setCharacterEncoding("UTF-8");
				Connection conn = null;
				Statement stmt = null;
				ResultSet rs = null;
				DataSource ds = null;

				try {
				  Context context = new InitialContext();
				  Context env = (Context)context.lookup("java:comp/env");
				  ds=(DataSource)env.lookup("jdbc/ora");
				  // ds-(DataSource)env.lookup("java:comp/env/jdbc/ora");
				  
				  conn = ds.getConnection();
				  conn.setAutoCommit(false);
				} catch (SQLException e) {
				  e.printStackTrace();
				}
				/* try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				conn = DriverManager.getConnection(
				"jdbc:oracle:thin:@127.0.0.1:1521:XE",
				"edu", "1234"
				);
				conn.setAutoCommit(false);      
				} catch (SQLException e) {
				e.printStackTrace();
				} catch (ClassNotFoundException e) {
				e.printStackTrace();
				} */
				%>
				<br>
				<table width="100%" class="join_table">
					<tr align="center">
						<th align="center">우편번호</th>
						<th align="center">주소</th>
					</tr>


					<%
						String dongStr = request.getParameter("dong");
					if (dongStr != null) {
					  try {
					    String sql = "SELECT * FROM ZIPCODE WHERE DONG LIKE '%" + dongStr + "%'";

					    stmt = conn.createStatement();
					    rs = stmt.executeQuery(sql);

					    while (rs.next()) {
					      // seq zipcode sido gugun dong ri bunji
					      // 1     2       3    4     5  6    7
					      String[] zCode = rs.getString(2).split("-");
					      String addr =
					          rs.getString(3) + "   " + rs.getString(4) + " " + rs.getString(5) + " " + rs.getString(6);
					%>

					<tr height="20">
						<td style="width: 60px;"><%=rs.getString(2) /* 우편번호 */%></td>
						<td>
							<a
								onclick="inputPost('<%=zCode[0]%>', '<%=zCode[1]%>', '<%=addr%>')"
							> <%=addr + " " + rs.getString(7) /* 주소 */%></a>
						</td>
					</tr>

					<%
						} // end while
					} catch (SQLException e) {
					e.printStackTrace();
					} finally {
					try {
					if (rs != null)
					  rs.close();
					if (stmt != null)
					  stmt.close();
					if (conn != null)
					  conn.close();
					} catch (SQLException e) {
					e.printStackTrace();
					}
					}
					} // end  if
					%>
				</table>
		</tr>
	</table>
</form>