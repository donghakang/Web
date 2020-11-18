package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.EmpDao;

@WebServlet(name = "Delete", urlPatterns = {"/delete"})
public class DeleteEmp extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		EmpDao dao = new EmpDao();
		int eno = Integer.parseInt(request.getParameter("eno"));
		int n = dao.deleteEmp(eno);

		if (n > 0) {
			response.sendRedirect("list");
		}
	}
}
