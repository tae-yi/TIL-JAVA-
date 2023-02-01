<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- Core 태그를 사용하기 위해서 반드시 필요한 url과 prefix를 taglib에 선언을 해야 한다. -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- 
<%
   String str1 = "JAVA의 JSTL";
   String str2 = null;
   pageContext.setAttribute("str5", "한국어");
%>
 -->
<c:set var="str1" value="JAVA의 JSTL" scope="page" />
<c:set var="str2" value="null" scope="page" />
<c:set var="str3" value="JSPStudy" scope="page" />
<c:set var="str4" value="JSTL" scope="session" />
<c:set var="str5" value="한국어" scope="session" />

<html>
<head>
<title>JSTL</title>
</head>
<body>
<h2>Core Tags1</h2>
- <c:out value="${str1}" default="기본출력값"/><br/>
<c:remove var="str2" />
- <c:out value="${str2}" default="가나다라마바사아자차카타파하"/><br/>
- <c:out value="${str3}" default="기본출력값"/><br/>
<c:remove var="str4" />
- ${str3}의 ${str4}...<p/>
<!-- <%String s= (String)pageContext.getAttribute("str3"); %> -->
- <font color="red"><b> ${str3}</b></font><br/>
- <font color="blue"><b> ${str3}</b></font><br/>
- 언어 : ${str5}<br/>

</body>
</html>