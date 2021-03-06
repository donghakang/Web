package com.calc;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalcResult
 */
@WebServlet(name = "POST", urlPatterns = { "/calc" })
public class CalcResult extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1. 한글처리 (UTF-8, EUC-KR)..
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		
		// 2. 데이터 가져오기 
		int a = Integer.parseInt(request.getParameter("a"));
		int b = Integer.parseInt(request.getParameter("b"));
		String op = request.getParameterValues("op")[0];
		
		String ans = "";
		
		if (op.equals("+")) {
			ans = (a + b) + ""; 
		} else if (op.equals("-")) {
			ans = (a - b) + "";
		} else if (op.equals("*")) {
			ans = (a * b) + "";
		} else if (op.equals("/")) {
			ans = ((double)a / (double)b) + "";
		}
		
		// 3. 출력
		response.getWriter().append("<html><head><title></title></head>");
		response.getWriter().append("<body>");
		response.getWriter().append("<h1>테스트 프로그래밍</h1>");
		response.getWriter().append("답 : " + ans + "입니다." );
		
		response.getWriter().append("</body></html>");
	}


}



/*
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1.한글처리(UTF-8, EUC-KR등)
		response.setContentType("text/html;charset=UTF-8");
		
		//2.데이터 가져오기
		String name=request.getParameter("irum");
		String passwd=request.getParameter("amho");
		
		//3.출력
		response.getWriter().append("<html><head><title></title></head>");
		response.getWriter().append("<body>");
		
		response.getWriter().append("이름:" + name +"<br>");
		response.getWriter().append("암호:" + passwd +"<br>");
		
		response.getWriter().append("<a href='getTest.html'>처음으로</a>");
		response.getWriter().append("</body></html>");
	}

}


*/









