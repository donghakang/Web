/*---------------------------------------------------------------------------------------------
 * NAME   : notice.dao.NoticeDAO
 * DESC   : 공지사항 정보를 DBMS에 저장하고, 추출, 수정, 삭제 하는 클래스
 *---------------------------------------------------------------------------------------------
*/

package product.dao;

import static common.JdbcTemplate.close;
import static common.JdbcTemplate.commit;
import static common.JdbcTemplate.getConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import product.entity.Product;

/**
 * <pre>
 * Database의 Product 정보를 접근하기위한 CRUD처리 기능을 담고있는 클래스
 * </pre>
 */

public class ProductDAO {

	private Connection conn;

	/**
	 * Default constructor* Connection 객체를 전달 받아 저장합니다.
	 */
	public ProductDAO(Connection conn) {
		this.conn = conn;
		if (this.conn == null) {
			System.out.println("CONN NULL");
		}
	}
	/**
	 * loginCheck() method는 전달된 아이디와 패스워드를 DB와 비교하여 확인후 그 결과를 boolean 타입으로
	 * 리턴합니다.
	 * 
	 * @param userId
	 *            로그인한 아이디
	 * @param pass
	 *            로그인한 패스워드
	 * @return boolean : 아이디와 패스워드가 DB에 존재하면 true, 존재하지 않으면 false를 리턴합니다.
	 */
	public boolean loginCheck(String userId, String pass) {
		PreparedStatement pstmt = null;
		boolean check = false;
		int n = 0;

		try {
			String sql = "SELECT * FROM USERS WHERE USERID=? AND PASS=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, userId);
			pstmt.setString(2, pass);

			n = pstmt.executeUpdate();

			if (n > 0) {
				check = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		return check;
	}
	/**
	 * 공지사항 정보를 DB에 입력합니다. 공지사항 입력을 위해서 기존에 저장된 공지사항의 번호 중 가장 큰값을 구합니다. 가장 큰값에
	 * 1을 더해 공지사항의 번호를 구하고, 공지사항 레코드가 존재하지 않을 경우 번호를 1로 설정합니다. 구해진 번호와 매개변수로 입력된
	 * 공지사항 객체에서 id, title, content, 그리고 오늘날짜를 구하여 Product 테이블에 한 레코드를 추가합니다.
	 * 
	 * @param n
	 *            저장할 Product 객체
	 * @return boolean 저장의 성공여부
	 */
	public boolean productInsert(Product n) {
		PreparedStatement pstmt = null;
		int check = 0;
		boolean success = false;

		try {
			String sql = "INSERT INTO PRODUCT VALUES ((SELECT MAX(NUM)+1 FROM PRODUCT),?,SYSDATE,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, n.getWriter());
			pstmt.setString(2, n.getName());
			pstmt.setString(3, n.getDescription());

			check = pstmt.executeUpdate();
			if (check > 0) {
				commit(conn);
				success = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}

		return success;
	}
	/**
	 * DB를 연동하여 공지사항 정보를 Product 객체에 저장하고 객체들의 목록을 ArrayList 형태로 리턴합니다.
	 * 
	 * @return ArrayList : 공지사항 정보 목록
	 */
	public ArrayList<Product> productList() {
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		ArrayList<Product> arr = new ArrayList<Product>();

		try {
			String sql = "SELECT * FROM PRODUCT ORDER BY NUM ASC";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				Product n = new Product();
				n.setNum(rs.getInt("NUM"));
				n.setWriter(rs.getString("WRITER"));
				n.setInDate(rs.getString("INDATE"));
				n.setName(rs.getString("NAME"));
				n.setDescription(rs.getString("DESCRIPTION"));
				arr.add(n);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}

		return arr;
	}
	/**
	 * 매개변수로 전달된 번호의 공지사항 정보를 검색하여 Product 형태로 리턴합니다.
	 * 
	 * @param num
	 *            검색하고자 하는 공지사항 번호
	 * @return Product : 검색된 공지사항정보(Product)
	 */
	public Product productView(int num) {
		PreparedStatement pstmt = null;
		Product n = new Product();
		ResultSet rs = null;
		
		try {
			String sql = "SELECT * FROM PRODUCT WHERE NUM=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				n.setNum(rs.getInt("NUM"));
				n.setWriter(rs.getString("WRITER"));
				n.setInDate(rs.getString("INDATE"));
				n.setName(rs.getString("NAME"));
				n.setDescription(rs.getString("DESCRIPTION"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}

		return n;
	}
	
	
	public boolean productDelete(int n) {
		PreparedStatement pstmt = null;
		int check = 0;
		boolean success = false;

		try {
			String sql = "DELETE FROM PRODUCT WHERE NUM=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, n);
			check = pstmt.executeUpdate();
			if (check > 0) {
				commit(conn);
				success = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}

		return success;
	}
	public boolean productUpdate(Product n) {
		PreparedStatement pstmt = null;
		int check = 0;
		boolean success = false;

		try {
			String sql = "UPDATE PRODUCT SET NUM=?, WRITER=?, NAME=?, DESCRIPTION=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, n.getNum());
			pstmt.setString(2, n.getWriter());
			pstmt.setString(3, n.getName());
			pstmt.setString(4, n.getDescription());

			check = pstmt.executeUpdate();
			if (check > 0) {
				commit(conn);
				success = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}

		return success;
	}
	
	
}
