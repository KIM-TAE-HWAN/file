<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>home.jsp</title>
	
<style>
	header {
		display: flex;
		align-items: center;
	}
	.menu {
		margin: 0 30px;
		list-style: none;
		display: flex;
	}
	.menu > li {
		margin: 0 20px;
	}
	.mypage {
		border-collapse: collapse;
	}
	.mypage th, .mypage td {
		border: 1px, solid black;
		padding: 5px 10px;
	}
</style>
</head>
<body>

	<header>
		<h1>Quiz</h1>
		
		<ul class="menu">
			<li><a href="home.jsp">Home</a></li>
			<li><a href="mypage.jsp">MyPage</a></li>
			<li><a href="logout.jsp">Logout</a></li>
		</ul>
	</header>
	
	<hr>