package book.biz;

import java.util.ArrayList;

import book.dao.BookDAO;
import book.dto.BookDTO;

public class BookBiz {

	public BookBiz() {
		super();
	}

	public boolean bookInsert(BookDTO bk) {
		BookDAO dao = new BookDAO();
		return dao.bookInsert(bk);
	}

	public ArrayList<BookDTO> getBookList() {
		BookDAO dao = new BookDAO();
		return dao.getBookList();
	}

	public boolean updateBook(BookDTO bk) {
		BookDAO dao = new BookDAO();
		return dao.updateBook(bk);
	}

	public boolean deleteBook(String isbn) {
		BookDAO dao = new BookDAO();
		return dao.deleteBook(isbn);
	}

}
