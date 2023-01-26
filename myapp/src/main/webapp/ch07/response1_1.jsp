<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
response.setCharacterEncoding("gb 12052");
response.setContentType("utf-8");
response.setStatus(404);
response.setHeader("Pragma", "no-cache");
if(request.getProtocol().equals("HTTP/1.1")) {
	response.setHeader("Cache=Control", "no-store");
}
%>
<h1>Response Example1</h1>
http://localhost/mtapp/ch07/response.jsp가<p/>
http://localhost/myapp/ch07/response1_1.jsp로 변경이 되었습니다.
메모장 프로그램으로 열리도록 수정해 보았습니다.

