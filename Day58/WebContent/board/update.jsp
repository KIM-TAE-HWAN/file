<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp"%>

<jsp:useBean id="dao" class="model.BoardDAO"/>
<c:set var="row" value="${dao.selectOne(param.idx) }"/>

<main>
	<form action="updatePro.jsp" method="POST">
		<table class="board write">
			<thead>
				<tr>
					<td><input name="title" placeholder="제목(최대 30자)"></td>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td><textarea name="contents" placeholder="작성해주세요">${row.contents }</textarea></td>
				</tr>
			</tbody>
		</table>
		
		<br>
		
		<input name="nick" type="hidden" value="${user.nick }">
		
		<input name="idx" type="hidden" value="${param.idx }">
		<button>작성</button>
	</form>
</main>

<%@ include file="../footer.jsp"%>
