<%@page import="entity.Emp"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>전체보기</h2>
<table border="1">
	<tr>
		<td>부서번호</td>
		<td>이름</td>
		<td>연락처</td>
		<td>부서명</td>
		<td>수정</td>
		<td>삭제</td>
	</tr>
<%
	List<Emp> list=(List<Emp>)request.getAttribute("list");
	if(list != null){
		for(Emp ob: list)
		{
%>	
			<tr>
				<td><%=ob.getEno()%></td>
				<td><%=ob.getEname()%></td>
				<td><%=ob.getPhone()%></td>
				<td><%=ob.getDept()%></td>
				<td>수정</td>
				<td>삭제</td>
			</tr>
<%
		}//end for
	}// end if
%>	
</table>
</body>
</html>












