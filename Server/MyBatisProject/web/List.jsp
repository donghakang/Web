<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
	function search() {
		if (document.sear.item.value == ""  && document.sear.price.value == "") {
			window.location.replace("list")
		} else {
			document.sear.submit();
		}
	}
</script>
</head>
<body>
<h3> *** 상품 정보 *** </h3>
<br><br>
<table border="1" width="600" align="center">
    <tr>
    	<td colspan="5">
    		<a href="/product/Insert.html">상품등록</a>
    	</td>
    </tr>   
    <tr>
    	<td colspan="5">
	    	<form method="post" action="search" name="sear">
		    	상품명 : <input type="text" name="item">
		    	<font color="red">(상품명을 모를경우 포함된 문자를 입력하시오)</font><br/>
		    	가&nbsp;&nbsp;&nbsp;격 : <input type="text" name="price">&nbsp;&nbsp;
		    	출고일 : <input type="text" name="regdate">&nbsp;&nbsp;
				<input type="button" value="상품찾기" onclick="javascript:search();"/>
		    </form>	     <!-- queryString 방식으로 전송-->
    	</td>
    </tr> 
	<tr>
		<th>상품번호</th><th>상품명</th><th>가격</th><th>출고일</th><th>수정/삭제</th>
	</tr>
	
	<c:if test="${!empty list}">
		<c:forEach items="${list}" var="ob">
		<tr>
			<td>${ob.no }</td>
			<td>${ob.item }</td>
			<td align="right">${ob.price }원</td>
			<td align="center">${ob.regdate}</td>
			<td align="center">
				<a href="update?no=${ob.no}">수정</a>&nbsp;
				<a href="delete?no=${ob.no}">삭제</a>
			</td>
		</tr>
		</c:forEach>
	</c:if>

</table>
</body>
</html>







