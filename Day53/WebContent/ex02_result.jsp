<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex02_result.jsp</title>
</head>
<body>
	<%	
		request.setCharacterEncoding("utf-8");
		
		String name = request.getParameter("name");
		String save = request.getParameter("save");
		
		// 1. 쿠기 생성
		// Cookie(String name, String value);
		// Cookie ck = new Cookie("name", name);
		Cookie[] cs = new Cookie[] {
				new Cookie("name", name),
				new Cookie("save", "checked")
		};
		
		//ck.setMaxAge(0); // 0초면 받자 마자 제거된다
		
		for (int i = 0; i < cs.length; i++) {
			cs[i].setMaxAge(0);
			
		if (save != null) {
			// 2. 쿠키에 수명을 지정
			// - 수명을 지정하지 않으면 세션과 동일한 수명을 가진다(=세션 쿠키)
			
			// ck.setMaxAge(60 * 60 * 24 * 7);	// 초 단위
			cs[i].setMaxAge(60 * 60 * 24 * 7);
		}
		
			// 3. 쿠키 발급
			// response.addCookie(ck);
		response.addCookie(cs[i]);
		}
	%>
	<h1>쿠기 발급</h1>
	<hr>
	
	<h4>F12 어플리케이션 탭에 쿠키를 확인</h4>
</body>
</html>