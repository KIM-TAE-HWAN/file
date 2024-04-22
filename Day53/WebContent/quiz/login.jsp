<%@page import="beans.Account"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login</title>
</head>
<body>

	<%!
		Account[] db = new Account[] {
			new Account("itbank", "it12", "it", "홍길동"),
			new Account("test1", "1", "11", "김민수"),
			new Account("root", "qwe", "qwer", "박철수")
		};
	
		Account login(Account acc) {
			for (int i = 0; i < db.length; i++) {
				if (db[i].equals(acc)) {
					return db[i];
				}
			}
			return null;
		}
	
	%>

	<% request.setCharacterEncoding("utf-8");%>
	
	<jsp:useBean id="acc" class="beans.Account"/>
	
	<jsp:setProperty name="acc" property="*" />
	
	<%
		String save = request.getParameter("save");
	
		acc = login(acc);
	   
	   	if (acc != null) {
	   		Cookie[] cs = new Cookie[] {
	   				new Cookie("id", acc.getId()),
	   				new Cookie("save", "checked")
	   		};
	   		
	   		for (int i = 0; i < cs.length; i++) {
	   			cs[i].setMaxAge(0);	
	   		
	   		
	   		// 쿠키 체크 여부
	   		if (save != null) {
	   			cs[i].setMaxAge(60*60*24);
	   			}
	   			
	   		// 쿠키를 응답에 추가
	   			response.addCookie(cs[i]);
	   		}
	   		// 세션에 저장
	   		session.setAttribute("acc", acc);
	   		response.sendRedirect("home.jsp"); 
	   	}
	    
	   	
		
	%>

	
	<script>
		let acc = <%=acc %>; 
		
		if (acc == 'null') {
			alert('로그인 실패');
			location.href = 'home.jsp';
		} 
	</script>
</body>
</body>
</html>