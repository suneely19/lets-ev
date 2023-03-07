<html>
    <title>Booking-registration</title>
    <head>
        <h1>Book a car for rental</h1>
    </head>
    <body align='center'>
        <form action="<%= request.getContextPath() %>/bookcar"  method="post">
        <table align='center'>
          <tr>
            <td><lable>Id : </lable></td>
            <td><input type="text" name="id"/></td>
          </tr>
          <tr>
            <td><lable>user_id : </lable></td>
            <td><input type="text" name="user_id"/><br></td>
          </tr>
          <tr>
                <td><lable>car_id: </lable></td>
                 <td><input type="text" name="car_id"/></td>
          </tr>
           <tr>
                 <td><lable>boarding : </lable></td>
                 <td><input type="text" name="boarding"/></td>
           </tr>
            <tr>
                <td><lable>destination : </lable></td>
                <td><input type="text" name="destination"/></td>
            </tr>
            <tr>
                 <td><lable>duration : </lable></td>
                 <td><input type="text" name="duration"/></td>
            </tr>
            <tr>
                 <td><lable>amount : </lable></td>
                 <td><input type="text" name="amount"/></td>
             </tr>

           </table>

        </form>
    </body>

