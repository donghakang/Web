package com.ezen.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ezen.biz.LoginBiz;
import com.ezen.entity.LoginEntity;

@WebServlet(name = "Login", urlPatterns = { "/login" })
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id=request.getParameter("id");
		String pwd=request.getParameter("pwd");
//		System.out.println(id+"  "+pwd);
		
		LoginBiz biz=new LoginBiz();
		LoginEntity entity=biz.getLoginUser(id,pwd);
		
		if(entity != null) {
			/*세션설정*/
			HttpSession session=request.getSession();   
			session.setAttribute("logOK", entity); //세션이름: logOK
			
			response.sendRedirect("/log/logtest/loginOk.jsp");
		}else {
			response.sendRedirect("/log/logtest/loginFail.jsp");
		}
	}
}








