<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Form</title>
</head>
<body>
<form action ="<%= request.getContextPath()%>/Controller" method = "get">
Full Name : <input type = "text" name = "Name" >
<br/>
Gender : 
<input type = "radio" name = "Gender" value = "Male">Male
<input type = "radio" name = "Gender" value = "Female">Female
<br/>
Languages Known : 
<input type = "checkbox" name = "Languages" value = "Telugu">Telugu
<input type = "checkbox" name = "Languages" value = "English">English
<input type = "checkbox" name = "Languages" value = "Hindi">Hindi
<input type = "checkbox" name = "Languages" value = "Spanish">Spanish
<br/>
Country : <select name = "country">
<option value = "India">India</option>
<option value = "USA">USA</option>
<option value = "Europe">England</option>
</select>

<input type = "submit" value = "submit">
<%out.println(request.getContextPath()); %>



</form>
</body>
</html>