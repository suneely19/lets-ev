
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Car by using ID</title>
</head>
<body>
 <div align="center">
  <h1>Edit Car by using ID</h1>
  <form action="<%= request.getContextPath() %>/getcar?id=${id}" method="get">
   <table style="with: 80%">
     <td>Car ID</td>
     <td><input type="text" name="id" /></td>
    </tr>
   </table>
   <input type="submit" value="Submit" />
  </form>
 </div>
</body>
</html>