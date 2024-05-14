<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>write</title>

</head>

	<script src="https://cdn.tiny.cloud/1/bmpz83s4yqa4fgfuozripnlgp9hjdztmwwmpnqkfnjhs8r39/tinymce/7/tinymce.min.js" referrerpolicy="origin"></script>
	

	<script>
	  tinymce.init({
	    selector: 'textarea',
	    plugins: 'anchor autolink charmap codesample emoticons image link lists media searchreplace table visualblocks wordcount linkchecker',
	    toolbar: 'undo redo | blocks fontfamily fontsize | bold italic underline strikethrough | link image media table | align lineheight | numlist bullist indent outdent | emoticons charmap | removeformat',
	  });
	</script>


<body>
	<h1>글작성</h1>
	<hr>
	
	<form method="POST">
		<p><input name="title" value="${row.title }"  placeholder="제목" required></p>
		<c:if test="${empty row }"><p><input name="user_idx" placeholder="계정번호" required></p></c:if>
		<p><textarea name="contents">${row.contents }</textarea></p>	
	
		<button>작성</button>
	</form>
	
</body>
</html>