/*------------------------------------------------------------------------------
 * Name : LogoutServlet
 * DESC : 사용자 로그 아웃시 사용되는 Controller 클래스
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
 *  사용자 로그아웃 시 사용되는 서블릿 클래스
 * </pre>
 * 
 */
public class LogoutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	/**
	 * servlet service 메소드. 현재 사용하는 session을 invalidate 한다. index.html 화면으로
	 * 보여준다.
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
