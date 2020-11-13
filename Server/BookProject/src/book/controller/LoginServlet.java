package book.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import book.biz.LoginBiz;
import book.dto.LoginDTO;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet(urlPatterns = {"/login"}, name = "LOGIN")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		String id = request.getParameter("id");
		String pass = request.getParameter("pwd");

		LoginBiz biz = new LoginBiz();
		if (biz.getLoginUser(id, pass)) {

			System.out.println("Login Successful");
			LoginDTO user = new LoginDTO(id, pass);

			HttpSession session = request.getSession();
			session.setAttribute("logIn", user); // id 만 가져간다.

			response.sendRedirect("login/loginOk.jsp");

		} else {
			System.out.println("Login Unsuccessful");
			response.sendRedirect("login/fail.jsp");
		}
	}

}
