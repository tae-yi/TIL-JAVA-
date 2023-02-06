<%@ page contentType="text/html; charset=EUC-KR"%>
<html>
<head>
<%
	  request.setCharacterEncoding("euc-kr");
	  String id = (String) session.getAttribute("idKey");
	  String name = (String)session.getAttribute("name");
%>
<title>로그인</title>
<link href="style.css" rel="stylesheet" type="text/css">
<script type="text/javascript">
	function loginCheck() {
		if (document.loginFrm.email.value == "") {
			alert("이메일을 입력해 주세요.");
			document.loginFrm.email.focus();
			return; 
		}
		if (document.loginFrm.pwd.value == "") {
			alert("비밀번호를 입력해 주세요.");
			document.loginFrm.pwd.focus();
			return;
		}
		document.loginFrm.submit();
	}
	
</script>
</head>
<body bgcolor="#f1dcff">
<br/><br/>
 <div align="center">
		<%
			if (id != null) {
		%>
		<b><%=name%></b>님 환영 합니다.
		<p>제한된 기능을 사용 할 수가 있습니다.
		<p>
			<a href="logout.jsp">로그아웃</a>
			<%} else {%>
		<form name="loginFrm" method="post" action="loginProc.jsp">
			<table>
				<tr>
					<td align="center" colspan="2"><h4>로그인</h4></td>
				</tr>
				<tr>
					<td>이 메 일</td>
					<td><input type="email" name="email" value=""></td>
				</tr>
				<tr>
					<td>비밀번호</td>
					<td><input type="password" name="pwd" value=""></td>
				</tr>
				<tr>
					<td colspan="2">
						<div align="right">
							<input type="button" value="로그인" onclick="loginCheck()">&nbsp;
							<input type="button" value="회원가입" onClick="javascript:location.href='member.jsp'">
						</div>
					</td>
				</tr>
			</table>
		</form>
		<%}%>
	</div>
</body>
</html>