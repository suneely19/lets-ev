<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View All Users</title>
</head>
<body>
<h1 align="center">Lets-EV Users List</h1>
<table border="1" width="90%" align="center">
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>MailId</th>
        <th>Address</th>
        <th>MobileNo</th>
        <th>Licence</th>
        <th>Edit</th>
        <th>Delete</th>
        </tr>

    <c:forEach items="${users}" var="user">
	<tr>
	    <td>${user.id}</td>
	    <td>${user.name}</td>
	    <td>${user.mailid}</td>
	    <td>${user.address}</td>
	    <td>${user.mobileno}</td>
	    <td>${user.licence}</td>

	    <td><a href="<%= request.getContextPath() %>/getuser?id=${user.id}">Edit</a></td>
	    <td><a href="<%= request.getContextPath() %>/deleteuser?id=${user.id}" method="delete">Delete</a></td></tr>
</c:forEach>
</table>
<table align="center">
<tr>
<td><a href="user-register.jsp" style="margin-right: 30px">User Register</a></td>

<td><a href="index.jsp" style="margin-right: 30px">Home</a></td>
<tr>
</table>

</body>
</html>