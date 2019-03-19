<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
 


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method = "get" action="register">
       <table>
<tr>
<td>ID:<input type="text" value="" name="id"></td>
</tr>

<tr>
<td>Name:<input type="text" value="" name="name"></td>
</tr>

<tr>
<td>Password:<input type="text" value="" name="password"></td>
</tr>

<tr>
<td>Confirm password:<input type="text" value="" name="cpassword"></td>
</tr>
<tr>
<td><input type="submit" value="submit"></td>
</tr>
</table>
      </form>
      
</body>
</html>