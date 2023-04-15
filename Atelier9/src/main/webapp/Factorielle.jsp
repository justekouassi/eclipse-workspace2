<%@ page language="java" contentType="text/html; charset=ISO-8859-1" import="java.util.Date"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%! Date jour = new Date(); %>
	<h2>Nous sommes le <%= jour %></h2>
	
	<%! int factorielle(int n) {
			int fact = 1;
			while (n>0) {
				fact = fact*n;
				n = n - 1;
			}
			return fact;
		}
	%>
	<h2>Factorielle(6) = <%= factorielle(6) %></h2>
</body>
</html>