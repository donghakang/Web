package controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.EmpDao;
import entity.Emp;

@WebServlet(name = "Search", urlPatterns = { "/search" })
public class SearchEmp extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Map객체를  각각 필드의 key와 value를 저장
		Map<String, Object> map=new HashMap<>();
		map.put("eno",10);
		map.put("dept", "%" + "업" + "%" );   // "%업%"
		
		EmpDao dao=new EmpDao();
		List<Emp> list=dao.getEmpByEnoAndDept(map);
		
		if(list != null) {
			request.setAttribute("list", list);
			RequestDispatcher rd=request.getRequestDispatcher("list.jsp");
			rd.forward(request, response);
		}
	}
}














