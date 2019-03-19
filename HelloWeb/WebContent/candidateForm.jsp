<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Candidate Details Form</h1><br/>
<form action="candidateDetails" method="GET" modelAttribute="candidate" enctype="multipart/form-data">  
ID:<input type="text" name="id" value=""/><br/><br/>  
Firstname<input type="text" name="firstname"  value=""/><br/>  <br/>
Lastname<input type="text" name="lastname"  value=""/><br/><br/>
Category:<input type="radio" name="category" value="Java"> Java
<input type="radio" name="category" value=".NET"> .NET<BR><br/>
 Upload CV: <input type="file" name="cv"><br/><br/>
<input type="submit" value="save"/>  
</form>  
</body>
</html>