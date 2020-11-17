package com.ezen.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ezen.entity.EmpEntity;
import static common.JdbcTemplate.getConnection;
import static common.JdbcTemplate.close;
import static common.JdbcTemplate.commit;
import static common.JdbcTemplate.rollback;

public class EmpDao {

	public int insertEmp(EmpEntity emp) {
		Connection conn=getConnection();
		PreparedStatement pstmt=null;
		int n=0;
		
		try {
			String sql="INSERT INTO EMP(ENO,ENAME,PHONE,DEPT) VALUES(SEQ_ENO.NEXTVAL,?,?,?)";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, emp.getEname());
			pstmt.setString(2, emp.getPhone());
			pstmt.setString(3, emp.getDept());
			n=pstmt.executeUpdate();
			
			if(n > 0) {
				commit(conn);
			}
		}catch(SQLException e) {
			e.printStackTrace();
			rollback(conn);
		}finally {
			close(pstmt);
			close(conn);
		}
		return n;
	}
	//------------------------------------------------------------
	public List<EmpEntity> listEmp() {
		Connection conn=getConnection();
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		List<EmpEntity> list=new ArrayList<>();
		EmpEntity emp=null;
		
		try {
			String sql="SELECT * FROM EMP ORDER BY ENO DESC";
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			
			while(rs.next()) {
				emp=new EmpEntity();
				emp.setEno(rs.getInt("ENO"));
				emp.setEname(rs.getString("ENAME"));
				emp.setPhone(rs.getString("PHONE"));
				emp.setDept(rs.getString("DEPT"));
				
				list.add(emp);
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			close(rs);
			close(pstmt);
			close(conn);
		}
		return list;
	}
	//-----------------------------------------------------------------
	public int updateEmp(EmpEntity entity) {
		Connection conn=getConnection();
		PreparedStatement pstmt=null;
		int n=0;
		
		try{
			String sql="UPDATE EMP SET PHONE=?,DEPT=? WHERE ENO=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, entity.getPhone());
			pstmt.setString(2, entity.getDept());
			pstmt.setInt(3, entity.getEno());
			n=pstmt.executeUpdate();
			
			if(n>0)
				commit(conn);
		}catch(SQLException e){
			e.printStackTrace();
			rollback(conn);
		}finally{
			close(pstmt);
			close(conn);
		}
		return n;
	}
	//-----------------------------------------------------------------
	public int deleteEmp(EmpEntity entity) {
		Connection conn=getConnection();
		PreparedStatement pstmt=null;
		int n=0;
		
		try{
			String sql="DELETE FROM EMP WHERE ENO=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, entity.getEno());
			n=pstmt.executeUpdate();
			
			if(n>0)
				commit(conn);
		}catch(SQLException e){
			e.printStackTrace();
			rollback(conn);
		}finally{
			close(pstmt);
			close(conn);
		}
		return n;
	}	
	
}
/*
	update emp set phone=?, dept=? where eno=?

	delete from emp where eno=?
*/














