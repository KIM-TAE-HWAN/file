<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>
	
	<form method="POST">
		<p><input name="title" value="${row.title }"  placeholder="제목" required></p>
		<p><textarea name="contents">${row.contents }</textarea></p>
		<p><input name="user_idx" type="hidden" value="${user.idx }"></p>	
	
		<button>작성</button>
	</form>
	
</body>
</html>