<html>
<title> Admin-Registration </title>
<head>
<h1>Register Admin</h1>
</head>
<body align="center">
    <form align="center" action="<%= request.getContextPath() %>/registeradmin" method="post">

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
                        Name :
                    </td>
                    <td>
                        <input type="text" placeholder="Enter Name" name="name">
                    </td>
                </tr>
                <tr>
                    <td>
                        Address :
                    </td>
                    <td>
                        <input type="text" placeholder="Enter Address" name="address">
                    </td>
                </tr>
                <tr>
                    <td>
                        Mobile :
                    </td>
                    <td>
                        <input type="text" placeholder="Enter mobile" name="mobile">
                    </td>
                </tr>
                <tr>
                    <td>
                        Email :
                    </td>
                    <td>
                        <input type="text" placeholder="Enter Email" name="email">
                    </td>
                </tr>
                <tr>
                    <td>
                        Experiance :
                    </td>
                    <td>
                        <input type="text" placeholder="Enter Experiance" name="experiance">
                    </td>
                </tr>
                <tr>
                    <td>
                         Salary :
                    </td>
                    <td>
                        <input type="text" placeholder="Enter Salary" name="salary">
                    </td>
                </tr>
            </table>
            <br>
            <input type="submit" value="Submit">
        </form>
</body>
</html>