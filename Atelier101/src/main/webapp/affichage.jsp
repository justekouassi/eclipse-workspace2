<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
    
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<style>
		body {
			width: 500px;
			margin: auto;
		}
	</style>
	<title>Affichage</title>
</head>
<body>
	<jsp:useBean id="user" class="ci.inphb.larima.Utilisateur" scope="session"></jsp:useBean>
	
	<h2>Via les propriétés</h2>
	<p>Nom : <jsp:getProperty name="user" property="nom"/> </p>
	<p>Prénom : <jsp:getProperty name="user" property="prenom"/> </p>
	<p>Age : <jsp:getProperty name="user" property="age"/> </p>
	
	<h2>Via les méthodes</h2>
	<p>Nom : <%= user.getNom() %> </p>
	<p>Prénom : <%= user.getPrenom() %> </p>
	<p>Age : <%= user.getAge() %> </p>
	
	<h2>EL</h2>
	<p> ${(10 + 2)*2 } </p>
	<p> ${ 10>20 && 1>10 } </p>
	<p> ${ user.nom } </p>
	<p> ${ user["prenom"] } </p>
	<p>${ header["user-agent"] }</p>
	
	<%
	request.setAttribute("cours", "Java");
	application.setAttribute("cours", "Python");
	session.setAttribute("cours", "PHP");
	%>
	
	${ requestScope.cours } <br>
	${ applicationScope.cours } <br>
	${ sessionScope.cours } <br>
</body>
</html>