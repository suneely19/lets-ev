``<html>
<head>
<h1 align="center"> Welcome to the LETS-EV CAR booking Application</h1>
</head>
<body align='center'>

    <a href="edit-admin.jsp">edit-admin</a><br>
    <a href="admin-register.jsp">register-admin</a><br>
    <a href="get-admin.jsp">get-admin</a><br>
    <a href="update-admin.jsp">update-admin</a><br>
    <a href="delete-admin.jsp">delete-admin</a><br>
    <a href="<%= request.getContextPath() %>/getalladmins">view all admins</a><br>


    <a href="edit-car.jsp">edit-car</a><br>
    <a href="car-register.jsp">register-car</a><br>
    <a href="get-car.jsp">get-car</a><br>
    <a href="update-car.jsp">update-car</a><br>
    <a href="delete-car.jsp">delete-car</a><br>
    <a href="<%= request.getContextPath() %>/getallcars">view all cars</a>




    <a href="edit-user.jsp">edit-user</a><br>
    <a href="user-register.jsp">register-user</a><br>
    <a href="get-user.jsp">get-user</a><br>
    <a href="update-user.jsp">update-user</a><br>
    <a href="delete-user.jsp">delete-user</a><br>
    <a href="<%= request.getContextPath() %>/getallusers">view all users</a>
</body>
</html>
