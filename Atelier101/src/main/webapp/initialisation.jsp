<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Initialisation</title>
</head>
<body>
	<jsp:useBean id="user" class="ci.inphb.larima.Utilisateur" scope="session"></jsp:useBean>

	
	<jsp:forward page="forward.jsp">
		<jsp:param value="Koné" name="nom"/>
		<jsp:param value="Abou" name="prenom"/>
		<jsp:param value="60" name="age"/>
	</jsp:forward>
</body>
</html>