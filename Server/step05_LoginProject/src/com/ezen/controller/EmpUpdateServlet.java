package com.ezen.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ezen.biz.EmpBiz;
import com.ezen.entity.EmpEntity;

@WebServlet(name = "Update", urlPatterns = { "/update" })
public class EmpUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		EmpEntity entity=new EmpEntity();
		entity.setEno(Integer.parseInt(request.getParameter("eno")));
		entity.setPhone(request.getParameter("phone"));
		entity.setDept(request.getParameter("dept"));
		
		EmpBiz biz=new EmpBiz();
		int n=biz.updateEmp(entity);
		
		if(n>0) {
			response.sendRedirect("/log/list");
		}else {
			response.sendRedirect("/log/emptest/empUpdate.jsp");
		}
	}
}
