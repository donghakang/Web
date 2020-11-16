/*------------------------------------------------------------------------------
 * Name : ViewNoticeServlet
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
 *  공지사항 상세 조회에 사용되는 서블릿 클래스
 * </pre>
 */
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

		request.setCharacterEncoding("euc-kr");

		// 구현 하시오

	}
}
