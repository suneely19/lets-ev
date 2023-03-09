<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>

<html>

<head>
    <title>
        Admin Update Form
    </title>
</head>
<form  action="<%= request.getContextPath() %>/updateadmin" method="post">
<table align="center">
    <tr>
      <td> <lable>ID:</lable></td>
      <td> <input type="text" name="id" value="${admin.id}"></td>
    </tr>
    <tr>
      <td><lable>Name:</lable></td>
      <td><input type="text" name="name" value="${admin.name}" ></td>
    </tr>
    <tr>
      <td><lable>MailId:</lable></td>
      <td><input type="text" name="mailid" value="${admin.mailid}"></td>
    </tr>
    <tr>
      <td><lable>Address:</lable></td>
      <td><input type="text" name="address" value="${admin.address}"></td>
    </tr>
    <tr>
      <td><lable>Mobile:</lable>
      <td><input type="text" name="mobile" value="${admin.mobile}"></td>
    </tr>
    <tr>
      <td><lable>Experiance:</lable></td>
      <td><input type="text" name="experiance" value="${admin.experiance}"></td>
    </tr>
    <tr>
      <td><lable>Salary:</lable></td>
      <td><input type="text" name="salary" value="${admin.salary}"></td>
    </tr>
    <tr>
      <td><input type="submit" value="Update"></td>
    <tr>
  </table>
</form>
</body>
</html>
