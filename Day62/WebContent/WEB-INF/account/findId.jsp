<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>

<main class="home">
	<%@ include file="../sideMenu.jsp" %>
	
	<article>
		<fieldset>
			<legend>ID 찾기</legend>
			
			<form method="POST">
				<p><input name="email" type="email" value="${user.email }" required></p>
			
				<button>find</button>
			</form>
		</fieldset>
	</article>
</main>	
</body>
</html>