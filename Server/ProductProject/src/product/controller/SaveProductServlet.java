/*------------------------------------------------------------------------------
 * Name : SaveNoticeServlet
 * DESC : 사용자 로그인 시 사용되는 Controller 클래스
 * VER  : 1.0
 *----------------------------------------------------------------------------*/

package product.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * <pre>
 *  공지사항 저장시 사용되는 서블릿 클래스
 * </pre>
 */
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
	public void doPost(HttpServletRequest req, HttpServletResponse res)
			throws IOException, ServletException {

		req.setCharacterEncoding("euc-kr");

		// 구현 하시오

	}
}
