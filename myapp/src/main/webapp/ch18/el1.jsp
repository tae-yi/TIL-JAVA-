<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
request.setAttribute("siteName", "JSPstudy.co.kr");
%>
<html>
<head>
<title>Expression Language</title>
</head>
<body>
<h2>EL의 기본 문법</h2>
사이트명 : <b>${siteName}</b><br><!-- el표현문법: ${} -->

<%=request.getHeader("host")%><br>
<%=request.getHeader("User-Agent")%>
</body>
</html>