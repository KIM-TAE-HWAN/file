<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp"%>

<jsp:useBean id="bd" class="model.vo.BoardVO"/>
<jsp:setProperty property="*" name="bd"/>

<jsp:useBean id="dao" class="model.BoardDAO"/>
<c:set var="row" value="${dao.update(bd) }"/>

<script>
		let result = ${row };
		
		if (result != 0) {
			alert('수정이 완료 되었습니다');
			location.href = '${cpath}/home.jsp';
		}
		else {
			alert('수정 실패');
			history.go(-1);
		}
</script>

<%@ include file="../footer.jsp"%>