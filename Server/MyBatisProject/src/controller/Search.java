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

import dao.ProductDao;
import entity.Product;

/**
 * Servlet implementation class Search
 */
@WebServlet(name = "Search", urlPatterns = {"/search"})
public class Search extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		Map<String, Object> map = new HashMap<>();
		map.put("item", "%" + request.getParameter("item") + "%");
		map.put("price", Integer.parseInt(request.getParameter("price")));
		map.put("regdate", "%" + request.getParameter("regdate") + "%");

		ProductDao dao = new ProductDao();
		List<Product> list = dao.searchProduct(map);

		if (list != null) {
			request.setAttribute("list", list);
			RequestDispatcher rd = request.getRequestDispatcher("List.jsp");
			rd.forward(request, response);
		}
	}

}
