package com.calc;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UserInfo
 */
@WebServlet(name = "GET", urlPatterns = { "/user.do" })
public class UserInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		
		String loginName = "이순신";
		String loginPwd  = "1234";
		
		String name = request.getParameter("name");
		String pwd  = request.getParameter("pwd");

		
		response.getWriter().append("<html><head><title></title></head>");
		response.getWriter().append("<body>");
		
		
		if (name.equals(loginName) && pwd.equals(loginPwd)) {
			// login
			response.getWriter().append("당신의 이름은 " + "<span style='color:blue'>" + name + "</span>" + "이고<br>");
			response.getWriter().append("비밀번호는 " + "<span style='color:red'>" + pwd + "</span>" + "입니다.");
		} else {
			response.getWriter().append("이름 또는 비밀번호가 틀립니다.");
		}
		
		// 3. 출력
		response.getWriter().append("<br><a href='user.html'>뒤로</a>");
		response.getWriter().append("</body></html>");
	}


}
