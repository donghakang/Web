package book.dao;

import static common.JdbcTemplate.close;
import static common.JdbcTemplate.getConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class LoginDAO {

	public LoginDAO() {
		super();
	}

	public boolean getLoginUser(String id, String pass) {
		Connection conn = getConnection();
		PreparedStatement pstmt = null;

		int n = 0;
		boolean log = false;

		try {
			String sql = "SELECT * FROM MEMBER WHERE USERID=? AND USERPWD=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, pass);

			n = pstmt.executeUpdate();

			if (n > 0) {
				log = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
			close(conn);
		}

		return log;
	}

}
