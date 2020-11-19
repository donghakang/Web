package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ProductDao;

/**
 * Servlet implementation class Delete
 */
@WebServlet(name = "Delete", urlPatterns = {"/delete"})
public class Delete extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("EUC-KR");
		int no = Integer.parseInt(request.getParameter("no"));

		ProductDao dao = new ProductDao();
		if (dao.deleteProduct(no)) {
			// 삭제 성공
			response.sendRedirect("/product/list");
		} else {
			PrintWriter out = response.getWriter();
			out.println("<script>");
			out.println("alert('삭제할 때 오류가 발생했습니다.')");
			out.println("</script>");
		}
	}

}
