/*------------------------------------------------------------------------------
 * Name : InputNoticeServlet
 * DESC : 공지사항 입력화면 요청에 사용되는 Controller 클래스
 * VER  : 1.0
 *----------------------------------------------------------------------------*/

package product.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * <pre>
 *  공지사항 입력 화면 요청 서블릿 클래스
 * </pre>
 */
@WebServlet(urlPatterns = {"/INPUT"}, name = "INPUT")
public class InputProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * servlet service 메소드. 공지사항 입력 화면을 연동하여 준다.
	 * 
	 * @param request
	 *            HttpServletRequest
	 * @param response
	 *            HttpServletResponse
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {

		// 구현 하시오

	}
}
