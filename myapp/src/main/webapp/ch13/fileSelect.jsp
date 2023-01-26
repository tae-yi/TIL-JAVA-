<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
</head>
<body>
<form name = "frmName" method="post" enctype="multipart/form-data" action="viewPage.jsp">
user<br/>
<input name ="user"><br/>
title<br/>
<input name ="title"><br/>
file<br/>
<input type="file" name="uploadFile"><br/>
<input type="submit" name="UPLOAD"><br/>
</form>
</body>
</html>