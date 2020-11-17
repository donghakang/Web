package com.ezen.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.ezen.entity.LoginEntity;
import static common.JdbcTemplate.getConnection;
import static common.JdbcTemplate.close;

//DAO(Data Access Object):데이터베이스와 연동해서 CRUD를 처리
public class LoginDao {

	public LoginEntity getLoginUser(String id, String pwd) {
		Connection conn=getConnection();
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		LoginEntity entity=null;
				
		try {
			String sql="SELECT * FROM USERS WHERE ID=? AND PWD=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, pwd);
			rs=pstmt.executeQuery();
			
			if(rs.next()) {
				entity=new LoginEntity();
				entity.setId(rs.getString("ID"));  //컬럼명은 대.소문자 상관없음
				entity.setPwd(rs.getString("PWD"));
				entity.setName(rs.getString("NAME"));
				entity.setPoint(rs.getDouble("POINT"));
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			close(rs);
			close(pstmt);
			close(conn);
		}
		return entity;
	}

}









