<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<table class="table" >
			<thead><tr>
				<th>Name</th>
				<th>Description</th>
				<th>Price</th></tr>
	
			</thead>
			
			<tbody>
			<c:forEach items="${items }" var="item">
			<tr>${item.name}</tr><br>
			<tr>${item.description}</tr><br>
			<tr>${item.price}</tr><br>
			</c:forEach>
		
       <!--   <tr>${items[0].name}</tr>   <tr>${items[0].description}</tr> <tr>${items[0].price }</tr> <br><br>
           <tr>${items[1].name }</tr>   <tr>${items[1].description}</tr> <tr>${items[1].price }</tr><br>
            <tr>${items[2].name }</tr>   <tr>${items[2].description}</tr> <tr>${items[2].price }</tr>-->
          <a class="menu" href="/item/create"  >Add a new Item</a>
          <a class="menu" href="/item/edit">Edit an item</a>
			</tbody>
</table> 
</body>
</html>