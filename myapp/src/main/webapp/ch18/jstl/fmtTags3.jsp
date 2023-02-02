<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ page import="java.util.Date"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>JSTL</title>
</head>
<body>
<h2>Formatting Tags3</h2>

<c:set var="dayTime" value="<%=new Date() %>" />
<fmt:formatDate value="${dayTime}" type="date" dateStyle="full"/><br/>
<fmt:formatDate value="${dayTime}" type="time"/><p/>

<fmt:setLocale value="en_uk"/>
<fmt:timeZone value="Europa/London">
Europa/London : <fmt:formatDate value="${dayTime}" type="both" dateStyle="full" timeStyle="full"/><br/>
</fmt:timeZone>

<fmt:setLocale value="en_us"/>
<fmt:setTimeZone value="America/Nem_York"/>
America/Nem_York : <fmt:formatDate value="${dayTime}" type="both" dateStyle="full" timeStyle="full"/><br/>

<fmt:setLocale value="ja-jp"/>
<fmt:setTimeZone value="Asia/Tokyo"/>
Asia/Tokyo : <fmt:formatDate value="${dayTime}" type="both" dateStyle="full" timeStyle="full"/><br/>

<fmt:setLocale value="ko_kr" />
<fmt:setTimeZone value="Asia/Seoul"/>
Asia/Seoul : <fmt:formatDate value="${dayTime}" type="both" dateStyle="medium" timeStyle="short" /><br/>


</body>
</html>