package com.dao;

import static common.JdbcTemplate.close;
import static common.JdbcTemplate.getConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.entity.User;

public class LoginDAO {

	private Connection conn;

	public LoginDAO() {
		super();
		conn = getConnection();
	}

	public User getLoginUser(String id, String pw) {
		/*
		 * @param  id : 아이디
		 * @param  pw : 비밀번호 
		 * @return id 와 pw가 매칭되는 User 객체
 		 * 
		 */
		PreparedStatement pstmt = null;
		boolean check = false;
		ResultSet result = null;
		User user = null;

		try {
			String sql = "SELECT * FROM USERS WHERE ID=? AND PW=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, pw);

			result = pstmt.executeQuery();

			if (result != null) {
				user.setUid(result.getInt("UID"));
				user.setId(result.getString("ID"));
				user.setPw(result.getString("PW"));
				user.setName(result.getString("NAME"));
				user.setNickname(result.getString("NICKNAME"));
				user.setBirth(result.getString("BIRTH"));
				user.setPhone(result.getString("PHONE"));
				user.setAddr(result.getString("ADDR"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		return user;
	}

}
