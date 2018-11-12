<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
<link style="stylesheet" href="/style.css">
</head>
<body>
<div class = "container">
<h1>
Please fill the form to register!
</h1>

<form action ="/Summery" method=post>
<p>
Name <br/></br>
<fieldset>
<input type="radio">Mr.</br>
<input type="radio">Mrs.

</p>
  <p>
  </fieldset>
  <fieldset>
    First Name <input name="firstname" type="text"/>
  </p>
  
  <p>
   Last Name<input name="lastname" type="text"/>
  </p>
  <p>
   Email <input name="email" type="email"/>
  </p>
  <p>
   Phone no<input name="phno" type="number"/>
  </p>
  
  <p>
   Password<input name="password" type="password"/>
  </p>
  </fieldset>
  <p>
     <button >Register</button>
  </p>
 </form>
</body>
</div>
</html>