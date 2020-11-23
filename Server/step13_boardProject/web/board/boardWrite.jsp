<%@page import="com.login.dto.LoginDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<script>
function checkBoardWrite(){
   if(document.boardWriteForm.subject.value=="") {
		alert("제목을 입력하세요"); 
		boardWriteForm.subject.foucs();
   } else if (document.boardWriteForm.content.value=="") {
      	alert("내용을 입력하세요");
		boardWriteForm.content.focus();			   
   } else 
      document.boardWriteForm.submit();
}
</script>

<%
	LoginDTO ob = (LoginDTO)session.getAttribute("logOK");	
	if (ob != null) {
%>

<form name="boardWriteForm" method="post" action="/bbs/boardInsert.do">
<h3>글쓰기</h3>
<table border="1" >
   <tr>
      <td>아이디</td>
      <td><input type="text" name="id" size="50"  value="<%=ob.getId() %>" readonly></td>
   </tr>
   <tr>
      <td>이름</td>
      <td><input type="text" name="name" size="50" value="<%=ob.getName() %>" readonly></td>
   </tr>   
   <tr>
      <td>이메일</td>
      <td><input type="text" name="email" size="50"></td>
   </tr>
   <tr>
      <td>제 목</td>
      <td><input type="text" name="subject" size="50"></td>
   </tr>
   
   <tr>
      <td>내 용</td>
      <td><textarea name="content" cols="50" rows="15"></textarea></td>
   </tr>
   
   <tr>
      <td colspan="2" align="center">
      <input type="button" value="글쓰기" onclick="checkBoardWrite()">
      <input type="reset" value="다시작성">
      </td>
   </tr>
</table>
</form>

<%
}
%>

</body>
</html>

