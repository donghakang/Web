<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../menu.jsp" %>

<%
	int n = (Integer)request.getAttribute("n");
	if (n > 0) {
		response.sendRedirect("boardList.do?pg=1");			
	} else {
%>
		저장 실패하였습니다.
<%		
	}
%>
</body>
</html>