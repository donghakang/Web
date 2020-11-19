package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.biz.LoginBiz;
import com.entity.User;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet(urlPatterns = {"/login"}, initParams = {
		@WebInitParam(name = "login", value = "")})
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		response.setCharacterEncoding("EUC-KR");

		String id = request.getParameter("id");
		String pw = request.getParameter("pw");

		LoginBiz biz = new LoginBiz();
		User user = biz.getLoginUser(id, pw);
		if (user != null) {
			// 로그인 성공
			HttpSession session = request.getSession();
			session.setAttribute("loginUser", user);

			response.sendRedirect("index.jsp");
		} else {
			// 로그인 실패
			PrintWriter out = response.getWriter();
			out.println("<script>");
			out.println("alert('아이디와 비밀번호가 일치하지 않습니다.')");
			out.println("window.location.href='loginPage.jsp'");
			out.println("</script>");
		}

	}

}

//
// if (biz.getLoginUser(id, pass)) {
//
// System.out.println("Login Successful");
// LoginDTO user = new LoginDTO(id, pass);
//
// HttpSession session = request.getSession();
// session.setAttribute("logIn", user); // id 만 가져간다.
//
// response.sendRedirect("login/loginOk.jsp");
//
// } else {
// System.out.println("Login Unsuccessful");
// response.sendRedirect("login/fail.jsp");
// }