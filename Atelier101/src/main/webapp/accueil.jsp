<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Accueil</title>
</head>
<body>
	<jsp:useBean id="user" class="ci.inphb.larima.Utilisateur" scope="session"></jsp:useBean>

	<jsp:setProperty name="user" property="nom" value="Kouassi"/>
	<jsp:setProperty name="user" property="prenom" value="Juste"/>
	<jsp:setProperty name="user" property="age" value="58"/>

	<a href='affichage.jsp'>Affichage.jsp</a>

</body>
</html>