package com.ezen.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ezen.biz.EmpBiz;
import com.ezen.entity.EmpEntity;

@WebServlet(name = "Insert", urlPatterns = {"/insert"})
public class EmpInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");

		EmpEntity emp = new EmpEntity();
		emp.setEname(request.getParameter("ename"));
		emp.setPhone(request.getParameter("phone"));
		emp.setDept(request.getParameter("dept"));

		EmpBiz biz = new EmpBiz();
		int n = biz.insertEmp(emp);

		if (n > 0) {
			response.sendRedirect("/log/list");
		} else {
			// System.out.println("Fail");
			response.sendRedirect("/log/emptest/empInsert.jsp");
		}
	}
}
