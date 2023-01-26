<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@page import="java.util.*, ch11.*" %>
    <jsp:useBean id="regMgr" class="ch11.RegisterMgrPool" scope="page" />
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>JSP에서 데이터베이스 연동</title>
<link href ="style.css" rel="stylesheet" type="text/css">
</head>
<body bgcolor="#FFFFCC">
<h2>Bean과 커넥션 풀을사용한 데이터베이스 연동 예제</h2><br/>
<h3>회원정보</h3>
<table bordercolor="#0000ff" border="1">
<tr>
<td><strong>ID</strong></td>
<td><strong>PWD</strong></td>
<td><strong>NAME</strong></td>
<td><strong>NUM1</strong></td>
<td><strong>NUM2</strong></td>
<td><strong>EMAIL</strong></td>
<td><strong>PHONE</strong></td>
<td><strong>ZIPCODE/ADDRESS</strong></td>
<td><strong>JOB</strong></td>
<td><strong>NATION</strong></td>
</tr>
<%
Vector<RegisterBean> vlist = regMgr.getRegisterList();
int counter = vlist.size();
for(int i = 0; i < vlist.size(); i++) {
	RegisterBean regBean = vlist.get(i);
%>
<tr>
<td><%=regBean.getId()%></td>
<td><%=regBean.getPwd()%></td>
<td><%=regBean.getName()%></td>
<td><%=regBean.getNum1()%></td>
<td><%=regBean.getNum2()%></td>
<td><%=regBean.getEmail()%></td>
<td><%=regBean.getPhone()%></td>
<td><%=regBean.getZipcode()%>/<%=regBean.getAddress()%></td>
<td><%=regBean.getJob()%></td>
<td><%=regBean.getNation()%></td>
<%
}
%>
</tr>
</table>
<br />
total recodes : <%= counter %>
</body>
</html>