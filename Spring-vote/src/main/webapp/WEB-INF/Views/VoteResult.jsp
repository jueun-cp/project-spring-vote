<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="Pack01.UserDAO"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">


<title>Insert title here</title>
<style>
table {
	border: 1px solid black
}

td, th {
	border: 1px solid black
}

h1 {
	text-align: center;
}
</style>
</head>
<body>
	<%
	UserDAO us = new UserDAO();
	us.select();
	%>
	<h1></h1>
	<h1>투표 결과</h1>
	<table>
		<tr>
			<th>후보이름</th>
			<th>투표 안한사람</th>
			<th>홍길동</th>
			<th>이순신</th>
			<th>유관순</th>
			<th>기권</th>
		</tr>
		<tr>
			<td>득표수</td>
			<td>${count[0]}</td>
			<td>${count[1]}</td>
			<td>${count[2]}</td>
			<td>${count[3]}</td>
			<td>${count[4]}</td>
		</tr>
	</table>
</body>
</html>