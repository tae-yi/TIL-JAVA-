<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<jsp:useBean id="mybean" class="ch09.SimpleBean" scope="page" /> 
<jsp:setProperty name="mybean" property="messageA" />
<html>
<body>
<h1>간단한 빈 프로그래밍</h1>
<br />
Message: <jsp:getProperty name="mybean" property="messageA" />
</body>
</html>