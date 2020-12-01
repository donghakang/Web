<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../menu.jsp" %>     
<%
	int pg=(Integer)request.getAttribute("pg");
%>
<body onload="alert('수정하였습니다'); location.href='/bbs/boardList.do?pg=<%=pg%>';">

</body>
</html>