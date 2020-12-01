<%@page import="com.board.dto.BoardDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../menu.jsp" %>

<%
	BoardDTO dto = (BoardDTO)request.getAttribute("dto");
	int pg = (Integer)request.getAttribute("pg");
	int seq = (Integer)request.getAttribute("seq");
%>
<table width="500">
<tr>
	<td colspan="3" bgcolor="777777"></td>
</tr>

<tr>
	<td colspan="3"><font size="5"><%=dto.getSubject() %> </font></td>
</tr>

<tr>
	<td colspan="3" bgcolor="777777"></td>
</tr>
<tr>
	<td width="150">글번호 : <%=dto.getSeq() %> </td>
	<td width="200">작성자 : <%=dto.getId() %> </td>
	<td width="150">조회수 : <%=dto.getHit() %> </td>
</tr>
<tr>
	<td colspan="3" bgcolor="777777"></td>
</tr>

<tr>
	<td colspan="3" height="200" valign="top"><pre> <%= dto.getContent() %></pre></td>
</tr>

<tr>
	<td colspan="3" bgcolor="777777"></td>
</tr>
</table>

<input type="button" value="목록" onclick="location.href='boardList.do?pg=<%=pg%>'">
<%
	LoginDTO log = (LoginDTO)session.getAttribute("logOK");
	if (log.getId().equals(dto.getId())) {
%>
		<input type="button" value="글수정" onclick="location.href='boardModify.do?seq=<%=seq%>&pg=<%=pg%>'">
		<input type="button" value="글삭제" onclick="if(confirm('삭제하시겠습니까?')){location.href='boardDelete.do?seq=<%=seq%>&pg=<%=pg%>'}">
<% 
	}
%>

<input type="button" value="답글" onclick="location.href='boardReplyForm.do?pseq=<%=seq %>&pg=<%=pg %>'">
</body>
</html>




