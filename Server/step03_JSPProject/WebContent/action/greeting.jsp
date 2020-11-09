<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	if (request.getParameter("country").equals("kor")) {
%>
안녕하세요
<%
	} else if (request.getParameter("country").equals("chn")) {
%>
谢谢您。
<%
	} else if (request.getParameter("country").equals("jpn")) {
%>
ありがとうございます。
<%
	}
%>
