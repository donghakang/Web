package com.ezen.dao;

import static common.JdbcTemplate.close;
import static common.JdbcTemplate.getConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.ezen.entity.LoginEntity;

public class LoginDao {

	public LoginEntity getLoginUser(String id, String pwd) {
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		LoginEntity entity = null;

		try {
			String sql = "SELECT * FROM USERS WHERE ID=? AND PWD=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, pwd);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				entity = new LoginEntity();
				entity.setId(rs.getString("ID"));
				entity.setPwd(rs.getString("PWD"));
				entity.setName(rs.getString("NAME"));
				entity.setPoint(rs.getDouble("POINT"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rs);
			close(pstmt);
			close(conn);
		}
		return entity;
	}

}
