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
 * Servlet implementation class Insert
 */
@WebServlet(name = "Login", urlPatterns = {"/login"})
public class Insert extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("EUC-KR");
		try {
			String item = request.getParameter("item");
			int price = Integer.parseInt(request.getParameter("price"));
			String regdate = request.getParameter("regdate");

			Product product = new Product(-1, item, price, regdate);
			ProductDao dao = new ProductDao();

			if (dao.insertProduct(product)) {
				// 추가 성공
				response.sendRedirect("/product/list");
			} else {
				// 추가 실패
				PrintWriter out = response.getWriter();
				out.println("<script>");
				out.println("alert('추가할 때 오류가 발생했습니다.')");
				out.println("</script>");
			}
		} catch (NumberFormatException e) {
			// 가격에 숫자가 입력되지 않는 경
			System.out.println("Number only");

		}

	}

}
