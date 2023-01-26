<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
request.setCharacterEncoding("euc-kr");
String name = "Korea Football";
%>
<html>
<body>
<h1>Including Tag Example</h1>
<jsp:include page="includeTagTop1.jsp"/>
include ActionTag 의 Body입니다.
</body>
</html>