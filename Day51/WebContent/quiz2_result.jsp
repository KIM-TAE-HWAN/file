<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>quiz2_result</title>
</head>
<body>
	<% request.setCharacterEncoding("utf-8"); %>
	
	<jsp:useBean id="ac" class="beans.Account"/>
	
	<jsp:setProperty name="ac" property="*" />
	
	<%!
		String id = "itbank";
		String pw = "it123";
		String nick = "it";

		String login(String userid, String userpw, String nick) {
			
			boolean sameId = id.equals(userid);
			boolean samePw = pw.equals(userpw);
			boolean sameNick = nick.equals(nick);
			
			
			if (sameId && samePw && sameNick) {
				return nick + "님 로그인 성공";
			}
			return "로그인 실패";
		}
	%>
	
	<h1>결과 페이지</h1>
	<hr>
	
	 <% 
        String result = login(ac.getUserid(), ac.getUserpw(), ac.getNick());
    %>
	
	<ul>
		<li>id : <%=ac.getUserid() %></li>
		<li>pw : <%=ac.getUserpw() %></li>
		<li>nick : <%=ac.getNick() %></li>
	</ul>
	
	<h4><%=result %></h4>
</body>
</html>