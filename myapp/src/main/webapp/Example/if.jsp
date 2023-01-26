<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" errorPage="error.jsp"%>
<%
int asd = Integer.parseInt(request.getParameter("number"));
%>
입력된 정수값: <%=asd%>
