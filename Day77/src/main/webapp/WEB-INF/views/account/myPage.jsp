<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>

<%-- <c:set var="image" value="default.jpg"/>

<c:if test="${user.idx == 1004 }">
	<c:set var="image" value="1004/profile.jpg"/>
</c:if> --%>

<form method="POST" enctype="multipart/form-data">
	<table class="board">
		<tr class="profile">
			<th>프로필 이미지</th>
			<td>
				<%-- <img src="${cpath }/resources/img/profile/default.jpg"
				width="50px" height="50px"> --%>
				<img src="${cpath }/profile/${user.image }"
				width="50px" height="50px">
				
				<input name="upload" type="file">
			</td>
		</tr>
		<tr>
			<th>회원번호</th>
			<td>${user.idx }</td>
		</tr>
		<tr>
			<th>아이디</th>
			<td>${user.userid }</td>
		</tr>
		<tr>
			<th>패스워드</th>
			<td><input name="userpw" type="password" required></td>
		</tr>
		<tr>
			<th>닉네임</th>
			<td>${user.nick}</td>
		</tr>
		<tr>
			<th>이메일</th>
			<td>${user.email }</td>
		</tr>
		<tr>
			<th>가입일</th>
			<td>${user.j_date }</td>
		</tr>
	</table>
	
	<br>
	
	<button>수정</button>
	<a href="${cpath }/account/delete">
	<button type="button">삭제</button></a>
	
</form>
</body>
</html>