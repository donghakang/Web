<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
request.setCharacterEncoding("UTF-8");
String productname = request.getParameter("productname");
int price = Integer.parseInt(request.getParameter("price"));
int discountrate = Integer.parseInt(request.getParameter("discountrate"));

if (discountrate < 0 || discountrate > 100) {
%>
	할인율은 0~100 사이의 숫자를 입력해야합니다.
<%
} else {
	double discounted = price - (price * (discountrate * 0.01));
%>
	<%=productname %> 상품의 <%=discountrate %>% 할인된 가격은 <%=(int)(discounted) %> 입니다. 
<%
}
%>

</body>
</html>