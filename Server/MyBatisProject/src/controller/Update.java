package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ProductDao;
import entity.Product;

/**
 * Servlet implementation class Update
 */
@WebServlet(name = "Update", urlPatterns = {"/update"})
public class Update extends HttpServlet {
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

		System.out.println(no);
		ProductDao dao = new ProductDao();

		Product product = dao.getProduct(no);

		if (product != null) {
			// 불러오기 성공
			request.setAttribute("product", product);
			RequestDispatcher rd = request.getRequestDispatcher("/Update.jsp");
			rd.forward(request, response);
		} else {
			// 오류
			PrintWriter out = response.getWriter();
			out.println("<script>");
			out.println("alert('불러올 때 오류가 발생했습니다.')");
			out.println("</script>");
		}
	}

}
