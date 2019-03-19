   <%@page import="java.util.ArrayList"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
      <%@page import="model.Candidate" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="result_details" method="post" modelAttribute="results">
<table border="2" width="70%" cellpadding="2">  
<tr><th>Id</th><th>Name</th><th>L0</th><th>L1</th><th>HR</th><th></th></tr>  
<%
ArrayList<Candidate> li=(ArrayList<Candidate>)request.getAttribute("list");
for(int i=0;i<li.size();i++)
{System.out.println("result:"+li.get(i).getId());
System.out.println(li.get(i).getFirstname());
%>
<tr><td><%= li.get(i).getId() %></td>
<td><%= li.get(i).getFirstname() %>&nbsp<%=li.get(i).getLastname() %></td>

<td><input type="checkbox" name="l0"></td>
<td><input type="checkbox" name="l1"></td>
<td><input type="checkbox" name="hr"></td>
<td><a href="editemp/<%= li.get(i).getId()%>">Download</a></td>
</tr>
<%	
}
%>
</table>
</br>&nbsp
<input type="submit" value="Update">
</form>
</body>
</html>