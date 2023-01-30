<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@page isELIgnored="true"%>
<%
request.setAttribute("siteName", "JSPstudy.co.kr");
%>
<html>
<head>
<title>Expression Language</title>
</head>
<body>
<h2>EL의 기본 문법</h2>
사이트명 : <b>${siteName}</b>
</body>
</html>