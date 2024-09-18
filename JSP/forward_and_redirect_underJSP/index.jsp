<html>
<body>
<h2><%= "Forwarding and redirecting of page concept" %></h2>

<%--<jsp:forward page = "Forward.jsp"></jsp:forward>--%>

<%--request.getRequestDispatcher("Forward.jsp").forward(request,response);
--%>
<%--response.sendRedirect("Redirect.jsp");--%>
<% 
response.sendRedirect("Redirect.jsp");
%>
</body>
</html>
