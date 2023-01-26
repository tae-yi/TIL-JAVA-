<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%
String id = (String) session.getAttribute("idKey");
if (id != null) {
%>
<script>
	alert("로그인 되었습니다");
	location.href = "sessionLoginOK.jsp";
</script>
<%
}
%>
<html>
<head>
<meta charset="EUC-KR">
<title>sample LogIn</title>
<link href="style.css" rel="stylesheet" type="text/css">
</head>
<body bgcolor="#CCE5FF" topmargin="100">
	<h2 align="center">Session 로그인</h2>
	<table width="75%" border="1" align="center" bordercolor="#CCCCFF"
		bgcolor="#CCE5FF">
		<tr bordercolor="#CCE5FF">
			<td height="190" colspan="7">
				<form method="post" action="sessionLogInProc.jsp">
					<table width="50%" border="1" align="center" cellspacing="0"
						cellpadding="0">
						<tr bordercolor="#CCCCFF">
							<td colspan="2"><div align="center">Log in</div></td>
						</tr>
						<tr>
							<td width="47%"><div align="center">ID</div></td>
							<td width="53%"><div align="center">
									<input name="id">
								</div></td>
						</tr>
						<tr>
							<td><div align="center">PWD</div></td>
							<td><div align="center">
									<input name="pwd">
								</div></td>
						</tr>
						<tr>
							<td colspan="2"><div align="center">
									<input type="submit" value="login">&nbsp <input
										type="reset" value="reset">
								</div></td>
						</tr>
					</table>
				</form>
			</td>
		</tr>
	</table>
</body>
</html>