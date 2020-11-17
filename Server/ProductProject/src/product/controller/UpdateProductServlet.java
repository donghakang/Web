package product.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import product.biz.ProductBiz;
import product.entity.Product;

/**
 * Servlet implementation class UpdateProductServlet
 */
@WebServlet(urlPatterns = {"/UPDATE"}, name = "UPDATE")
public class UpdateProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			request.setCharacterEncoding("UTF-8");
			response.setCharacterEncoding("EUC-KR");
			
			int num = Integer.parseInt(request.getParameter("num"));
			String writer = request.getParameter("writer");
			String name = request.getParameter("name");
			String description = request.getParameter("description");
			
			Product n = new Product(num, writer, null, name, description);
			ProductBiz biz = new ProductBiz();
			PrintWriter out = response.getWriter();
			if (biz.productUpdate(n)) {
				out.println("<script>");
				out.println("alert('수정 완료했습니다.')");
				out.println(
						"window.location.href='/product/LIST'");
				out.println("</script>");	
			} else {
				out.println("<script>");
				out.println("alert('수정할 때 오류가 발생했습니다.')");
				out.println(
						"window.location.href='/product/LIST'");
				out.println("</script>");	
			}
		} catch (NumberFormatException e ) {
			e.printStackTrace();
		}
		
	}

}
