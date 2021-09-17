<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.*, java.text.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<head>
<title>대통령 선거 투표지</title>
<style>
	#vote{
		width:250px;
		height:250px;
		background-color:#0099FF;
		color:white;
		
	}
	body{
		display:flex;
		flex-wrap: wrap;
		flex-direction:row; 
		align-items: center;
		justify-content:center;
		
	}
	#voteresult{
		width:250px;
		height:250px;
		color:white;
		margin-left:70px;
		background-color:#0099FF;
		
	}
	a{
		text-decoration:none;
	}
</style>
</head>
<body>
	<div class="div">
		<button id="vote">
		<a href="UserAuth">투표하기</a>
		</button>
		<button id="voteResult">
		<a href="c1">투표결과</a>
		</button>		
	</div> 
</body> 

