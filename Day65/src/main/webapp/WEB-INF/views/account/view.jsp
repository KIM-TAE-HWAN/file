<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>

	<h4>account 테이블 목록</h4>

	<p>${ver }</p>
	
	<table>
		<tr>
			<th>회원번호</th>
			<th>아이디</th>
			<th>닉네임</th>
			<th>이메일</th>
			<th>가입일자</th>
			<th>수정</th>
			<th>삭제</th>
		</tr>
		
		<c:forEach var="row" items="${list }">
			<tr>
				<td>${row.idx }</td>
				<td>${row.userid }</td>
				<td>${row.nick }</td>
				<td>${row.email }</td>
				<td>${row.j_date }</td>
				<td><a href="${cpath }/account/update?idx=${row.idx }">수정</a></td>
				<td><a href="${cpath }/account/delete?idx=${row.idx }">삭제</a></td>
			</tr>
		</c:forEach>
	</table>
	<br>
	<a href="${cpath }/account/add">
	<button>이동</button>
	</a>
</body>
</html>