<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View All Admins</title>
</head>
<body>
<h1 align="center">Lets-EV Admins List</h1>
<table border="1" width="90%" align="center">
    <tr>
        <th>ID</th>
        <th>name</th>
        <th>MailId</th>
        <th>Address</th>
        <th>Mobile</th>
        <th>Experiance</th>
        <th>Salary</th>
        <th>Edit</th>
        <th>Delete</th></tr>

    <c:forEach items="${admins}" var="admin">
	<tr>
	    <td>${admin.id}</td>
	    <td>${admin.name}</td>
	    <td>${admin.mailid}</td>
	    <td>${admin.address}</td>
	    <td>${admin.mobile}</td>
	    <td>${admin.experiance}</td>
	    <td>${admin.salary}</td>
	    <td><a href="<%= request.getContextPath() %>/getadmin?id=${admin.id}">Edit</a></td>
	    <td><a href="<%= request.getContextPath() %>/deleteadmin?id=${admin.id}" method="delete">Delete</a></td></tr>
</c:forEach>
</table>
<table align="center">
<tr>
<td><a href="admin-register.jsp" style="margin-right: 30px">Admin Register</a></td>

<td><a href="index.jsp" style="margin-right: 30px">Home</a></td>
<tr>
</table>

</body>
</html>