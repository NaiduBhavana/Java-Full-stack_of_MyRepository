<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>submit</title> 
</head>
<body>
FullName : <%= request.getParameter("Name")%><br/>
Gender : <%= request.getParameter("Gender") %><br/>
Languages Know : 
<% 
String[] languages = request.getParameterValues("Language");
if(languages != null)
{
	for(int i = 0;i<languages.length;i++)
	{
		out.print("<br/>");
		out.print(languages[i]);
		
	}
}
%>
<br/>
country : <%= request.getParameter("country") %><br/>

</body>
</html>