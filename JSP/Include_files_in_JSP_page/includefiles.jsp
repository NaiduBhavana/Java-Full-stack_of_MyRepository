<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Include files into JSP page</title>
</head>
<body>
<h1>Include files into JSP page concept</h1>
<p>There are two ways to include files into JSP page.one way is to import static files.Another way is to import dynamic file.</p>
<p>Inorder to import static files into JSP page we can make use of "Directive" scripting element.</p>
<p>Inorder to import dynamic files into JSP page we can make use of "JSP" scripting element</p>
<%@ include file = "Normalfile1" %>
</br>
<jsp:include page="Normalfile2"></jsp:include>
</body>
</html>