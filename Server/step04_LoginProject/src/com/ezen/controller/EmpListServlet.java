package com.ezen.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ezen.biz.EmpBiz;
import com.ezen.entity.EmpEntity;

@WebServlet(name = "List", urlPatterns = {"/list"})
public class EmpListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		EmpBiz biz = new EmpBiz();

		List<EmpEntity> list = biz.listEmp();
		if (list != null) {
			System.out.print("list");

			/* request 객체 */
			RequestDispatcher rd = request
					.getRequestDispatcher("emptest/empList.jsp");
			request.setAttribute("emp", list); // 리퀘스트 명 : emp
			rd.forward(request, response);

		}

	}
}