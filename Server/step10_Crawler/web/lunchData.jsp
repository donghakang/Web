<%@page import="util.crawler.Crawler"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
</head>
<body>
<%
	String strDate=request.getParameter("date");
    String[] strDates = strDate.split("-"); 
    strDate="";

    for(int i = 0; i < strDates.length; i++){
		strDate += strDates[i];
	}
    
    Crawler menuCrawler=new Crawler();
    String strMenu=menuCrawler.getMenuData(strDate);
    
    //out.println(strMenu);
    String[] menus;
    if(strMenu != null){
    	menus=strMenu.split("\\.");
    }else{
    	menus=null;
    }
%>
<div class="container">
	<%	
		if(menus != null){  //메뉴가 존재할 경우
			out.println("<h3>"+ strDate + "의메뉴</h3>");
			out.println("<ul>");
			
			for(String menu : menus){
				out.println("<li>" + menu +"</li>");
			}
			out.println("</ul>");
			
		} else {
			out.println("<h3>오늘은점심식사가없는날</h3>");
		} 
	%>
	</div>
</body>
</html>












