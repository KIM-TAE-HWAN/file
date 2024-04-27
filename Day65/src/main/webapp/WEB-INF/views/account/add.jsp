<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>

	<h4>회원등록</h4>
	
	<form method="POST">
		<p><input name="userid" placeholder="ID" required></p>
		<p><input name="userpw" type="password" placeholder="PW" required></p>
		<p><input name="nick" placeholder="NICK" required></p>
		<p><input name="email" placeholder="EMAIL" required></p>
		
		<button>가입</button>
	</form>
	
	
</body>
</html>