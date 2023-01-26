<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<h1>선언문 실습 혼자해보기</h1>
<%!
	int num1 = 100;
	int num2 = 50;
	public int cal() {
	return num1 - num2;
	}

%>
num1 - num2 = <%=cal() %>