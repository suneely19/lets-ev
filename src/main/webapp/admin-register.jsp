<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>

<html>
<title> Admin-Registration </title>
<head>
<h1>Register Admin</h1>
</head>
<body align="center">
    <form align="center" action="<%= request.getContextPath() %>/registeradmin" method="post">
            <table align="center">
                <tr>
                    <td><lable>Id : </lable></td>
                    <td><input type="text" name="id"></td>
                </tr>
                <tr>
                    <td><lable>Name : </lable></td>
                    <td><input type="text" name="name"></td>
                </tr>
                <tr>
                    <td><lable>Address : </lable></td>
                    <td><input type="text" name="address"></td>
                </tr>
                <tr>
                    <td><lable>Mobile : </lable></td>
                    <td><input type="text" name="mobile"></td>
                </tr>
                <tr>
                    <td><lable>Email : </lable></td>
                    <td><input type="text" name="email"></td>
                </tr>
                <tr>
                    <td><lable>Experiance : </lable></td>
                    <td><input type="text" name="experiance"></td>
                </tr>
                <tr>
                    <td><lable>Salary : </lable></td>
                    <td><input type="text" name="salary"></td>
                </tr></tr></tr>
                <tr>
                <td align='center'><input type="submit" value="Submit"></td>
                </tr>
            </table>
            <br>

        </form>
</body>
</html>