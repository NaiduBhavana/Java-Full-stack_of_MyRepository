<html>
<body>
<h2><%= "Import class into JSP file" %></h2>
<%@ page import = "import_class_intojsp_file.Helloclass,java.util.Date"%> 
<%= new Helloclass().demo()%>

<% out.println(new Date());%>
</body>
</html>
