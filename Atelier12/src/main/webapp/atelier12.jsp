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
	<c:forEach var = "i" begin = "2" end = "20" step = "1">
		<c:if test="${i%2 == 1}">
			<c:out value="${i}" />
		</c:if>
	</c:forEach>
</body>
</html>