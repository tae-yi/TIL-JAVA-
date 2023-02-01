<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@page import="ch18.Temperature" %>
<%request.setCharacterEncoding("utf-8"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>온도계 변화</title>
</head>
<body>
<form action="temperature.jsp" method="post">
프로그램 정보 : ${Temperature.getInfo()}</p>
섭씨 : <input size=2, name="temp" value="${param.temp}">  &#8451; &nbsp;&nbsp;
 <input type="submit" size=5 value="환산"> &nbsp;&nbsp;
화씨:<input size=2 value="${Temperature.getFahrenheit(param.temp)}" disabled> ℉
</form>
</body>
</html>