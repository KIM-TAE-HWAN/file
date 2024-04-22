<%@page import="beans.Account"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>quiz_1_result.jsp</title>
</head>
<body>
	<%!
		Account[] db = new Account[] {
			new Account("itbank", "it12", "it"),
			new Account("test1", "1", "테스트1"),
			new Account("root", "qwe", "qwe")
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
	
	<% request.setCharacterEncoding("utf-8"); %>
	
	<jsp:useBean id="acc" class="beans.Account"/>
	
	<jsp:setProperty name="acc" property="*" />
	
	<%
		acc = login(acc);
		String msg = "로그인 실패";
		
		if (acc != null) {
			msg = acc.getNick() + "님 로그인";
		}
	
	%>
	
	<h1>결과</h1>
	<hr>
	
	<h4><%=msg %></h4>
	
	<%-- <ul>
		<li><%=acc.getUserid() %></li>
		<li><%=acc.getUserpw() %></li>
		<li><%=acc.getNick() %></li>
	</ul> --%>	
	
</body>
</html>