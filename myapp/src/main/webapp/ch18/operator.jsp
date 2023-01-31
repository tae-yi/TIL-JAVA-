<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<%
pageContext.setAttribute("J", 31);
request.setAttribute("J", 8);
session.setAttribute("J", 22);
%>
<html>
<head>
<meta charset="EUC-KR">
<title>Expression Language</title>
</head>
<body>
<h2>EL의 Operators</h2>
<b>J= ${pageScope.J}, S = ${requestScope.J}, P = ${sessionScope.J}</b></p>
<b>논리 및 조건 연산자</b><hr width="250" align="left"/>
&#36;{J > P && P < S} : ${J>P and P<S}<br/>
&#36;{J > P || P < S} : ${J>P or P<S}<br/>
&#36;{!(J==P)} : ${not(J==P)}<br/>
&#36;{(J == S)? "같다" : "다르다" } : ${(J == S) ? "같다" :"다르다"}<p/>
</body>
</html>