<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex04_result.jsp</title>
</head>
<body>
	<%	
		request.setCharacterEncoding("utf-8");
		
		String color = request.getParameter("color");

		Cookie cs = new Cookie("color", color);

		cs.setMaxAge(60 * 60 * 24 * 1);

		response.addCookie(cs);
		
	%>
	
	<h1>쿠키 발급</h1>
	<hr>
	
	<a href="ex04.jsp">
		<button>ex04.jsp</button>
	</a>
	
	
	<h4>전달받은 쿠키 이름 : ${cookie.color.name }</h4>
	<h4>전달받은 쿠키 값 : ${cookie.color.value }</h4>
</body>
</html>