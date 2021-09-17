<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style>
body{
	display : flex;
	flex-wrap : wrap;
	flex-decoration : row;
	padding-left : 500px;
	padding-top : 250px;
}

.box{
	border : 2px solid red;
	margin : 30px;
	padding : 20px;
}
</style>


</head>
<body>
	<div class="box">
		<h1>본인 인증 확인</h1>
		<form method="post" action="b1">
			<input type="text" name="name" value="이름" /><br/> 
			<input type="text" name="pin" value="주민번호" />
	
			<br/>
			<input type="submit" value="본인 인증" />
		</form>
	</div>	
</body>
</html>
