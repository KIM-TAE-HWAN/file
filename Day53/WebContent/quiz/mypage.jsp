<%@page import="java.util.Map"%>
<%@page import="beans.Account"%>
<%@page import="java.util.HashMap"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>mypage</title>
</head>
<body>
	<% Account acc = (Account) session.getAttribute("acc"); %>
	
	<h1>My Page</h1>
	
    <table border="1">
        <tr>
            <th>ID</th>
            <th>Nickname</th>
            <th>Name</th>
        </tr>
       
        <tr>
            <td><%= acc.getId() %></td>
            <td><%= acc.getNick() %></td>
            <td><%= acc.getName() %></td>
        </tr>
        
    </table>
</body>
</html>