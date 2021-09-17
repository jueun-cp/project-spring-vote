<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body align=center>
	<h1>대통령 선거 투표</h1>
	<h2>후보자</h2>
	<FORM METHOD=POST action="a1">
			<INPUT TYPE="hidden" id="name" name="name" VALUE="송용민"></INPUT>
			<INPUT TYPE="hidden" id="pin" name="pin" VALUE="3456781234567"></INPUT>
			<INPUT TYPE="radio" id="cand" NAME="cand" VALUE="1" >홍길동<p />
			<INPUT TYPE="radio" id="cand" NAME="cand" VALUE="2">이순신<p />
			<INPUT TYPE="radio" id="cand" NAME="cand" VALUE="3">유관순<p />
			<INPUT TYPE="radio" id="cand" NAME="cand" VALUE="4">기권<p />
			<INPUT TYPE="submit" VALUE="투표하기"><p />
	</FORM>
</body>
</html>