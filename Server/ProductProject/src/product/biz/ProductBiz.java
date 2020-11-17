/*------------------------------------------------------------------------------
 * Name : NoticeBiz
 * DESC : 비지니스 서비스 기능을 담당하는 Biz 클래스.
 * VER  : 1.0
 *----------------------------------------------------------------------------*/

package product.biz;

import static common.JdbcTemplate.close;
import static common.JdbcTemplate.getConnection;

import java.sql.Connection;
import java.util.ArrayList;

import product.dao.ProductDAO;
import product.entity.Product;
/**
 * <pre>
 *  프로그램의 주요 로직을 담당하는 control 클래스
 * </pre>
 * 
 */
public class ProductBiz {

	/**
	 * NoticeBiz 클래스의 디폴트 생성자
	 */
	public ProductBiz() {

	}

	/**
	 * 유효한 사용자인지를 검사하기 위해 고객 아이디와 비밀번호를 전달하여 LoginDAO 클래스의 method 를 호출한다.
	 * 
	 * @param userId
	 *            고객 아이디
	 * @param pass
	 *            고객 패스워드
	 * @return boolean 사용자의 유효여부
	 */
	public boolean getLoginUser(String userId, String pass) {
		boolean success = false;
		Connection conn = getConnection();
		ProductDAO loginDAO = new ProductDAO(conn);
		success = loginDAO.loginCheck(userId, pass);
		close(conn);
		return success;
	}

	/**
	 * 전체 공지사항의 리스트를 구해오기 위해 NoticeDAO 클래스의 메소드를 호출한다.
	 * 
	 * @return ArrayList<Notice> 전체 공지사항정보를 담고 있는 리스트
	 */
	public ArrayList<Product> getProductList() {
		ArrayList<Product> list = null;
		// 코드를 입력 하시오

		Connection conn = getConnection();
		ProductDAO dao = new ProductDAO(conn);
		list = dao.productList();
		close(conn);
		return list;
	}

	/**
	 * 특정 공지사항정보를 구해오기 위해 NoticeDAO 클래스의 메소드를 호출한다.
	 * 
	 * @param num
	 *            공지사항번호
	 * @return Notice 특정 제품정보를 갖고있는 Notice 객체
	 */
	public Product productView(String num) {

		Product n = null;
		Connection conn = getConnection();
		ProductDAO dao = new ProductDAO(conn);
		
		try {
			n = dao.productView(Integer.parseInt(num));
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		
		close(conn);
		return n;
	}

	/**
	 * 공지사항 정보를 입력한다.
	 * 
	 * @param n
	 *            공지사항정보를 담고 있는 객체
	 * @return boolean 공지사항 저장의 성공 여부
	 */
	public boolean productInsert(Product n) {
		Connection conn = getConnection();
		ProductDAO dao = new ProductDAO(conn);
		boolean success = dao.productInsert(n);
		close(conn);
		return success;
	}

	public boolean productDelete(String num) {
		Connection conn = getConnection();
		ProductDAO dao = new ProductDAO(conn);
		boolean success = false;
		try {
			success = dao.productDelete(Integer.parseInt(num));
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		close(conn);
		return success;
	}

	public boolean productUpdate(Product n) {
		Connection conn = getConnection();
		ProductDAO dao = new ProductDAO(conn);
		boolean success = dao.productUpdate(n);
		close(conn);
		return success;
	}
}
