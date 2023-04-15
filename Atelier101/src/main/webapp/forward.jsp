<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Forward</title>
</head>
<body>
	<jsp:useBean id="user" class="ci.inphb.larima.Utilisateur" scope="session"></jsp:useBean>

	<jsp:setProperty name="user" property="*"/>
	
	<h2>Via les propriétés</h2>
	<p>Nom : <jsp:getProperty name="user" property="nom"/> </p>
	<p>Prénom : <jsp:getProperty name="user" property="prenom"/> </p>
	<p>Age : <jsp:getProperty name="user" property="age"/> </p>
</body>
</html>