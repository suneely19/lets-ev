<html>
   <title>user-registration</title>
   <head>
      <h1>User Registration</h1>
   </head>
   <body align='center'>
     <form action="<%= request.getContextPath() %>/registeruser" method="post">
       <table align='center'>
         <tr>
            <td><label>Id           : </label></td>
         <td><input type="text" name="id"/><br></td>
         </tr>
         <tr>
            <td><label>Name        : </label></td>
            <td><input type="text" name="name"/><br></td>
         </tr>
         <tr>
            <td><label>Mail_id    : </label></td>
            <td><input type="text" name="mailid"/><br></td>
         </tr>
         <tr>
            <td><label>Address    : </label></td>
            <td><input type="text" name="address"/><br></td>
         </tr>
         <tr>
            <td><label>Mobile_no : </label></td>
            <td><input type="text" name="mobileno"/><br></td>
         </tr>
         <tr>
            <td><label>Licence   : </label></td>
            <td><input type="text" name="licence"/><br></td>
         </tr>
     </table>
     <input type="submit" value="submit">
    </form>
   </body>
</html>