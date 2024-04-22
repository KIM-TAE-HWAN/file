<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>quiz1_result.jps</title>
</head>
<body>
	<%!
		String id = "itbank";
		String pw = "it123";
		
		// 선언문에 request 사용 안된다
		// 메서드 선언후 작성 가능
		String login(String userid, String userpw) {
			
			boolean sameId = id.equals(userid);
			boolean samePw = pw.equals(userpw);
			
			// if (id.equals(userid) && pw.equals(userpw)) {
			//	}
			
			if (sameId && samePw) {
				return id + "님 로그인";
			}
			return "로그인 실패";
		}
	%>
	
	<%
		String userid = request.getParameter("userid");
		String userpw = request.getParameter("userpw");
		
		//System.out.println(userid);
		//System.out.println(userpw);
		
		String msg = login(userid, userpw);
	%>
	
	<h1>로그인 결과</h1>
	<hr>
	
	<h4><%=msg %></h4>
</body>
</html>