<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex02.jsp</title>
</head>
<body>
	<h2>요청 메서드 구분</h2>
	<hr>
	
	<p>GET /Test2로 요청시 이 페이지가 나오게 한다</p>
	
	<form method="POST">
		<p><input name="name" placeholder="이름"></p>
		
		<button>전송</button>
	</form>
	
	<%-- test2에서 doGET를 요청받아서
		ex02 화면에 나타남
		그 후 post로 넘겨서 doPOST 받아
		ex02_result로 반환된다	
		
		encoding 페이지는 두페이지를 연결할수 있게 만들어 준다
	 --%>
</body>
</html>