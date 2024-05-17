<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>/Day84</title>

<link href="/css/style.css" rel="stylesheet">
	<c:set var="login" value="${empty user ? 'login' : 'logout' }"/>
	<c:set var="signUp" value="${empty user ? 'signUp' : 'myPage' }"/>
	<c:set var="nick" value="${empty user ? 'signUp'  : user.nick }"/>
</head>
<body>
	<h1>AOP, Log, Interceptor</h1>
	
	<ul class="menu">
		<li><a href="/">ex01</a></li>
		<li><a href="/account">account</a></li>
		<li><a href="/board">board</a></li>		
		<li><a href="/account/${login }">${login }</a></li>
		<li><a href="/account/${signUp }">${nick }</a></li>
		<li><a href="/account/myPage">myPage</a></li>	
	</ul>
	
	<hr>