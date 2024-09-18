<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Form</title>
</head>
<body>
<form action = "submit.jsp" method = "post">
FullName : <input type = "text" name = "Name"/><br/>
Gender: <input type = "radio" name = "Gender" value = "Male">Male
<input type = "radio" name = "Gender" value = "female">Female <br/>
Languages Know : <input type = "checkbox" name = "Language" value = "English">English
<input type = "checkbox" name = "Language" value = "Hindi">Hindi
<input type = "checkbox" name = "Language" value = "Spanish">Spanish
<input type = "checkbox" name = "Language" value = "Telugu">Telugu
<br/>
country : <select name = "country">
<option value = "India">India</option>
<option value = "USA">USA</option>
<option value = "England">England</option>
</select>
<input type = "submit" value = "submit">

</form>
</body>
</html>