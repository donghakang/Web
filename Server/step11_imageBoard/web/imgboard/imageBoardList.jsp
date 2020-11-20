<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title></head>
<link rel="stylesheet" href="/board/imgboard/styleImageBoard.css">
<script>
function imageBoardPaging(pg){
	location.href="/board/imgBoardList.do?pg="+pg;
}
function imgSelectCheck(){
	var array=document.getElementsByName("idx");
	var cnt=0;
	for(var i=0;i<array.length;i++){
		if(array[i].checked==true){
			cnt++;
		}
	}
	
	if(cnt==0){
		alert("삭제할 사진을 선택해 주세요");
	}else{
		document.deleteform.submit();
	}
}
</script>
</head>
<body>

<form name="deleteform" action="/board/imgBoardDelete.do"  method="post">
<table>
<tr>
	<td colspan="7" bgcolor="777777"></td>
</tr>

<tr align="center" height="35">
	<td width="100"><b>번 호</b></td>
	<td width="100"><b>이미지</b></td>
	<td width="150"><b>상품명</b></td>
	<td width="100"><b>단 가</b></td>
	<td width="50"><b>개 수</b></td>
	<td width="100"><b>합 계</b></td>
	<td width="150"><b>작성일</b></td>
</tr>

<tr>
	<td colspan="7" bgcolor="777777"></td>
</tr>
<c:forEach var="imageBoardDto" items="${list}">
<tr>
	<td>
		<input type="checkbox"  name="idx" value="${imageBoardDto.seq}">&nbsp;&nbsp;
		${imageBoardDto.seq}
	</td>
	<td class="imageA">
	<a href="">
	<img src="/board/storage/${imageBoardDto.imagePath}" 
	width="50" height="50" border="0"></a>
	</td>
	<td>
	<a href="#" class="imageA">${imageBoardDto.imageName}</a>
	</td>
	<td><fmt:formatNumber  groupingUsed="true"  value="${imageBoardDto.imagePrice}"/>원</td>
	<td><fmt:formatNumber  groupingUsed="true"  value="${imageBoardDto.imageQty}"/>개</td>
	<td><fmt:formatNumber  groupingUsed="true"  
	                       value="${imageBoardDto.imagePrice*imageBoardDto.imageQty}"/>원</td>
	<td>${imageBoardDto.logTime}</td>
</tr>

<tr>
	<td colspan="7" bgcolor="cccccc"></td>
</tr>
</c:forEach>

<tr>
	<td colspan="7" bgcolor="777777"></td>
</tr>
<tr>
	<td>
		<input type="hidden" name="pg" value="${pg}">   <!-- 삭제 후 현재 페이지를 보여주기 위해 -->
		<input type="button" value="선택삭제" onclick="imgSelectCheck()">
		<input type="button" value="글쓰기" 
		       onclick="location.href='/board/imgboard/imageBoardWrite.html'">
	</td>
	<td colspan="6" align="center">${imageBoardPaging.pagingHTML}</td>
</tr>
</table>
</form>
</body>
</html>










