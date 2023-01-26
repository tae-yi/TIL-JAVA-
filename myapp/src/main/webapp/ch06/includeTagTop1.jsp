<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
request.setCharacterEncoding("euc-kr");
String name = request.getParameter("name");
%>
include ActionTag의 Top입니다.<p/>
<b><%=name%>Fighting!!!</b>
<hr/>