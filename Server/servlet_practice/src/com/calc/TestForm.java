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
		
		String[] cars = request.getParameterValues("car");
		
		String comment = request.getParameter("comment");
		
		response.getWriter().append("<html><head><title></title></head><body>");
		response.getWriter().append("<ul>");
		response.getWriter().append("<li>" + "성별 : " + gender + "</li>");
		response.getWriter().append("<li>" + "거주지역 : " + address + "</li>");
		response.getWriter().append("<li>" + "비밀번호 : " + pwd + "</li>");
		response.getWriter().append("<li>" + "하고싶은말 : " + comment + "</li>");
		
		for (String car : cars) {
			response.getWriter().append("<li>" + "보유한 차 : " + car + "</li>");
		}
		
		response.getWriter().append("<li>" + "아이디 : " + id + "</li>");
		// 3. 출력
		
		response.getWriter().append("</ul>");
		response.getWriter().append("<br><a href='TestForm.html'>뒤로</a>");
		response.getWriter().append("</body></html>");
	}

}
