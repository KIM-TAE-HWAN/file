<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp"%>
	
<main>
	<fieldset>
		<legend>로그인</legend>
		
		<form action="loginPro.jsp" method="POST">
			<p><input name="userid" placeholder="아이디" required></p>
			<p><input name="userpw" type="password" placeholder="패스워드" required></p>
		
			<button>Login</button>

		</form>
	</fieldset>
</main>	

<%@ include file="../footer.jsp"%>