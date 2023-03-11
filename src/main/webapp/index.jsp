``<html>
<head>
<h1 align="center"> Welcome to the LETS-EV CAR booking Application</h1>
</head>
<body align='center'>
<table align='center'>
   <tr>
    <td><a href="edit-admin.jsp">edit-admin</a></td>
    <td>&nbsp</td>
    <td><a href="admin-register.jsp">register-admin</a></td>
     <td>&nbsp</td>
    <td><a href="get-admin.jsp">get-admin</a></td>
   </tr>
   <tr>
    <td><a href="<%= request.getContextPath() %>/getallusers">view all users</a></td>
    <td>&nbsp</td>
    <td><a href="delete-admin.jsp">delete-admin</a></td>
    <td>&nbsp</td>
    <td><a href="<%= request.getContextPath() %>/getalladmins">view all admins</a></td>
   </tr>
   <tr>
    <td><a href="edit-car.jsp">edit-car</a></td>
    <td>&nbsp</td>
    <td><a href="car-register.jsp">register-car</a></td>
    <td>&nbsp</td>
    <td><a href="get-car.jsp">get-car</a></td>
   </tr>
   <tr>
    <td><a href="delete-user.jsp">delete-user</a></td>
    <td>&nbsp</td>
    <td><a href="delete-car.jsp">delete-car</a></td>
    <td>&nbsp</td>
    <td><a href="<%= request.getContextPath() %>/getallcars">view all cars</a></td>
   </tr>
   <tr>
     <td><a href="edit-user.jsp">edit-user</a></td>
     <td>&nbsp</td>
     <td><a href="user-register.jsp">register-user</a></td>
     <td>&nbsp</td>
     <td><a href="get-user.jsp">get-user</a></td>
   </tr>
</table>
</body>
</html>
