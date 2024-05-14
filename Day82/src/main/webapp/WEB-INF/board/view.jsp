<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>view</title>
<style>
	table {
		border-collapse: collapse;
	}
	th, td {
		border: 1px solid black;
		padding: 5px 10px;
	}
</style>
</head>
<body>
	<h1>view</h1>
	<hr>
	
	<table>
		<tr>
			<td>${row.idx } | ${row.title }</td>
		</tr>
		<tr>
			<td>
				${row.nick } |
				${row.v_count } |
				${row.w_date }
			</td>
		</tr>
		<tr>
			<td><pre>${row.contents }</pre></td>
		</tr>
	</table>
	
	<br>

	<a href="/board/update/${row.idx }">
		<button>수정</button>
	</a>
	
	<a href="/board/delete/${row.idx }">
		<button>삭제</button>
	</a>
	
</body>
</html>