<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	<c:set var="list" value="${map['list'] }"></c:set>
	<c:set var="pg" value="${map['pg'] }"></c:set>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>board</title>
</head>
<style>
	table {
		border-collapse: collapse;
	}
	th, td {
		border: 1px solid black;
		padding: 5px 10px;
	}
	.page {
		list-style: none;
		padding: 0;
		display: flex;
	}
	.page > li {
		margin: 0 10px;
	}
</style>
<body>
	<h1>Board</h1>
	<hr>
	
	<table>
		<thead>
		<tr>
			<th>No</th>
			<th>제목</th>
			<th>작성자</th>
			<th>조회수</th>
			<th>작성일</th>
		</tr>
		</thead>
		
		<tbody>
			<c:forEach var="row" items="${list }">
			<tr>
				<td>${row.idx }</td>
				<td><a href="/board/view/${row.idx }">
				<!-- /board/view?idx=${row.idx}  -->
					${row.title }
					</a></td>
				<td>${row.nick }</td>
				<td>${row.v_count }</td>
				<td>${row.w_date }</td>
			</tr>	
			</c:forEach>
		</tbody>
	</table>
	
	<br>
	
	<c:if test="${not empty param.type }">
		<c:set var="search" value="&type=${param.type }&search=${param.search }"/>
	</c:if>
	
	<ul class="page">
		<c:if test="${pg.prev }">
		<li><a href="/board/list?page=${pg.begin - 1 }${search }">이전</a></li>
		</c:if>
	
		<c:forEach var="i" begin="${pg.begin }" end="${pg.end }">
			<li>
				<a href="/board/list?page=${i }${search }">
					${i }
				</a>
			</li>
		</c:forEach>
		
		<c:if test="${pg.next }">
		<li><a href="/board/list?page=${pg.end + 1 }${search }">다음</a></li>
		</c:if>
	</ul>
	
	<form>
		<select name="type">
			<option value="title">제목</option>
			<option value="nick">작성자</option>
			<option value="contents">내용</option>
		</select>
		
		<input name="search">
		
		<button>검색</button>
	</form>
	
	<br>
	
	<a href="/board/add">
		<button>글작성</button>
	</a>
</body>
</html>