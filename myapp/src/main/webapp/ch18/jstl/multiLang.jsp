<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<fmt:setLocale value='<%=request.getParameter("Language") %>' />
<fmt:bundle basename="resourceBundle.goods" >
<html>
<head><title>상품 등록</title></head>
<body>
<a href="?Language=ko" >한국어</a>|<a href="?Language=en" >English</a>|<a href="?Language=de" >Deutsch</a>
<h1><fmt:message key="title"/></h1>
<form name="newProduct" method="post">
<label><fmt:message key="productId"/></label>
<input type="text" name="productId"></br>
<label><fmt:message key="pname"/></label>
<input type="text" name="name"></br>
<label><fmt:message key="unitPrice"/></label>
<input type="text" name="unitPrice"></br>
</form>
</fmt:bundle>
</body>
</html>