package score;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/score.do"}, name = "POST")
public class ScroeResult extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");

		String name = request.getParameter("name");
		int kor = Integer.parseInt(request.getParameter("kor"));
		int eng = Integer.parseInt(request.getParameter("eng"));
		int mat = Integer.parseInt(request.getParameter("mat"));

		double avg = (kor + eng + mat) / 3.0;
		String result = "";

		if (avg < 60) {
			result = "불합격";
		} else {
			result = "합격";
		}

		response.getWriter().append("<html><head><title></title></head>");
		response.getWriter().append("<body>");

		response.getWriter().append("이름: " + name + "<br>");
		response.getWriter().append("평균: " + avg + "<br>");
		response.getWriter().append("결과: " + result + "<br>");

		response.getWriter().append("<a href='ex4/score.html'>처음으로 </a>");
		response.getWriter().append("</body></html>");
	}

}
