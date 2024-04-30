<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>
	
<main>
	<h2>게시판</h2>
	<hr>
	
	<table>
		<thead>
			<tr>
				<th>글 번호</th>
				<th>제목</th>
				<th>작성자</th>
				<th>조회수</th>
				<th>작성일</th>
				<!-- <th>수정</th>
				<th>삭제</th> -->
			</tr>
		</thead>
	
		<tbody>
			<c:forEach var="row" items="${list }">
			<tr>
				<td>${row.idx }</td>
				<td>
					<a href="${cpath }/board/view/${row.idx}">
						${row.title }
					</a>	
				</td>
				<td>${row.nick }</td>
				<td>${row.v_count }</td>
				<td>${row.w_date }</td>
				<%-- <th>
				<a href="${cpath }/board/update/${row.idx}">
					클릭
				</a>
				</th>
				<th>
				<a href="${cpath }/board/delete/${row.idx}">
					클릭
				</a>
				</th> --%>
			</tr>
			</c:forEach>
		</tbody>
	</table>
	
	<br>
	
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
	
	<a href="${cpath }/board/add">
		<button>글 작성</button>
	</a>

</main>		
</body>
</html>