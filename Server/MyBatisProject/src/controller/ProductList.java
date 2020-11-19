package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ProductDao;
import entity.Product;

/**
 * Servlet implementation class ProductList
 */
@WebServlet(name = "List", urlPatterns = {"/list"})
public class ProductList extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		response.setCharacterEncoding("EUC-KR");
		ProductDao dao = new ProductDao();
		List<Product> list = dao.listProduct();

		if (list != null) {
			request.setAttribute("list", list);
			RequestDispatcher rd = request.getRequestDispatcher("/List.jsp");
			rd.forward(request, response);
		} else {
			PrintWriter out = response.getWriter();
			out.println("<script>");
			out.println("alert('리스트가 비어있습니다.')");
			out.println("</script>");
		}
	}

}
