<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>

<html>

<head>
    <title>
        User Update Form
    </title>
</head>
<form  action="<%= request.getContextPath() %>/updateuser" method="post">
<table align="center">
    <tr>
      <td> <lable>ID:</lable></td>
      <td> <input type="text" name="id" value="${user.id}"></td>
    </tr>
    <tr>
      <td><lable>Name:</lable></td>
      <td><input type="text" name="name" value="${user.name}" ></td>
    </tr>
    <tr>
      <td><lable>MailId:</lable></td>
      <td><input type="text" name="mailid" value="${user.mailid}"></td>
    </tr>
    <tr>
      <td><lable>Address:</lable></td>
      <td><input type="text" name="address" value="${user.address}"></td>
    </tr>
    <tr>
      <td><lable>MobileNo:</lable>
      <td><input type="text" name="mobileno" value="${user.mobile}"></td>
    </tr>
    <tr>
      <td><lable>Licence:</lable></td>
      <td><input type="text" name="licence" value="${user.salary}"></td>
    </tr>
    <tr>
      <td><input type="submit" value="Update"></td>
    <tr>
  </table>
</form>
</body>
</html>
