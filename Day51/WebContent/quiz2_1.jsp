<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>quiz2_1.jsp</title>
</head>
<body>
	<h1>quiz2</h1>
	<hr>
	
	<form action="quiz2_1_result.jsp" method="POST">
		<p><input name="userid" placeholder="ID" required></p>
		<p><input name="userpw" type="password" placeholder="PW" required></p>
		<p><input name="nick" placeholder="NICK" required></p>
	
		<button>전송</button>
	</form>
</body>
</html>