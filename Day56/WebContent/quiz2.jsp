<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>quiz2.jsp</title>
</head>
<body>
	<h1>Quiz2</h1>
	<hr>
	
	<ul>
		<li>사용자에게 구구단을 입력 받아서 현재 페이지에 출력</li>
		<li>JSTL/EL를 최대한 활용 할거</li>
	</ul>
	
	<form>
		<p><input name="num" placeholder="구구단 단수" required>
		
		<button>전송</button>
	</form>
	
	<c:if test="${not empty param.num}">
        <c:set var="input" value="${param.num}" />
        <h2>${input} 단 구구단</h2>
        
        <c:forEach begin="1" end="9" var="count">
            <c:out value="${input} * ${count} = ${input*count}" /><br/>
        </c:forEach>
    </c:if>

    
</body>
</html>