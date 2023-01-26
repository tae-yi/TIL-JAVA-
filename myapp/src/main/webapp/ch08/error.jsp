<%@ page contentType="text/html;charset=EUC-KR" isErrorPage="true"%>
<H1>에러 출력</H1>
<%! 
String errormessage;
%>
<% errormessage = exception.getClass().getName();%>

<% if (errormessage.equals("java.lang.NumberFormatException")) {
	out.println("정수를 입력해주세요");
	} else if(errormessage.equals("java.lang.ArithmeticException")) {
		out.println("0으로 나눌 수 없습니다");
	}%><br/>

에러클래스 :<%=exception.toString()%>



