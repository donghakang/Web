<!--
* NAME		: productList.jsp
* DESC		: 공지사항 목록 페이지
* VER		: 1.0
-->

<%@page import="product.entity.Product"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"
%>
<%@ include file="../menu.jsp"%>

<HTML>
<HEAD>
<TITLE>상품전체조회</TITLE>
<style>
h1 {
	color: #b1bfca
}

td {
	text-align: center;
}

table {
	margin-left: auto;
	margin-right: auto;
	width: 50%;
}

tr:hover{
	background-color: #ffe7f9;
}
</style>
<script src="http://code.jquery.com/jquery-3.4.1.min.js"></script>
<script>
	function viewDetail(i) {
		window.location.href = '/product/VIEW?num=' + i;
	}
</script>
</HEAD>


<BODY>
	<%
	ArrayList<Product> list = (ArrayList<Product>)request.getAttribute("productList");
	if (list != null) {
%>
	
	<TABLE border=0 width=70% cellpadding=4 cellspacing=4
		style="font-size: 10pt"
	>
		<caption>
			<h1>상품전체조회</h1>
		</caption>
		<TR>
			<TH width=5% bgcolor=#e3f2fd><FONT color=#888888 face="굴림"><NOBR>번호</NOBR></FONT></TH>
			<TH width=40% bgcolor=#e3f2fd><FONT color=#888888 face="굴림"><NOBR>상품명</NOBR></FONT></TH>
			<TH width=10% bgcolor=#e3f2fd><FONT color=#888888 face="굴림"><NOBR>등록자</NOBR></FONT></TH>
			<TH width=15% bgcolor=#e3f2fd><FONT color=#888888 face="굴림"><NOBR>등록일자</NOBR></FONT></TH>
		</TR>
		<%
		for (int i = 0; i < list.size(); i ++) {
%>
		<tr onclick="viewDetail(<%=list.get(i).getNum()%>)">
			<td><%=list.get(i).getNum() %></td>
			<td><%=list.get(i).getName() %></td>
			<td><%=list.get(i).getWriter() %></td>
			<td><%=list.get(i).getInDate() %></td>
		</tr>		
		
<%
		}
%>
	</TABLE>

<%
	} else {
%>
	<span id="warning">상품이 비어있습니다.</span>
<%
	}
%>
	<!--  구현해 보세요. JSTL을 이용하시오 -->
	<FONT size=2>&nbsp;&nbsp;&nbsp;[<A href="INPUT" target="main">글쓰기</A>]
	</FONT>
</BODY>
</HTML>
