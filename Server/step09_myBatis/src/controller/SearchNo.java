package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.EmpDao;
import entity.Emp;

@WebServlet(name = "SearchNo", urlPatterns = { "/searchno" })
public class SearchNo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int eno=Integer.parseInt(request.getParameter("eno"));
//		System.out.println("eno:" +  eno);
		
		EmpDao dao=new EmpDao();
		Emp entity=dao.searchNo(eno);
		
		
		if(entity != null) {
			request.setAttribute("emp", entity);
			RequestDispatcher rd=request.getRequestDispatcher("searchNo.jsp");
			rd.forward(request, response);
		}
	}
}






