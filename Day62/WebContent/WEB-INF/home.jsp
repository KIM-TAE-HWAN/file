<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
<main class="home">
<%@ include file="sideMenu.jsp" %>

<article>
	<table class="board">
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
				<td>
					<a href="${cpath }/board/view?idx=${row.idx }">
					${row.title }
					</a>
				</td>
				<td>${row.nick }</td>
				<td>${row.v_count }</td>
				<td>${row.w_date }</td>
			</tr>
			</c:forEach>
		</tbody>
	</table>
	
	<ul class="menu page">
		<c:if test="${pg.prev }">
		<li><a href="${cpath }/?reqPage=${pg.begin - 1 }">이전</a></li>
		</c:if>	
		
		<c:forEach var="i" begin="${pg.begin }" end="${pg.end }">
		<li><a href="${cpath }/?reqPage=${i }">${i }</a></li>
		</c:forEach>
		
		<c:if test="${pg.next }">
		<li><a href="${cpath }/?reqPage=${pg.end + 1 }">다음</a></li>
		</c:if>
	</ul>
	
	<a href="${cpath }/board">
		<button>글작성</button>
	</a>
</article>
</main>

</body>
</html>