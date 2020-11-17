package com.ezen.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.ezen.biz.EmpBiz;
import com.ezen.entity.EmpEntity;

@WebServlet(name = "Delete", urlPatterns = { "/delete" })
public class EmpDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		EmpEntity entity=new EmpEntity();
		entity.setEno(Integer.parseInt(request.getParameter("eno")));
		
		EmpBiz biz=new EmpBiz();
		int n=biz.deleteEmp(entity);
		
		if(n > 0){
			response.sendRedirect("/log/list");
		}else{
			response.sendRedirect("/log/list");
		}
	}
}
