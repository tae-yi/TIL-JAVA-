<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<h1>Scriptlet Example</h1>
<%!
	int one;
	String msgOne;
%>
<%
	int two = 31;
	String msgTwo = "Scriptlet Example";
%>
<%= two + " : " + msgTwo%></br>
<%=application.getRealPath("/")%>