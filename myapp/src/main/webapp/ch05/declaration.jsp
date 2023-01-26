<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<h1> Declaration Example</h1>
<%
	String name = team + "Fighting!!!";
	
%>
<%!
	String team = "Korea";
%>
출력되는 결과는 ? <%=name%>