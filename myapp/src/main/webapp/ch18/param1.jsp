<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Expression Language</title>
</head>
<% request.setAttribute("id","test");
	request.setAttribute("pwd","1234");%>

<body>
<h2>EL의 param1</h2>
param id: ${param.id}<br/>
param pwd : ${param["pwd"]}<br/>
<hr>
request.getParam id : <%=request.getParameter("id") %><br/>
request.getParam pwd : <%=request.getParameter("pwd") %><br/>
<hr>
request.getParam id : <%=request.getAttribute("id") %><br/>
request.getParam pwd : <%=request.getAttribute("pwd") %><br/>
<!-- <a href = "param2.jsp">param2</a> -->
<jsp:forward page="param2.jsp" />
</body>
</html>