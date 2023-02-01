<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL</title>
</head>
<body>
   <h2>Core Tags2</h2>
   <c:if test="${param.i != null}">
      <b>${param.i}</b>
   </c:if>
   <c:if test="${param.i == '' }">
      <b>비회원</b>
   </c:if>
   <c:choose>
      <c:when test="${param.cl=='yellow'}">
         <c:set var="c1" value="노란색"/>
      </c:when>
      <c:when test="${param.cl=='blue'}">
         <c:set var="c1" value="파란색"/>
      </c:when>
      <c:when test="${param.cl=='orange'}">
         <c:set var="c1" value="오렌지색"/>
      </c:when>
      <c:when test="${param.cl=='pink'}">
         <c:set var="c1" value="핑크색"/>
      </c:when>
      <c:otherwise>
         <c:set var="c1" value="블랙" />
      </c:otherwise>
   </c:choose>
   님이 좋아하는 색상은 <font color="${param.cl}">${c1}</font>입니다.
</body>
</html>