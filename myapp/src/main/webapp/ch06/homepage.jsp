<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
request.setCharacterEncoding("EUC-KR");
String Language = request.getParameter("Language");
%>

<%if(Language.equals("Korean")){%>
	<jsp:include page="includeKorean.jsp"/>		
<%}%>
<%if(Language.equals("English")){%>
<jsp:include page="includeEnglish.jsp"/>		
<%}%>


