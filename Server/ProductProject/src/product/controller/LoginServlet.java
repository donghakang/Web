/*------------------------------------------------------------------------------
 * Name : LoginServlet
 * DESC : 사용자 로그인 시 사용되는 Controller 클래스
 * VER  : 1.0
 *----------------------------------------------------------------------------*/

package product.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import product.biz.ProductBiz;

/**
 * <pre>
 *  사용자 로그인 시 사용되는 서블릿 클래스
 * </pre>
 */
@WebServlet(urlPatterns = {"/LOGIN"}, name = "LOGIN")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	/**
	 * servlet service 메소드. 올바른 로그인인지 확인하고 인증되면 Session을 생성한다. 해당하는 화면으로 보여준다.
	 * 
	 * @param request
	 *            HttpServletRequest
	 * @param response
	 *            HttpServletResponse
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {

		request.setCharacterEncoding("UTF-8");

		String userId = request.getParameter("user");
		String pass = request.getParameter("pass");

		ProductBiz loginBiz = new ProductBiz();
		if (loginBiz.getLoginUser(userId, pass)) {
			// 로그인 확인
			// - 세션 시작
			System.out.println("LOGIN SUCCESSFUL");
			HttpSession session = request.getSession();
			session.setAttribute("loginComplete", userId);

			response.sendRedirect("home.jsp");
		} else {
			// 로그인 실패
			System.out.println("LOGIN FAILED");
			response.sendRedirect("fail.jsp");
		}

	}
}
