<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="header.jsp" %>
	
	<h4>ex05</h4>
	
	<form method="POST">
		<p><input name="name" placeholder="이름" required></p>
		<p><input name="height" type="number" placeholder="신장" step="0.1" required></p>
		<p><input name="birth" type="date" required></p>
		<p><input name="score" type="number" placeholder="토익(없으면 -1)" required></p>
		
		<button>전송</button>
	</form>
</body>
</html>