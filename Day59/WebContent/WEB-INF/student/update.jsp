<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>



<main>
	<form method="POST">
		<p><input name="name" placeholder="이름" required></p>
		<p><input name="kor" type="number" placeholder="국어" required></p>
		<p><input name="eng" type="number" placeholder="영어" required></p>
		<p><input name="mat" type="number" placeholder="수학" required></p>

		<button>변경</button>
	</form>
</main>
	
	<script>
		let row = ${row };
		
		if (row != 0) {
			alert('수정 완료');
			location.href = '${cpath }';
		}
		else {
			alert('수정 실패');
			history.go(-1);
		}
	</script>


</body>
</html>