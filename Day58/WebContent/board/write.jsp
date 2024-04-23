<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../header.jsp"%>

<c:if test="${empty user }">
<c:redirect url="/account/login.jsp"></c:redirect>
</c:if>
<main>
	<form action="writePro.jsp" method="POST">
		<table class="board write">
			<thead>
				<tr>
					<td><input name="title" placeholder="제목(최대 30자)"></td>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td><textarea name="contents" placeholder="작성해주세요"></textarea></td>
				</tr>
			</tbody>
		</table>
		
		<br>
		
		<input name="nick" type="hidden" value="${user.nick }">
		
		<button>작성</button>
	</form>
</main>

<%@ include file="../footer.jsp"%>