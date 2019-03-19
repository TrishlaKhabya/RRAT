<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
</br>
</br>
<form action="candidateForm.jsp" @modelAttribute="can">
<input type="submit" value="Upload Intern Details">
</form>
<form action="result" @modelAttribute="cand" method="post">

Category:
<input type="radio" name="category" value="JAVA">JAVA
<input type="radio" name="category" value=".NET">>.NET
<input type="submit" value="View Details">
</form>
</body>
</html>