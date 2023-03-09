
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Get Booking by using ID</title>
</head>
<body>
 <div align="center">
  <h1>Get Booking by using ID</h1>
  <form action="<%= request.getContextPath() %>/deletebooking?id=${id}" method="get">
   <table style="with: 80%">
     <td>Admin ID</td>
     <td><input type="text" name="id" /></td>
    </tr>
   </table>
   <input type="submit" value="Submit" />
  </form>
 </div>
</body>
</html>