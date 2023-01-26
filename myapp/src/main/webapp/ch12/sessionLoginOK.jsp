<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%
String id = (String) session.getAttribute("idKey");
if (id == null) {
%>
<script>
	alert("로그인 되지 않았습니다.");
	location.href = "sessionLogin.jsp";
</script>
<% }  %>
<html>
<head>
<meta charset="EUC-KR">
<title>Simple LogIn</title>
<link href="style.css" rel="stylesheet" type="text/css">
</head>
<body bgcolor="#CCCCFF" topmargin="100">
	<table width="75%" border="1" align="center" cellspacing="1" cellpadding="1" bordercolor="#CCCCFF" bgcolor="#CCCCFF">
		<tr bordercolor="#CCCCFF">
			<td height="190" colspan="7">
				<table width="50%" border="1" align="center" cellspacing="0"
					cellpadding="0">
		<tr bordercolor="#CCCCFF">
			<td colspan="2"><div align="center">Log On Page</div></td>
		</tr>
		<tr>
			<td><div align="center">
					<strong><%=id%></strong> 
					님이 로그인 하셨습니다.
				</div></td>
			<td><div align="center">
					<a href="../ch12/usingJDBCPoolBean.jsp"><strong>전체 정보조회</strong></a>
			<td><div align="center">
					<a href="selfInfo.jsp"><strong>본인 정보조회</strong></a>	
			<td><div align="center">
					<a href="sessionLogout.jsp"><strong>LOG OUT</strong></a>
</div></td>
</tr>
</table>
</td>
</tr>
</table>
</body>
</html>
