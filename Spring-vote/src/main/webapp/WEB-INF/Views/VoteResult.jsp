<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
 <%@ page import="Pack01.UserDAO"%>
 <%@page import="java.sql.SQLException"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<style>
table{
	border:1px solid black
}
td, th{
	border:1px solid black
}
h1{
text-align:center;
}
</style>
</head>
<body>
<%
	UserDAO us = new UserDAO();
	us.Select();
%>
	<h1></h1>
	<h1>��ǥ ���</h1>
	<table>
	<tr>
	<th>�ĺ��̸�</th>
	<th>���</th>
	<th>ȫ�浿</th>
	<th>������</th>
	<th>�̼���</th>
	<th>��ǥ ���ѻ��</th>
	</tr>
	<tr>
	<td>��ǥ��</td>
	<td>${count[0]}</td>
	<td>${count[1]}</td>
	<td>${count[2]}</td>
	<td>${count[3]}</td>
	<td>${count[4]}</td>
	</tr>
	</table>
</body>
</html>