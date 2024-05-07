<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>

<main>
	<form method="POST" enctype="multipart/form-data">
		<p><input name="title" value="${row.title }" placeholder="제목" required></p>	
		<p><textarea name="contents">${row.contents }</textarea></p>	
		<p><input name="file" type="file"></p>
		<p><input name="user_idx" type="hidden" value="${user.idx }"></p>
		<button>작성</button>			
	</form>
	
	
</main>
</body>
</html>