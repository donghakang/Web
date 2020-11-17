package product.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import product.biz.ProductBiz;

/**
 * Servlet implementation class DeleteProductServlet
 */
@WebServlet(urlPatterns = {"/DELETE"}, name = "DELETE")
public class DeleteProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("EUC-KR");
		
		
		String num = request.getParameter("num");
		
		ProductBiz biz = new ProductBiz();
		PrintWriter out = response.getWriter();
		if(biz.productDelete(num)) {
			
			out.println("<script>");
			out.println("alert('삭제 완료했습니다.')");
			out.println(
					"window.location.href='/product/LIST'");
			out.println("</script>");
		} else {
			out.println("<script>");
			out.println("alert('삭제할 때 오류가 발생했습니다.')");
			out.println(
					"window.location.href='/product/LIST'");
		}
	}

}
