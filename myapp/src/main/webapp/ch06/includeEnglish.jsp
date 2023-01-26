<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
request.setCharacterEncoding("EUC-KR");
String name = request.getParameter("Name");
%>
<h1>Korean Information Technology Insitute!!</h1>
<html>
Welcome!<%=name%><p/>
</html>