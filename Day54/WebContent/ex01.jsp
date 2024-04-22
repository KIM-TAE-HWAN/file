<%@page import="model.DAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex01.jsp</title>
</head>
<body>
	<%
		DAO dao = new DAO();
		String ver = dao.test();
	%>

	<h1>JDBC</h1>
	<hr>
	
	<h4><%=ver %></h4>
	
	<ul>
		<li>Java Database Connectivity</li>
		<li>Java로 db에 접근을 제공하는 라이브러리</li>
		<!-- maven repsitory 접속, ojdbc8검색 -->
		<!-- 제일 사용 많은곳으로 들어가고 jar를 다운 -->
		<!-- 위의 방법은 번거로우니 바로 day54파일 우클릭에서 컨버트 메이븐설정 -->
	</ul>
</body>
</html>