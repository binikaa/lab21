<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

Hello  ${Customer.firstname} ${Customer.lastname}
What would you like to order from the menu?<br>
Enter your choice!!


<a class="menu" href="/menu" method=post >Menu</a>
</body>
</html>