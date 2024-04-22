<%@page import="beans.Account"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>quiz1_1_result.jsp</title>
</head>
<body>
	<%!
		Account[] db = new Account[] {
			new Account("itbank", "it12"),
			new Account("test1", "1"),
			new Account("root", "qwe")
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
		String site = "fail.jsp";
		
		if (acc != null) {
			site = "success.jsp";
		}
		
		response.sendRedirect(site);
	%>
</body>
</html>