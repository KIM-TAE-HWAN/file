<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex05.jsp</title>
</head>
<body>
	<h1>EL 연산자</h1>
	<hr>
	
	<ul>
		<li>\${10 + 3 } = ${10 + 3 }</li>
		<li>\${10 - 3 } = ${10 - 3 }</li>
		<li>\${10 * 3 } = ${10 * 3 }</li>
		<li>\${10 / 3 } = ${10 / 3 }</li>
		<li>\${10 % 3 } = ${10 % 3 }</li>
		<br>
		
		<li>\${10 > 10 } = ${10 > 10 }</li>
		<li>\${10 >= 10 } = ${10 >= 10 }</li>
		<li>\${10 < 10 } = ${10 lt 10 }</li>	<%-- lt : less then, ~보다 작다 --%>
		<li>\${10 <= 10 } = ${10 le 10 }</li>	<%-- le : less equal, ~보다 작거나 같다 --%>
		<li>\${10 == 10 } = ${10 == 10 }</li>
		<li>\${10 != 10 } = ${10 != 10 }</li>
		<br>
		
		<li>\${true && true } = ${true && true }</li>
		<li>\${true || true } = ${true || true }</li>
		<li>\${not true } = ${not true }</li>
		<br>
		
		<li>\${empty user } = ${empty user }</li>
		<li>\${not empty user } = ${not empty user }</li>
		<%-- 지정 이름의 attribute가 있는지 판별 --%>
		<br>
		
		<li>\${10 % 2 == 0 ? '짝수' : '홀수' } = ${10 % 2 == 0 ? '짝수' : '홀수' }</li>
	</ul>
</body>
</html>