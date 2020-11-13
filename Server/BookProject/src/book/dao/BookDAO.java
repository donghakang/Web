package book.dao;

import static common.JdbcTemplate.close;
import static common.JdbcTemplate.commit;
import static common.JdbcTemplate.getConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import book.dto.BookDTO;

public class BookDAO {

	public boolean bookInsert(BookDTO bk) {

		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		int n = 0;
		boolean input = false;

		try {
			String sql = "INSERT INTO BOOKSHOP VALUES (?,?,?,?,?)";
			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, bk.getIsbn());
			pstmt.setString(2, bk.getTitle());
			pstmt.setString(3, bk.getAuthor());
			pstmt.setString(4, bk.getCompany());
			pstmt.setInt(5, bk.getPrice());

			n = pstmt.executeUpdate();
			if (n > 0) {
				commit(conn);
				input = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
			close(conn);
		}

		return input;
	}

	public ArrayList<BookDTO> getBookList() {

		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ArrayList<BookDTO> list = new ArrayList<>();

		try {
			String sql = "SELECT * FROM BOOKSHOP ORDER BY ISBN DESC";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				BookDTO dto = new BookDTO();
				dto.setIsbn(rs.getString("ISBN"));
				dto.setTitle(rs.getString("TITLE"));
				dto.setAuthor(rs.getString("AUTHOR"));
				dto.setCompany(rs.getString("COMPANY"));
				dto.setPrice(rs.getInt("PRICE"));

				list.add(dto);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rs);
			close(pstmt);
			close(conn);
		}

		return list;
	}

	public boolean updateBook(BookDTO bk) {
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		int n = 0;
		boolean input = false;

		try {
			String sql = "UPDATE BOOKSHOP SET COMPANY=?, PRICE=? WHERE ISBN=?";
			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, bk.getCompany());
			pstmt.setInt(2, bk.getPrice());
			pstmt.setString(3, bk.getIsbn());

			n = pstmt.executeUpdate();
			if (n > 0) {
				commit(conn);
				input = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
			close(conn);
		}

		return input;

	}

	public boolean deleteBook(String isbn) {
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		int n = 0;
		boolean input = false;

		try {
			String sql = "DELETE FROM BOOKSHOP WHERE ISBN=?";
			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, isbn);

			n = pstmt.executeUpdate();
			if (n > 0) {
				commit(conn);
				input = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
			close(conn);
		}

		return input;

	}

}
