package com.ezen.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ezen.biz.EmpBiz;
import com.ezen.entity.EmpEntity;

@WebServlet(name = "Update", urlPatterns = {"/update"})
public class EmpUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		int eno = Integer.parseInt(request.getParameter("eno"));
		String phone = request.getParameter("phone");
		String dept = request.getParameter("dept");
		EmpEntity emp = new EmpEntity(eno, "", phone, dept);
		EmpBiz biz = new EmpBiz();
		int n = biz.updateEmp(emp);

		if (n > 0) {
			response.sendRedirect("/log/list");
		} else {
			System.out.println("Update Failed");
			response.sendRedirect("/log/list");
		}

	}
}