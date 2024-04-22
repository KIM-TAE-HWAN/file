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
							일치하면 success.jsp로 포워드
							일치하지 않으면 fail.jsp로 리다이렉트
		
		success.jsp			'ID'님 로그인 성공을 출력한다
							
							
		fail.jsp			로그인 실패를 출력한다					
		
		
		beans.Account		필드는 ID, PW을 문자열로 가진다
							메서드는 자유롭게	
	--%>
	
	<h1>Quiz2</h1>
	<hr>
	
	<form action="quiz2_result.jsp" method="POST">
        <input type="text" name="id" placeholder="ID" required><br>
        
        <input type="password" name="pw" placeholder="PW" required><br>
        
        <br>
        <button>전송</button>
    </form>
</body>
</html>