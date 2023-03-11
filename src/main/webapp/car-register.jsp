<html>
		<title> Car-Registration </title>
		<head>
		<h1>Register Car</h1>
		</head>
		<body align="center">
		<form align="center" action="<%= request.getContextPath() %>/registercar" method="post">

		<table align="center">
		<tr>
		<td>
		Id :
			</td>
		<td>
		<input type="text" placeholder="Enter Id" name="id">
		</td>
		</tr>
		<tr>
		<td>
		Brand :
			</td>
		<td>
		<input type="text" placeholder="Enter Brand" name="brand">
		</td>
		</tr>
		<tr>
		<td>
		Model :
			</td>
		<td>
		<input type="text" placeholder="Enter Model" name="model">
		</td>
		</tr>
		<tr>
		<td>
		Colour :
			</td>
		<td>
		<input type="text" placeholder="Enter colour" name="colour">
		</td>
		</tr>
		<tr>
		<td>
		Features :
			</td>
		<td>
		<input type="text" placeholder="Enter features" name="features">
		</td>
		</tr>
		<tr>
		<td>
		SeatingCapacity :
			</td>
		<td>
		<input type="text" placeholder="Enter SeatingCapacity" name="seatingcapacity">
		</td>
		</tr>
		<tr>
		<td>
		Fueltype :
			</td>
		<td>
		<input type="text" placeholder="Enter fueltype" name="fueltype">
		</td>
		</tr>
		<td>
		Verified :
			</td>
		<td>
		<input type="text" placeholder="Enter Verified" name="Verified">
		</td>
		</tr>
		<td>
		Milage :
			</td>
		<td>
		<input type="text" placeholder="Enter milage" name="milage">
		</td>
		</tr>
		<td>
		Chasisno :
			</td>
		<td>
		<input type="text" placeholder="Enter chasisno" name="chasisno">
		</td>
		</tr>
		<td>
		RegistrationNo :
			</td>
		<td>
		<input type="text" placeholder="Enter registrationno" name="registrationno">
		</td>
		</tr>
		<td>
		EngineNo :
			</td>
		<td>
		<input type="text" placeholder="Enter EngineNo" name="engineno">
		</td>
		</tr>
		<td>
		VerifiedAdminId :
			</td>
		<td>
		<input type="text" placeholder="Enter VerifiedAdminId" name="VerifiedAdminId">
		</td>
		</tr>

		<td>
		<input type="submit" value="Submit">
		</td>
		</tr>
		</table>

		</form>
		</body>
</html>
