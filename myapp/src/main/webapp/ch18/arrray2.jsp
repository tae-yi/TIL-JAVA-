<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@page import="java.util.ArrayList" %>
<!DOCTYPE html>
<%
	ArrayList<String> familyList = new ArrayList<String>();
	String nameArr[] = {"simba", "rorod", "tina", "poli"};
	for(int i = 0; i < nameArr.length; i++) {
		familyList.add(nameArr[i]);
	}
	pageContext.setAttribute("Family", familyList);
%>
<html>
<head>
<meta charset="EUC-KR">
<title>Expression Language</title>
</head>
<body>
<h2>El의 Array2</h2>
<b>Family List</b><hr width="135" align="left"/>
1. ${Family[0]}<br/>
2. ${Family[1]}<br/>
3. ${Family[2]}<br/>
4. ${Family[3]}<br/>
</body>
</html>