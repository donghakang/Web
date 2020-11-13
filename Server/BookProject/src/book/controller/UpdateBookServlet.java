package book.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import book.biz.BookBiz;
import book.dto.BookDTO;

/**
 * Servlet implementation class UpdateBookServlet
 */
@WebServlet(name = "Update", urlPatterns = {"/update"})
public class UpdateBookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");

		String isbn = request.getParameter("isbn");
		String title = request.getParameter("title");
		String author = request.getParameter("author");
		String company = request.getParameter("company");
		int price = Integer.parseInt(request.getParameter("price"));

		BookDTO bk = new BookDTO(isbn, title, author, company, price);
		BookBiz biz = new BookBiz();
		if (biz.updateBook(bk)) {
			// update successful
			response.sendRedirect("/book/list");
		} else {
			System.out.println("업데이트 하지 못했습니다.");
			response.sendRedirect("/book/list");
		}
	}

}
