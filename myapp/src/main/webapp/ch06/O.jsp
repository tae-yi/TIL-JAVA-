<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
String name = request.getParameter("name");
String bloodType = request.getParameter("bloodType");
%>
<h1>Forward Tag Example2</h1>
<%=name%>님의 혈액형은
<b><%=bloodType%></b>형이고<p/>
순둥이입니다.
