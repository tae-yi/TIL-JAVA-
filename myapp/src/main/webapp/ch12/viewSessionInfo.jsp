<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>技记荤侩抗力(技记犬牢)</title>
</head>
<body>
<%
Enumeration en = session.getAttributeNames();
while(en.hasMoreElements()) {
	String name = (String)en.nextElement();
	String value = (String)session.getAttribute(name);
	out.println("Session name : " + name + "<br/>");
	out.println("Session value : " + value + "<br/>");
}
%>
</body>
</html>