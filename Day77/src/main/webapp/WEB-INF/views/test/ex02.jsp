<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>
	<h4>upload</h4>
	
	<form method="POST" enctype="multipart/form-data">
		<p><input name="upload" type="file"></p>	
		<button>전송</button>
	</form>
	
	<h4>FileFolder 목록(다운로드 = 이름 출력)</h4>
	
	<table class="board">
		<c:forEach var="file" items="${dir }">
		<tr>
			<th>파일명</th>
			<th>크기</th>
			<th>경로</th>
		</tr>
		<tr>
			<td><a href="${cpath }/fileTest/${file.name }" download>
				${file.name }
				</a></td>
			<td>${file.length() } byte</td>
			<td>${file.path }</td>
		</tr>
		</c:forEach>	
	</table>


</body>
</html>