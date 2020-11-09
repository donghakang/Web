package com.ezen.method;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "POST2", urlPatterns = { "/post2.do" })
public class PostServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		
		String[] hobby=request.getParameterValues("hobby");
		if(hobby != null) {
			response.getWriter().append("<h3>** 당신의 취미 **</h3>");
			
			for(int i=0; i<hobby.length; i++)
			{
				response.getWriter().append("<li>"+ hobby[i] +"</li>");
			}
		}
		//----------------------------------------------------------------
		Enumeration e=request.getParameterNames();
		while(e.hasMoreElements())
		{
			String title=(String)e.nextElement();
			String[] v=request.getParameterValues(title);
			
			if(title.equals("hobby")) {
				continue;
			}
			
			for(int i=0; i<v.length; i++) {
				response.getWriter().append("<li>"+ title + ":" + v[i] +"</li>");
			}
		}
		
		response.getWriter().append("<a href='/lab/postTest2.html'>처음으로</a>");
	}
}









