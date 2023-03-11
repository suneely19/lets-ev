<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View All Bookings</title>
</head>
<body>
	<h1 align="center"> Lets Ev Bookings List</h1>
	<table border="1" width="90%" align="center">
		<tr>
			<th>ID</th>
			<th>User_ID</th>
			<th>Car_Id</th>
			<th>Boarding</th>
			<th>Destination</th>
			<th>Duration</th>
			<th>Amount</th>
		</tr>

		<c:forEach items="${Bookings}" var="booking">
			<tr>
				<td>${booking.id}</td>
				<td>${booking.user_id}</td>
				<td>${booking.car_id}</td>
				<td>${booking.boarding}</td>
				<td>${booking.destination}</td>
				<td>${booking.duration}</td>
				<td>${booking.amount}</td>
				<td><a href="<%=request.getContextPath()%>/getbooking?id=${booking.id}">Edit</a></td>
				<td><a href="<%=request.getContextPath()%>/deletebooking?id=${booking.id}">Delete</a></td>
		</c:forEach>
	</table>
	<table align="center">
		<tr>

			<td><a href="booking-register.jsp" style="" :30px>Booking register</a></td>

			<td><a href="index.jsp" style="margin-right: 30px">Home</a></td>
		</tr>
	</table>
</body>
</html>

