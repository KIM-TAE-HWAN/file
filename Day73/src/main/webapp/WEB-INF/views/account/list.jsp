<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>

<main>
	<h2>회원정보</h2>
	<hr>
	
	<table>
		<thead>
			<tr>
				<th>회원 번호</th>
				<th>아이디</th>
				<th>닉네임</th>
				<th>이메일</th>
				<th>가입일자</th>
			</tr>
		</thead>
	
		<tbody>
			<c:forEach var="acc" items="${acc }">
			<tr>
				<td>${acc.idx }</td>
				<td>${acc.userid }</td>
				<td>${acc.nick }</td>
				<td>${acc.email }</td>
				<td>${acc.j_date }</td>
			</tr>
			</c:forEach>
		</tbody>
	</table>
	
</main>
</body>
</html>