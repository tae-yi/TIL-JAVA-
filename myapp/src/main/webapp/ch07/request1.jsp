<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
request.setCharacterEncoding("EUC-KR");
String name = request.getParameter("name");
String studentNum = request.getParameter("studentNum");
String gender = request.getParameter("gender");
String major = request.getParameter("major");
String phone = request.getParameter("phone");

if (gender.equals("man")){
	gender = "남자";
}else{
	gender = "여자";
}
%>
<h1>Request Example1</h1>
성 명 : <%=name%><p/>
학 번 : <%=studentNum%><p/>
성 별 : <%=gender%><p/>
학 과 : <%=major%><p/>
연락처 : <%=phone%><p/>
