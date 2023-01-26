<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
String name = "JSPStudy";
String star = request.getParameter("star");
%>
<h1>별자리 분석결과</h1>
<jsp:forward page='<%=star + ".jsp"%>'>
<jsp:param name="name" value="<%=name%>"/>
</jsp:forward>