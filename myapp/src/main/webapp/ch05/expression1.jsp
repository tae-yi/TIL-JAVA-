<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<h1>Expression Example</h1>
<%!
	String name[] = {"Java", "JSP", "Android", "Struts"};
%>
<table border="1" width="200">
<% for (int i = 0; i<name.length;i++){%>
<tr><td><%=i%></td>
<td><%=name[i]%></td>
</tr>
<%}%>
</table>
