<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>

<jsp:useBean id="dao" class="model.BoardDAO"/>
<c:set var="row" value="${dao.selectOne(param.idx) }"/>

<main>
	<table class="board">
		<thead>
			<tr>
				<td colspan="6">${row.idx }. ${row.title }</td>
			</tr>
			<tr>
				<td>작성자</td>
				<td>${row.nick }</td>
				<td>조회수</td>
				<td>${row.view_count }</td>
				<td>작성날</td>
				<td>${row.w_date }</td>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td colspan="6"><pre>${row.contents }</pre></td>
			</tr>
		</tbody>
	</table>
	
	<br>
	
	<c:if test="${row.nick == user.nick }">
		<a href="${cpath }/board/update.jsp?idx=${row.idx }">
			<button>수정</button>
		</a>
	
		<a href="${cpath }/board/delete.jsp?idx=${row.idx }">
			<button>삭제</button>
		</a>
	</c:if>
</main>

<%@ include file="../footer.jsp" %>