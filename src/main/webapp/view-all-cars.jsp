<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View All Cars</title>
</head>
<body>
<h1 align="center">Lets-EV Cars List</h1>
<table border="1" width="90%" align="center">
    <tr>
        <th>ID</th>
        <th>brand</th>
        <th>model</th>
        <th>colour</th>
        <th>features</th>
        <th>seatingcapacity</th>
        <th>fuelType</th>
        <th>veified</th>
        <th>milage</th>
        <th>chasisno</th>
        <th>registrationno</th>
        <th>engineno</th>
        <th>verfiedAdminId</th>
        <th>Edit</th>
        <th>Delete</th>
    </tr>

    <c:forEach items="${cars}" var="car">
	<tr>
	    <td>${car.id}</td>
	    <td>${car.brand}</td>
	    <td>${car.model}</td>
	    <td>${car.colour}</td>
	    <td>${car.features}</td>
	    <td>${car.seatingcapacity}</td>
	    <td>${car.fuelType}</td>
	    <td>${car.veified}</td>
	    <td>${car.milage}</td>
	    <td>${car.chasisno}</td>
	    <td>${car.registrationno}</td>
	    <td>${car.engineno}</td>
	    <td>${car.verfiedAdminId}</td>

	    <td><a href="<%= request.getContextPath() %>/getcar?id=${car.id}">Edit</a></td>
	    <td><a href="<%= request.getContextPath() %>/deletecar?id=${car.id}" method="delete">Delete</a></td></tr>
</c:forEach>
</table>
<table align="center">
<tr>
<td><a href="car-register.jsp" style="margin-right: 30px">Car Register</a></td>

<td><a href="index.jsp" style="margin-right: 30px">Home</a></td>
<tr>
</table>

</body>
</html>