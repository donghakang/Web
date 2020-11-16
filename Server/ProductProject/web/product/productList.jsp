<!--
* NAME		: productList.jsp
* DESC		: 공지사항 목록 페이지
* VER		: 1.0
-->

<%@ page contentType="text/html;charset=euc-kr" %>
<%@ page import ="product.entity.Product, java.util.ArrayList" %>

<HTML>
	<HEAD>
		<TITLE>상품전체조회 </TITLE>
	</HEAD>

	<BODY>
		<P>
		<P align=center>
		<FONT color=#0000ff face=굴림 size=5>
		<STRONG>상품전체조회 </STRONG></FONT></P>
		<P>
		<CENTER>

		<TABLE border=0 width=70% cellpadding=4 cellspacing=4 style="font-size:10pt">
		<TR>
			<TH width=5% bgcolor=#9999FF><FONT color=white face="굴림"><NOBR>번호</NOBR></FONT></TH>
			<TH width=40% bgcolor=#9999FF><FONT color=white face="굴림"><NOBR>상품명</NOBR></FONT></TH>
			<TH width=10% bgcolor=#9999FF><FONT color=white face="굴림"><NOBR>등록자</NOBR></FONT></TH>
			<TH width=15% bgcolor=#9999FF><FONT color=white face="굴림"><NOBR>등록일자</NOBR></FONT></TH>
		</TR>

		<%-- 페이지 출력 --%>





       <!--  구현해 보세요. JSTL을 이용하시오 -->






		</TABLE>
		</CENTER>
		<p>
		<FONT size=2>&nbsp;&nbsp;&nbsp;[<A href="INPUT" target="main">글쓰기</A>] </FONT>
	</BODY>
</HTML>
