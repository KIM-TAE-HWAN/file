<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>quiz1_result.jsp</title>
</head>
<body>
	<%	
		/* request.setCharacterEncoding("utf-8");
		
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		
		Cookie[] cs = new Cookie[] {
				new Cookie("name", name),
				new Cookie("age", age)
		};
		
		
		for (int i = 0; i < cs.length; i++) {
			cs[i].setMaxAge(60 * 60 * 1);
			
			response.addCookie(cs[i]);
			} */
		
		String sage = request.getParameter("age");
		int age = Integer.parseInt(sage);
		
		String adult = (age >= 19) ? "성인" : "미성년자";
		pageContext.setAttribute("adult", adult);
		
		Cookie ck = new Cookie("adult", adult);
		ck.setMaxAge(60 * 60 * 2);
		
		response.addCookie(ck);
	%>

	<h1>결과 페이지</h1>
	<hr>
	
	<ul>
		<li>이름 : ${param.name }</li>
		<li>나이 : ${param.age }</li>
		<li>성인/미성년자 : ${param.age >= 19 ? '성인' : '미성년자' }</li>
		<li>${adult }</li>
	</ul>
	
	<h1>쿠키 발급</h1>
	<hr>
	
	<a href="quiz1.jsp">
		<button>ex01.jsp</button>
	</a>
</body>
</html>