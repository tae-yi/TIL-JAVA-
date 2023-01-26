<%@ page contentType="text/html; charset=EUC-KR"%>
<%
      session.invalidate();
%>
<script>
   alert('로그아웃 되었습니다.');
   location.href="../ch14/login.jsp";
   parent.content.location.href="../ch17/main.jsp"
</script>