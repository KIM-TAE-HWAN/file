<%@page import="beans.Account"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>quiz1_result.jsp</title>
</head>
<body>
	<%
  
    Account acc1 = new Account("itbank", "it12");
    Account acc2 = new Account("test1", "1");
    Account acc3 = new Account("root", "qwe");

   
    Account[] accounts = {acc1, acc2, acc3};

   
    String inputId = request.getParameter("id");
    String inputPw = request.getParameter("pw");

  
    boolean loginSuccess = false;
    for (Account account : accounts) {
        if (account.getId().equals(inputId) && account.getPw().equals(inputPw)) {
            loginSuccess = true;
            break;
        }
    }

   
    if (loginSuccess) {
        response.sendRedirect("success.jsp");
    } else {
        response.sendRedirect("fail.jsp");
    }
	%>
	
</body>
</html>