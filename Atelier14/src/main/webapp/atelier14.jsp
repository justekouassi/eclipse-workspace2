<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	<c:url var ="affichage" value="/affichage.jsp">
		<c:param name="nom" value="ballo" />
		<c:param name="prenom" value="jean" />
	</c:url>
	<a href="${ affichage }">Affichage.jsp</a>
</body>
</html>