<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>quiz1_1.jsp</title>
</head>
<body>
	<h1>Quiz1</h1>
	<hr>
	
	<form action="quiz1_1_result.jsp" method="POST">
        <input type="text"name="id" placeholder="ID" required><br>
        
        <input type="password"name="pw" placeholder="PW" required><br>
        
        <br>
        <button>전송</button>
    </form>
</body>
</html>