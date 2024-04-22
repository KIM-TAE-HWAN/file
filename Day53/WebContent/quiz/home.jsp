<%@page import="beans.Account"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
	
	<%-- 
		home.jsp			ID/PW를 입력 받아서 login.jsp로 전승
							단, post로
							전체 로그인 중인 계정이 없으면 '닉네임님 로그인'을 출력
							없으면 '로그인 계정 없음'로 출력
							그리고 체크박스를 만든다(id 저장)
							체크 후 로그인 성공하면 id가 저장된 쿠키를 발급
							그 후 클라이언트가 다시 접속시 id가 자동 완성되게 한다
							
		login.jsp			선언부에 Account 클래스로 계정을 3개 정도 생성
							전달 받은 ID/PW의 일치하는 정보가 없으면 session에 저장
							그 후 home.jsp 리다이렉트
							
		Account.java		필드는 ID, PW, NICK, NAME을 가진다
							메서드는 필요한거 마음대로
							
		mypage.jsp			테이블 형태로 현재 로그인 중인 계정 정보 모두를 출력
		
		logout.jsp			전체 계정에 저장된 정보를 제거
	 --%>
	
	<h4>메인 페이지</h4>
	<%
		Cookie[] cs = request.getCookies();
		String id, save;
		
		id = save = "";
	
		if (cs != null) {
			for(int i = 0; i < cs.length; i++) {
				switch(cs[i].getName()) {
				case "id":
					id = cs[i].getValue();
					break;
				case "save":
					save = cs[i].getValue();
					break;
				}
			}
		}
	%>
	
	<main>
		<form action="login.jsp" method="POST">
			<p><input name="id" placeholder="ID" required></p>
			<p><input name="pw" type="password" placeholder="PW" required></p>
			
			<button>login</button>
			<p><input name="save" type="checkbox" value="yes">id저장</p>
		</form>
	</main>	
	
	<%
		Account acc = (Account) session.getAttribute("acc");
		String msg;
		
		if(acc != null) {
			msg = acc.getNick() + "님 로그인";
		}
		else {
			msg = "로그인 계정 없음";
		}
	%>
	
	<hr>
	
	<h4><%=msg %></h4>
</body>
</html>