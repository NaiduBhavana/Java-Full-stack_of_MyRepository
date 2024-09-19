<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
Values submitted to Form<br/>
<jsp:useBean id="User" class = "java_Beansoverview.User" scope = "session"></jsp:useBean>
<jsp:setProperty property="*" name="User"/>
First Name:<jsp:getProperty property="firstname" name="User"/><br/>
Last Name:<jsp:getProperty property="lastname" name="User"/>
</body>
</html>