<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <h1> 선언문, 스크립트릿, 표현식, 주석문 사용 예제</h1>
<%!
	int n1;
	int n2;
	public int multiple(int a, int b) {
	return a + b;
	}
%>
<%
 	int n1 = 10;
	int n2 = 20;
%>
표현식 이용 출력: <%=multiple(n1, n2)%></br> <%-- 표현식을 사용한 출력 --%>
스크립트릿 이용 출력: <% out.println(multiple(n1,n2));%> <%-- 스크립트릿(자바 문법 사용)을 사용한 출력 --%>
a