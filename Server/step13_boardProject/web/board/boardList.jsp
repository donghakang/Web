<%@page import="com.board.dto.BoardPaging"%>
<%@page import="com.board.dto.BoardDTO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../menu.jsp" %>
<link rel="stylesheet" href="styleBoard.css">
<script>
function checkLogin(id,seq,pg){
	if (id == 'null') {
		alert("먼저 로그인을 해주세요");
	} else {
		location.href = "/bbs/boardView.do?seq=" + seq + "&pg=" + pg;
	}
	
}
</script>
<%
	request.setCharacterEncoding("UTF-8");
	List<BoardDTO> list = (List<BoardDTO>)request.getAttribute("list");
	int pg = (Integer)request.getAttribute("pg");
	BoardPaging paging = (BoardPaging)request.getAttribute("paging");	
%>
<table>
	<tr>
		<td colspan="5" bgcolor="777777"></td>
	</tr>
	<tr>
		<th width="100">글번호</th>
		<th width="300">제목</th>
		<th width="100">작성자</th>
		<th width="100">조회수</th>
		<th width="100">작성일</th>
	</tr>
	<tr>
		<td colspan="5" bgcolor="777777"></td>
	</tr>
<%
	if (list != null) {
		for (BoardDTO ob: list) {
%>
			
		<tr>
			<td align="center"><%=ob.getSeq()%></td>
			<td>
<%
			for (int i = 0; i < ob.getLev(); i++) {
%>			
				&nbsp;		
<%
			}

			if (ob.getPseq() != 0) {
%>
				<img src="image/reply.gif">
<% 
			}
%>

			<a href="#" onclick="checkLogin('<%=ob.getId() %>', '<%=ob.getSeq() %>', '<%=pg %>')" class="subjectA"> <%=ob.getSubject() %></a>
		
			</td>
			<td align="center"> <%=ob.getId() %> </td>
			<td align="center"> <%=ob.getHit()  %></td>
			<td align="center"> <%=ob.getLogtime() %></td>
		</tr>
		<tr>
			<td colspan="5" bgcolor="cccccc"></td>
		</tr>
	
<%
		} // end for
	} // endif 	

%>	
	<tr>
		<td colspan="5" bgcolor="777777"></td>
	</tr>
	<tr>	
		<td colspan="5" align="center"> </td>
	</tr>
</table>
</body>
</html>





