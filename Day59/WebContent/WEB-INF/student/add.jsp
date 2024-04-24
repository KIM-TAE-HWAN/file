<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

	<h1>학생 추가</h1>
	<hr>
	
	<form method="POST">
		<p><input name="name" placeholder="이름" required></p>
		<p><input name="kor" type="number" placeholder="국어" required></p>
		<p><input name="eng" type="number" placeholder="영어" required></p>
		<p><input name="mat" type="number" placeholder="수학" required></p>
	
		<button>전송</button>
	</form>
	

</body>
</html>