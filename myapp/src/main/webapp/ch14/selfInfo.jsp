<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@page import="java.util.*, ch14.*"%>
<jsp:useBean id="regMgr" class="ch14.MemberMgr" scope="page" /> <!-- membermgr에 있는걸 받아와서 regMgr로 이름을 정한 변수에 넣겠다 -->
<%! String id; String hobbyOut; String gender;%>
<% id = (String)session.getAttribute("idKey"); %>
<html>
<head>
<title>JSP에서 데이터베이스 연동</title>
<link href ="style.css" rel="stylesheet" type="text/css">
<meta charset="EUC-KR">
</head>
<body bgcolor="#FFFFCC">

<h2>자신 정보 조회</h2>
<h3>회원정보</h3>
<table bordercolor="#0000ff" border="1">
<tr>
<td><strong>ID</strong></td>
<td><strong>PWD</strong></td>
<td><strong>NAME</strong></td>
<td><strong>GENDER</strong></td>
<td><strong>BIRTHDAY</strong></td>
<td><strong>EMAIL</strong></td>
<td><strong>ZIPCODE</strong></td>
<td><strong>ADDRESS</strong></td>
<td><strong>HOBBY</strong></td>
<td><strong>NATION</strong></td>
</tr>
<%
 MemberBean mb = regMgr.getMember(id); // regMgr에 넣은 값을 mb에 저장한다
 
%>
<tr>
<td><%=mb.getId()%></td>
<td><%=mb.getPwd()%></td>
<td><%=mb.getName()%></td>
<% 
	if (mb.getGender().equals("1")) {
		gender="남성";
	} else { gender="여성";	}
%>
<td><%=gender%></td>
<td><%=mb.getBirthday()%></td>
<td><%=mb.getEmail()%></td>
<td><%=mb.getZipcode()%></td>
<td><%=mb.getAddress()%></td>
<% String hobby[] = mb.getHobby();
	String lists[] = {"인터넷", "여행", "게임", "영화","운동"};
	hobbyOut = "";
	for(int i = 0; i < hobby.length; i++) {
		hobbyOut += "/"+lists[i];
	}
	hobbyOut = hobbyOut.replaceFirst("/", "");
%>
<td><%=hobbyOut %></td>
<td><%=mb.getNation()%></td>

</tr>
</table>
<br />
</body>
</html>