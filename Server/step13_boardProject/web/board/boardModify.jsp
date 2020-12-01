<%@page import="com.board.dto.BoardDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../menu.jsp" %>

<script>
function checkBoardModify(){
	if(document.boardModifyForm.subject.value=="")
		alert("제목을 입력하세요");
	else if(document.boardModifyForm.content.value=="")
		alert("내용을 입력하세요");
	else
		document.boardModifyForm.submit();
}
</script>
<%
	LoginDTO log = (LoginDTO)session.getAttribute("logOK");
	BoardDTO dto = (BoardDTO)request.getAttribute("dto");
	int seq = (Integer)request.getAttribute("seq");
	int pg = (Integer)request.getAttribute("pg");
%>
<form name="boardModifyForm" method="post" action="/bbs/boardUpdate.do?seq=<%=seq%>&pg=<%=pg%>">
<h3>글수정</h3>
<table border="1" >
	<tr>
		<td>아이디</td>
		<td><input type="text" name="id" size="50"  value="<%=log.getId() %>" readonly></td>
	</tr>
	<tr>
		<td>이름</td>
		<td><input type="text" name="name" size="50" value="<%=log.getName() %> " readonly></td>
	</tr>	
	<tr>
		<td>이메일</td>
		<td><input type="text" name="email" size="50" value="<%=dto.getEmail()%>"></td>
	</tr>
	<tr>
		<td>제 목</td>
		<td><input type="text" name="subject" value="<%=dto.getSubject()%> " size="50"></td>
	</tr>
	
	<tr>
		<td>내 용</td>
		<td><textarea name="content" cols="50" rows="15"> <%=dto.getContent()%></textarea></td>
	</tr>
	
	<tr>
		<td colspan="2" align="center">
		<input type="button" value="글수정" onclick="checkBoardModify()">
		<input type="reset" value="다시작성">
		</td>
		
	</tr>
</table>
</form>
</body>
</html>