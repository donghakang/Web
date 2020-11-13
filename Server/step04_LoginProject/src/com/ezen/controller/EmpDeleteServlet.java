package com.ezen.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ezen.biz.EmpBiz;

@WebServlet(name = "Delete", urlPatterns = {"/delete"})
public class EmpDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		EmpBiz biz = new EmpBiz();

		int empNo = Integer.parseInt(request.getParameter("eno"));

		int n = biz.deleteEmp(empNo);

		if (n > 0) {
			// System.out.println("Delete complete");
			response.sendRedirect("/log/list");
		} else {
			// System.out.println("fail to delete");
			response.sendRedirect("/log/list");
		}
	}
}