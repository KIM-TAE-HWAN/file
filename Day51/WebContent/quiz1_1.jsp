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
	
	<h4>로그인 프로세스</h4>
	
	<ul>
		<li>quiz1.jsp 에서 id/pw를 입력 받아 보낼 form를 작성</li>
		<li>form은 POST로 quiz1_result.jsp로 데이터를 전송한다</li>
		<li>quiz1_result.jsp에 문자열로 id/pw 세 쌍을 선언부에 작성해 둔다</li>
		<li>사용자가 전송한 계정과 동일하면 로그인 성공. 아니면 로그인 실패를 화면출력</li>
	</ul>
	
	<form action="quiz1_1_result.jsp" method="POST">
		<p><input name="userid" placeholder="ID"></p>
		<p><input name="userpw" type="password" placeholder="PW"></p>
		
		<button>로그인</button>
	</form>
</body>
</html>