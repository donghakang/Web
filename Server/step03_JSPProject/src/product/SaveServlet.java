package product;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SaveServlet
 */
@WebServlet(urlPatterns = {"/save"}, name = "SAVE")
public class SaveServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html;charset=UTF-8");

		String p = request.getParameter("item");
		HttpSession session = request.getSession();

		ArrayList<String> list = (ArrayList<String>) session
				.getAttribute("shop");
		if (list == null) {
			list = new ArrayList<String>();
			list.add(p);
			session.setAttribute("shop", list);
		} else {
			list.add(p);
		}

		response.getWriter().append("<html><head></head><body>");
		response.getWriter().append("Product Added<br>");
		response.getWriter().append("<a href='/edu/basket'>My Cart</a>");
		response.getWriter().append("</body></html>");

	}

}
