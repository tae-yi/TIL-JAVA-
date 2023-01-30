<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%
    pageContext.setAttribute("msg", "꿈은 이루어 진다.");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Expression Language</title>
</head>
<body>
<h2>EL의 Scope2</h2>
msg(pageScope로 받은 값) : <b>${pageScope.msg}</b><p/>
msg(추가 문구 받은값) : <b>${msg1}</b></p>
1에서 10까지 합(request로 받은 값) : <b><%=request.getAttribute("sum") %></b><p/>
1에서 10까지 합(request Scope로 받은 값) : <b>${requestScope.sum}</b><p/>

</body>
</html>