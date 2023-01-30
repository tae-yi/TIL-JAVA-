<%--myapp/WebContent/ch18/el1-1.jsp--%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	pageContext.setAttribute("siteName", "itmaster.co.kr");
	request.setAttribute("siteName", "JSPstudy.co.kr");
%>
<html>
<head>
<title>Expression Language</title>
</head>
<body>
<h2>EL의 기본 문법</h2>
<p>사이트명 : <strong>${siteName}</strong></p>  <%-- 강조 : <strong>태그 --%>
<p>request scope : <strong>${requestScope.siteName}</strong></p>
</body>
</html>