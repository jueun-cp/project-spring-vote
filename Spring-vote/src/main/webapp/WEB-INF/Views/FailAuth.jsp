<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1> 인증에 실패하였습니다.</h1>
	<%= request.getParameter("name") %>
	<%= request.getParameter("pin") %>
</body>
</html>