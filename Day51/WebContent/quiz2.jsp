<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>quiz2.jsp</title>
</head>
<body>
	<%--
		quiz2.jsp			ID/PW를 입력 받을 FORM을 작성
							전송은 POST로 quiz2_result.jsp에 전송
						
		quiz2_result.jsp	ACCOUNT 클래스로 계정을 3개 정도 선언부에 생성해 둔다
							그 후 넘어오는 ID/PW의 만들어둔 계정의 ID/PW와
							일치하면 '닉네임'님 로그인 성공
							일치하지 않으면 로그인 실패를 화면에 출력
		
		beans.Account		필드는 ID, PW, NICK을 문자열로 가진다
							메서드는 자유롭게	
	--%>
	<h1>quiz2</h1>
	<hr>
	
	<form action="quiz2_result.jsp" method="POST">
		<p><input name="userid" placeholder="ID" required></p>
		<p><input name="userpw" type="password" placeholder="PW" required></p>
		<p><input name="nick" placeholder="NICK" required></p>
	
		<button>전송</button>
	</form>
</body>
</html>