<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>
	
	<form method="POST">
		<p><input name="userid" placeholder="ID" required></p>
		<p><input name="pw" type="password" placeholder="PW" required></p>
		<p><input name="userpw" type="password" placeholder="PW확인" required></p>
		<p><input name="nick" placeholder="닉네임" required></p>
		<p><input name="email" type="email" placeholder="이메일" required></p>
		
		<button>회원가입</button>
	</form>

	<p></p>
	
	<p></p>

	<script>
		// 패스워드 중복 체크

		let userpw = document.getElementsByName("userpw");
		let pw = document.getElementsByName("pw");
		let msg = '';

		userpw[0].onblur = () => {

		if (pw[0].value == userpw[0].value) {
			msg = '패스워드가 일치합니다';
			
		}
		else {
			msg = '패스워드가 다릅니다';
			pw[0].value = userpw[0].value = '';
			userpw[0].focus();
		}

		document.querySelectorAll('p')[5].innerHTML = msg;
	}

		// 아이디 중복 체크
		let userid = document.getElementsByName("userid")[0];
		let ms = '';
		
		userid.onblur = () => {
			let url = 'checkId?userid=' + userid.value;
			
			fetch(url, {method:'GET'})
			.then(response => response.json())
			.then(data => {
				let ms = "사용 가능한 id입니다";

				if (data != 0) {
					ms = "사용중인 id입니다";
				}
				
				document.querySelectorAll('p')[6].innerHTML = ms;
			});

			
		}
	</script>
</body>
</html>