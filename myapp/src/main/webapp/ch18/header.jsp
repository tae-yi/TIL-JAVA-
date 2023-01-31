<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Expression Language</title>
</head>
<body>
<h2>EL과 request의 header 내장객체</h2>
request 객체 이용
호스트명 : <%=request.getHeader("host") %></p>
사용브라우저:<%=request.getHeader("user-agent") %></p>
사용언어:<%=request.getHeader("accept-language") %></p>
Accept:<%=request.getHeader("accept") %></p>

EL 이용
호스트명 :${header.host}</p>
사용브라우저:${header["user-agent"]}</p>
사용언어:${header["accept-language"]}</p>
Accept:${header.accept}</p>
</body>
</html>
