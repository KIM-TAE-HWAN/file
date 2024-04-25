<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>

<main class="home">
	<%@ include file="../sideMenu.jsp" %>
		
	<article>	
		<fieldset>
			<legend>PW 찾기</legend>
			
			<form  method="POST">
				<p><input name="userid" placeholder="아이디" required></p>
				<p><input name="email" type="email" placeholder="이메일" required></p>
			
				<button>find</button>
			</form>
		</fieldset>
	</article>
</main>	
</body>
</html>