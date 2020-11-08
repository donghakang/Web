package com.calc;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestForm
 */
@WebServlet(name = "POST", urlPatterns = { "/testform.do" })
public class TestForm extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1. 한글처리 (UTF-8, EUC-KR)..
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		
//		String[] cars = request.getParameterValues("car");
		String gender = request.getParameterValues("gender")[0];
		
		String address = request.getParameterValues("address")[0];
		String telecom = request.getParameterValues("telecom")[0];
		
		response.getWriter().append("<html><head><title></title></head><body>");
		response.getWriter().append(id + ", " + pwd + ", " + gender + ", " + address + ", " + telecom);
		// 3. 출력
		response.getWriter().append("<br><a href='TestForm.html'>뒤로</a>");
		response.getWriter().append("</body></html>");
	}

}
