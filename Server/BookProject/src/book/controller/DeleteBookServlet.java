package book.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import book.biz.BookBiz;

/**
 * Servlet implementation class DeleteBookServlet
 */
@WebServlet(urlPatterns = {"/delete"}, name = "Delete")
public class DeleteBookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		String isbn = request.getParameter("isbn");

		BookBiz biz = new BookBiz();

		if (biz.deleteBook(isbn)) {
			// delete successful
			response.sendRedirect("/book/list");
		} else {
			System.out.println("삭제에 실패했습니다.");
			response.sendRedirect("/book/list");

		}
	}

}
