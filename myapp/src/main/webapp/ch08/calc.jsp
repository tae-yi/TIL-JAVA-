<%@ page language="java" contentType="text/html; charset=EUC-KR" errorPage="error.jsp"
    pageEncoding="EUC-KR"%>
<h1>JSP 계산기</h1><hr/>

<%

    int result = 0;
    
    // GET POST는 대문자로만 작성해야함.
    // form 태그 method가 post이므로 post 요청이 들어왔을 경우!
    if(request.getMethod().equals("POST")){
        String op = request.getParameter("op");
        
        // 파라미터 값은 문자열로 주고받기 때문에 형변환 필요
        int n1 = Integer.parseInt(request.getParameter("n1"));
        int n2 = Integer.parseInt(request.getParameter("n2"));
        
        switch(op){
        case "+":
            result = n1 + n2;
            break;
        case "-":
            result = n1 - n2;
            break;
        case "*":
            result = n1 * n2;
            break;
        case "/":
            result = n1 / n2;
            break;
        }
    }
%>
<h3>계산결과: <%=result%></h3>