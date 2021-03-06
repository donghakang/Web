package book.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import book.dto.LoginDTO;

/**
 * Servlet implementation class LogoutServlet
 */
@WebServlet(urlPatterns = {"/LOGOUT"}, name = "LOGOUT")
public class LogoutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();

		LoginDTO user = (LoginDTO) session.getAttribute("logIn");

		if (user != null) {
			session.removeAttribute("logIn");
			response.sendRedirect("/book/index.jsp");
		}
	}

}
