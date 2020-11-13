<%@page import="java.text.DecimalFormat"%>
<%@page import="java.util.Locale"%>
<%@page import="java.text.NumberFormat"%>
<%@page import="java.util.ArrayList"%>
<%@page import="book.dto.BookDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../menu.jsp"%>

<style>
	h1 {
		text-align: center;
	}

	
	#addBook {
		background-color: red;
		text-align: center;
	}
</style>

<h1>도서전체확인</h1>
<%
	ArrayList<BookDTO> list = (ArrayList<BookDTO>) request.getAttribute("bookList");
	DecimalFormat df = new DecimalFormat(",###,###,###원");
	if (list != null) {
%>
		<table border="1px double #000" align="center">

			<tr>
				<th>도서코드</th>
				<th>책이름</th>
				<th>저자</th>
				<th>출판사</th>
				<th>가격</th>
				<th>수정</th>
				<th>삭제</th>
				
			</tr>	
<%
		for (BookDTO book : list) {
%>				
			<tr>
				<td><%=book.getIsbn() %></td>
				<td><%=book.getTitle() %></td>
				<td><%=book.getAuthor() %></td>
				<td><%=book.getCompany() %></td>
				<td><%=df.format(book.getPrice())%></td>
				<td>
					<form action="/book/book/bookUpdate.jsp">
						<input type="hidden" name="isbn" value="<%=book.getIsbn() %>" />
						<input type="hidden" name="title" value="<%=book.getTitle() %>" />
						<input type="hidden" name="author" value="<%=book.getAuthor() %>" />
						<input type="hidden" name="company" value="<%=book.getCompany() %>" />
						<input type="hidden" name="price" value="<%=book.getPrice() %>" />
						<input type="submit" value="수정" />
					</form>
				</td>
				<td>
					<form action="/book/delete" method="post">
						<input type="hidden" name="isbn" value="<%=book.getIsbn() %>" />
						<input type="submit" value="삭제" onclick="return confirm('삭제하시겠습니까?')"/>
					</form>
				</td>
			</tr>
			
<%				
		}
%>		
			<caption align="bottom"><a href="/book/book/bookInput.jsp"> [도서등록] </a></caption>	
		</table>		
<%				
	}
%>	
		

</body>
</html>