<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Form</title>
</head>
<body>
<form action = "<%= request.getContextPath()%>/Controller" method = "post">
First Name : <input type = "text" name = "firstname"><br/>
Last Name : <input type = "text" name = "lastname"><br/>
<input type = "submit" value = "login">
</form>
</body>
</html>