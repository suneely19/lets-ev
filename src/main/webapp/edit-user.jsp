<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit User by using ID</title>
</head>
<body>
 <div align="center">
  <h1>Edit User by using ID</h1>
  <form action="<%= request.getContextPath() %>/getuser?id=${id}" method="get">
   <table style="with: 80%">
     <td>User ID</td>
     <td><input type="text" name="id" /></td>
    </tr>
   </table>
   <input type="submit" value="Submit" />
  </form>
 </div>
</body>
</html>