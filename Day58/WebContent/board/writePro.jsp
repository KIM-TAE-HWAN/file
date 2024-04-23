<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="../header.jsp" %>

	<jsp:useBean id="input" class="model.vo.BoardVO"/>
	<jsp:setProperty property="*" name="input"/>
	
	<jsp:useBean id="dao" class="model.BoardDAO"/>
	<c:set var="row" value="${dao.insert(input) }"></c:set>
	
	<c:if test="${row != 0 }">
		<script>
			alert('작성완료');
			location.href = '${cpath}/home.jsp';
		</script>
	</c:if>
	
	<c:if test="${row == 0 }">
		<script>
			alert('작성실패');
			history(-1)
		</script>
	</c:if>
</body>
</html>