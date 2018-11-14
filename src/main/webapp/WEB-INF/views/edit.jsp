<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>  Item </h1>
<form action="/edit_item">
 <fieldset>
 <input type="hidden" name="id" value="${items.id}" />
     Name <input name="name" type="text"/>
  </p>
  
  <p>
Description<input name="description" type="text"/>
  </p>
  
  <p>
   Price<input name="price" type="number"/>
  </p>
  
  
  </fieldset>
  <p>
     <button href="/menu" >Save</button>
  </p>
 </form>
</body>
</html>