<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>JSTL</title>
</head>
<body>
<h2>Formatting Tags2</h2>
<c:set var="num" value="123456789" />
	Core태그 set으로 변수 num을 선언합니다.
	숫자 : <fmt:formatNumber value="${num}" type="number" /><br/>
	퍼센트 : <fmt:formatNumber value="${num}" type="percent" groupingUsed="true" /><br/>
	달러 : <fmt:formatNumber value="${num}" type="currency" /><br/>
	패턴 : <fmt:formatNumber value="${num}" pattern="0.0000" groupingUsed="false" /><br/>
	
	<fmt:parseNumber var = "i" integerOnly="true" value="123.456"/>
	파싱 후 jstl로 출력 : <c:out value="${i}"/><br/>
	파싱 후 EL로 출력 : ${i}</br></br>
	
	<c:set var="data" value="940101-1234567"/>
	파싱 전 데이터: ${data}<br/> 
	파싱 처리중 ... <fmt:parseNumber value="${data}" type="number" var="num"/><br/>
	파싱 후 : ${num}<br/> 
	실수를 제외한 정수 : <c:out value="${i}"/>
</body>
</html>