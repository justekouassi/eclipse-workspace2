<%@ page language="java" 
	contentType="text/html; charset=ISO-8859-1"
	import="java.io.PrintWriter, java.util.ArrayList, javax.servlet.ServletContext"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Afficheur</title>
</head>
<body>
	<%
	ServletContext contexte = getServletContext();
	ArrayList<String> liste1 = (ArrayList<String>) contexte.getAttribute("liste");
	for (String item:liste1) {
		out.print("<p>" + item + "</p>");
	}
	%>
</body>
</html>