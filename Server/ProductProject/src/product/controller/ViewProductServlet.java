/*------------------------------------------------------------------------------
 * Name : ViewNoticeServlet
 * DESC : 사용자 로그인 시 사용되는 Controller 클래스
 * VER  : 1.0
 *----------------------------------------------------------------------------*/

package product.controller;

import java.io.IOException;
import java.io.PrintWriter;

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
 *  공지사항 상세 조회에 사용되는 서블릿 클래스
 * </pre>
 */
@WebServlet(urlPatterns = {"/VIEW"}, name = "VIEW")
public class ViewProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * servlet service 메소드. 특정 공지사항 번호를 입력받아 공지사항 내용을 보여준다.
	 * 
	 * @param request
	 *            HttpServletRequest
	 * @param response
	 *            HttpServletResponse
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {

		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		String num = request.getParameter("num");
		
		ProductBiz biz = new ProductBiz();
		Product n = biz.productView(num);
		
		if (n != null) {
			// 성공
			RequestDispatcher rd=request.getRequestDispatcher("product/productView.jsp");
			request.setAttribute("product", n);
			rd.forward(request, response);
		} else {
			// 실패
			PrintWriter out = response.getWriter();
			out.println("<script>");
			out.println("alert('불로오는데 오류가 발생했습니다.')");
			out.println("</script>");
		}

	}
}
