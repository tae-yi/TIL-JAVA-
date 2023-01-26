<%@ page language="java" contentType="text/html; charset=euc-kr"
    pageEncoding="euc-kr"%>
<%
request.setCharacterEncoding("euc-kr");
%>
<jsp:useBean id="regBean" class="ch09.MemberBean" scope="page" />
<jsp:setProperty name="regBean" property="*" />
<html>
<head>
<title>회원가입 확인</title>
<link href="style.css" rel="stylesheet" type="text/css">
</head>
<body bgcolor="#bbbbbb">
<table width="80%" align="center" border="0" cellspacing="0" cellpadding="5" >
   <tr>
      <td align="center" valign="middle" bgcolor="#eeeeee">
   <table width="90%" border="1" cellspacing="0" cellpadding="2" align="center">
      <form name="regForm" method="post" action="memberInsert.jsp">
         <tr align="center" bgcolor="#bbbbbb">
            <td colspan="3"><font color="#FFFFFF"><b>
            <jsp:getProperty property="name" name="regBean"/>
            회원님이 작성하신 내용입니다. 확인해주세요.</b></font></td>
         </tr>
         <tr>
            <td width="24%">아이디</td>
            <td width="41%"><jsp:getProperty name="regBean" property="id" /></td>
         </tr>
         <tr>
            <td>패스워드</td>
         <td><jsp:getProperty property="pwd" name="regBean" /> </td>
            </tr>
            <tr>
               <td>이름</td>
               <td><jsp:getProperty name="regBean" property="name" /></td>
            </tr>
            <tr>
               <td>이메일</td>
               <td><jsp:getProperty name="regBean" property="email" /></td>
            </tr>
            <tr>
               <td>전화번호</td>
               <td><jsp:getProperty name="regBean" property="phone" /></td>
            </tr>
            <tr>
               <td colspan="2" align="center">
            <input type="button" value="확인완료">&nbsp;
               <input type="button" value="다시쓰기" onClick="history.back()">
            </td>
            </tr>
         </form>
</table>
</body>
</html>