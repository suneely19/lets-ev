<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>

<html>

<head>
    <title>
        Car Update Form
    </title>
</head>
<form  action="<%= request.getContextPath() %>/updatecar" method="post">
<table align="center">
    <tr>
    		<td>
    		Id :
    			</td>
    		<td>
    		<input type="text" placeholder="Enter Id" name="id" value="${car.id}">
    		</td>
    		</tr>
    		<tr>
    		<td>
    		Brand :
    			</td>
    		<td>
    		<input type="text" placeholder="Enter Brand" name="brand" value="${car.brand}">
    		</td>
    		</tr>
    		<tr>
    		<td>
    		Model :
    			</td>
    		<td>
    		<input type="text" placeholder="Enter Model" name="model" value="${car.model}">
    		</td>
    		</tr>
    		<tr>
    		<td>
    		Colour :
    			</td>
    		<td>
    		<input type="text" placeholder="Enter colour" name="colour" value="${car.colour}">
    		</td>
    		</tr>
    		<tr>
    		<td>
    		Features :
    			</td>
    		<td>
    		<input type="text" placeholder="Enter features" name="features" value="${car.features}">
    		</td>
    		</tr>
    		<tr>
    		<td>
    		SeatingCapacity :
    			</td>
    		<td>
    		<input type="text" placeholder="Enter SeatingCapacity" name="seatingcapacity" value="${car.seatingcapacity}">
    		</td>
    		</tr>
    		<tr>
    		<td>
    		Fueltype :
    			</td>
    		<td>
    		<input type="text" placeholder="Enter fueltype" name="fueltype" value="${car.fuelType}">
    		</td>
    		</tr>
    		<td>
    		Verified :
    			</td>
    		<td>
    		<input type="text" placeholder="Enter Verified" name="Verified" value="${car.veified}">
    		</td>
    		</tr>
    		<td>
    		Milage :
    			</td>
    		<td>
    		<input type="text" placeholder="Enter milage" name="milage" value="${car.milage}">
    		</td>
    		</tr>
    		<td>
    		Chasisno :
    			</td>
    		<td>
    		<input type="text" placeholder="Enter chasisno" name="chasisno" value="${car.chasisno}">
    		</td>
    		</tr>
    		<td>
    		RegistrationNo :
    			</td>
    		<td>
    		<input type="text" placeholder="Enter registrationno" name="registrationno" value="${car.registrationno}">
    		</td>
    		</tr>
    		<td>
    		EngineNo :
    			</td>
    		<td>
    		<input type="text" placeholder="Enter EngineNo" name="engineno" value="${car.engineno}">
    		</td>
    		</tr>
    		<td>
    		VerifiedAdminId :
    			</td>
    		<td>
    		<input type="text" placeholder="Enter VerifiedAdminId" name="VerifiedAdminId" value="${car.verfiedAdminId}">
    		</td>
    		</tr>

    		<td>
    		<input type="submit" value="Submit">
    		</td>
    		</tr>
</form>
</body>
</html>
