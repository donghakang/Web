package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.EmpDao;
import entity.Emp;

@WebServlet(name = "Update", urlPatterns = {"/update"})
public class UpdateEmp extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");

		Emp ob = new Emp();
		ob.setEno(Integer.parseInt(request.getParameter("eno")));
		ob.setPhone(request.getParameter("phone"));
		ob.setDept(request.getParameter("dept"));

		EmpDao dao = new EmpDao();
		int n = dao.updateEmp(ob);

		if (n > 0) {
			response.sendRedirect("/list");
		}
	}
}
