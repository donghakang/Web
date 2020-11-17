/*------------------------------------------------------------------------------
 * Name : SaveNoticeServlet
 * DESC : 사용자 로그인 시 사용되는 Controller 클래스
 * VER  : 1.0
 *----------------------------------------------------------------------------*/

package product.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import product.biz.ProductBiz;
import product.entity.Product;

/**
 * <pre>
 *  공지사항 저장시 사용되는 서블릿 클래스
 * </pre>
 */
@WebServlet(urlPatterns = {"/SAVE"}, name = "SAVE")
public class SaveProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * servlet service 메소드. 공지사항 정보를 저장하는클래스
	 * 
	 * @param request
	 *            HttpServletRequest
	 * @param response
	 *            HttpServletResponse
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {

		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("EUC-KR");

		HttpSession session = request.getSession();

		String writer = (String) session.getAttribute("loginComplete");
		String name = request.getParameter("title");
		String description = request.getParameter("content");

		ProductBiz biz = new ProductBiz();
		Product n = new Product(-1, writer, "", name, description);
		PrintWriter out = response.getWriter();
		if (biz.productInsert(n)) {
			// Insert successful
			out.println("<script>");
			out.println("alert('상품이 등록 되었습니다')");
			out.println("window.location.href='/product/LIST'");
			out.println("</script>");
		} else {
			// Insertion failed.
			out.println("<script>");
			out.println("alert('상품을 등록하는 와중, 오류가 발생했습니다.')");
			out.println(
					"window.location.href='/product/product/productInput.jsp'");
			out.println("</script>");
		}

	}
}
