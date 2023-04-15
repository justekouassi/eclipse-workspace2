<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="user" class="ci.inphb.larima.Utilisateur" scope="session"></jsp:useBean>

	<jsp:setProperty name="user" property="nom" value="Saly"/>
	<jsp:setProperty name="user" property="prenom" value="Bernadette"/>
	
	<% session.setAttribute("nom", "Saly"); %>
	
	<p>Nom : ${sessionScope.nom } </p>
	<p>Prénom : ${sessionScope.prenom } </p>
</body>
</html>