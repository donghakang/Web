/*------------------------------------------------------------------------------
 * Name : ListNoticeServlet
 * DESC : 사용자 로그인 시 사용되는 Controller 클래스
 * VER  : 1.0
 *----------------------------------------------------------------------------*/

package product.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import product.biz.ProductBiz;
import product.entity.Product;

/**
 * <pre>
 *  사용자 로그인 시 사용되는 서블릿 클래스
 * </pre>
 */
@WebServlet(urlPatterns = {"/LIST"}, name = "LIST")
public class ListProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * servlet service 메소드. NoticeBiz 객체를 생성하여 공지사항 목록을 요청한다. 전달받은 공지사항 목록을
	 * list라는 이름으로 request 객체에 담는다. notice/NoticeList.jsp 결과 페이지로 이동한다.
	 * 
	 * @param request
	 *            HttpServletRequest
	 * @param response
	 *            HttpServletResponse
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		request.setCharacterEncoding("UTF-8");

		ProductBiz biz = new ProductBiz();
		ArrayList<Product> list = biz.getProductList();
		// Request 객체
		RequestDispatcher rd = request
				.getRequestDispatcher("product/productList.jsp");
		request.setAttribute("productList", list);
		rd.forward(request, response);
	}
}
