<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<%
request.setCharacterEncoding("EUC-KR");
String siteName = request.getParameter("siteName");
%>
include ActionTag의 Top입니다.<p/>
<%=siteName%>
<hr/>