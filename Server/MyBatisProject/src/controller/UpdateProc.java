package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ProductDao;
import entity.Product;

/**
 * Servlet implementation class UpdateProc
 */
@WebServlet(name = "UpdateProc", urlPatterns = {"/updateProc"})
public class UpdateProc extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("EUC-KR");

		try {
			int no = Integer.parseInt(request.getParameter("no"));
			String item = request.getParameter("item");
			int price = Integer.parseInt(request.getParameter("price"));
			String regdate = request.getParameter("regdate");

			Product product = new Product(no, item, price, regdate);
			ProductDao dao = new ProductDao();
			if (dao.updateProduct(product)) {
				response.sendRedirect("/product/list");
			} else {
				PrintWriter out = response.getWriter();
				out.println("<script>");
				out.println("alert('수정할 때 오류가 발생했습니다.')");
				out.println("</script>");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
