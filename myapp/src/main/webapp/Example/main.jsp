<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" %>
<%@include file="top.jsp" %> 
<html>
<body>
<h1>혼자 해보기</h1>
JSP 지시자 실습-page, include, error page<p/>
-Top의 시간과 Bottom의 저작권 페이지는 include로 완성<p/>
-Top페이지의 시간과 저작권 표시는 page속성으로 완성<p/>
-Main에서 오류 발생시 errorPage와 isErrorPage 속성으로 완성<p/>
-파일 총 4개 (main.jsp, top.jsp, bottom.jsp) <p/>
<form method="post" action="if.jsp">
정수 입력 : <input name = "number"> <input type="submit" value="확인">
</form>
<hr/>
<%@include file="bottom.jsp" %> 
