<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>
	<c:set var="list" value="${map['list'] }"></c:set>
	<c:set var="pg" value="${map['pg'] }"></c:set>
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
	
	<c:if test="${not empty param.type }">
		<c:set var="type" value="&type=${param.type}"/>
		<c:set var="search" value="&search=${param.search}"/>
	</c:if>	
	
	<ul class="page">
		<c:if test="${pg.prev }">
		<li><a href="${cpath }/board/list?page=${pg.begin - 1 }${type}${search}">이전</a></li>
		</c:if>
	
		<c:forEach var="i" begin="${pg.begin }" end="${pg.end }">
			<li>
				<a href="${cpath }/board/list?page=${i }${type}${search}">
					${i }
				</a>
			</li>
		</c:forEach>
		
		<c:if test="${pg.next }">
		<li><a href="${cpath }/board/list?page=${pg.end + 1 }${type}${search}">다음</a></li>
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
	
	<a href="${cpath }/board/add">
		<button>글 작성</button>
	</a>

</main>		
</body>
</html>