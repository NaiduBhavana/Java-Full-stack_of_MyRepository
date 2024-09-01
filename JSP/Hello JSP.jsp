<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hello JSP</title>
</head>
<body>
<strong>welcome to JSP</strong>
<p>Jsp is similar to HTML but in JSP we can use java codes as well.
Jsp has five types of scripting elements.Those are
i.Expression
ii.Scriptlet
iii.Declaration
iv.Directive
v.Comment</p>

<h3>i.Expression</h3>
<%="Expressions are single line statements" %>
<%="No need to use terminators in expression statements" %>
<br>
<%="Expressions are used to create an object or reading value from variable." %>
<br>
<%=new Integer(25)%>
<br>
<%="Also expressions are used to provide output of calculations as well.For example:" %>
<%="25*4 = " + 25*4 %>
<br>
<%="Also it is used to provide output for logical relations.For example :" %>
<%="25>4 ="%> <%=25>4%>

<h3>ii.Scriptlet</h3>
<p>In this,we can use java code fragments</p>
<%
int x = 40;
out.println("The value of x is");
out.println(x);
%>

<h3>iii.Declaration</h3>

<p>Whenever we want to display a variable a better way is to make use of declaration.</p>
<%! 
int count = 10;
int sysout = 20;
%>
<%="Values of count and sysout are "+count+" "+sysout%>
<br>
<p>Generally,in both scriptlets and declarations we declare variable.But in declarations we can specify variables using access specifiers</p>
<%!public int x = 25; %>
<%= "The value of public variable x is : " +x %>
<br>
<p>Declarations are used to specify methods.Whenever we need to declare a method,we must use JSP declaration element.</p>
<%! 
String message()
{
	return "JSP is a viewpage";
}
%>

<%= "The output of method message() is : "+message()%>

<h3>iv.Directive</h3>
<p>Directive is used inorder to import or letting the web browser know that
what exactly this page is.</p>
</body>
</html>
   