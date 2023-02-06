<%@ page contentType="text/html; charset=EUC-KR"%>
<%@ page import="exam.*" %>
<jsp:useBean id="mMgr" class="exam.MemberMgr"/>
<%
	  request.setCharacterEncoding("euc-kr");
	  String email = request.getParameter("email");
	  String pwd = request.getParameter("pwd");
	  String url = "login.jsp";
	  String msg = "로그인에 실패 하였습니다.";
	  
	  boolean result = mMgr.loginMember(email,pwd);
	  if(result){
	    session.setAttribute("idKey", email);
	    msg = "로그인에 성공 하였습니다.";
	    MemberBean bean = mMgr.getMember(email);
	    session.setAttribute("name", bean.getName());
	  }
%>
<script>
	alert("<%=msg%>");	
	location.href="<%=url%>";
</script>