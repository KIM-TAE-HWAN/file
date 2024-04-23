<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>quzi1.jsp</title>
</head>
<body>
	<h1>Quiz1</h1>
	<hr>
	
	<ul>
		<li>quiz1_result.jsp에 이름/나이를 전송한다</li>
		<li>결과 페이지에 성인/미성년자를 판별해서 출력</li>
		<li>결과는 쿠키로 지정 및 발급</li>
	</ul>
	
	<h4>전달받은 쿠키 이름 : ${cookie.name.value }</h4>
	<h4>전달받은 쿠키 값 : ${cookie.age.value }</h4>
	
	<form action="quiz1_result.jsp" method="POST">
		<p><input name="name" placeholder="이름" required></p>
		<p><input name="age" type="number" placeholder="나이" required></p>
		
		<button>전송</button>
	</form>
</body>
</html>