<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>

<html>
<head>
  <title>Booking update </title>
  </head>
  <body align="center">
  <form action="<%= request.getContextPath() %>/updatebooking" method="post">
  <table align="center">
   <tr>
   <td> <lable>ID:</lable></td>
   <td> <input type="text" name="id" value="${booking.id}"></td>
   </tr>
   <tr>
     <td><label>User_Id:</label></td>
     <td><input type"text" name="user_id" value="${booking.user_id}"></td>
     </tr>
     <tr>
          <td><label>Car_Id:</label></td>
          <td><input type"text" name="car_id" value="${booking.car_id}"></td>
          </tr>
          <tr>
               <td><label>Boarding:</label></td>
               <td><input type"text" name="boarding" value="${booking.boarding}"></td>
               </tr>
               <tr>
                    <td><label>Destination:</label></td>
                    <td><input type"text" name="destination" value="${booking.destination}"></td>
                    </tr>
                    <tr>
                         <td><label>Duration:</label></td>
                         <td><input type"text" name="duration" value="${booking.duration}"></td>
                         </tr>
                         <tr>
                              <td><label>Amount:</label></td>
                              <td><input type"text" name="amount" value="${booking.amount}"></td>
                              </tr>

                              <tr>
                               <td align='center'><input type="submit" value="Update"></td>
                               </tr>

                              </table>
                              </form>
                              </body>
                              </html>

