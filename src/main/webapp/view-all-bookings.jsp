<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>

<html>
<head>
<title>Get All Bookings JSP</title>
</head>
<body>
	<h1 align="center">Bookings List</h1>
	<form action="<%= request.getContextPath() %>/getAllBooking" method="get">
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
				<td><a href="<%=request.getContextPath()%>/getBooking?id=${booking.id}">Edit Booking</a></td>
				<td><a href="<%=request.getContextPath()%>/deleteBooking?id=${booking.id}">Delete Bookings</a></td>
		</c:forEach>
	</table>
	<table align="center">
		<tr>

			<td><a href="booking-register.jsp" style="" :30px>Booking
					register</a></td>

			<td><a href="index.jsp" style="margin-right: 30px">Home</a></td>
		</tr>
	</table>
</body>
</html>

