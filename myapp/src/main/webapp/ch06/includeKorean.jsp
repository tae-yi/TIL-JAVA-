<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
request.setCharacterEncoding("EUC-KR");
String name = request.getParameter("Name");
%>
<h1>한국아이티전문학원</h1>
<html>
환영합니다. 어서오세요! <%=name%>님!<p/>
</html>