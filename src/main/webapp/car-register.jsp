<html>
    <title>car-registration</title>
    <head>
        <h1>Register your car for rental</h1>
    </head>
    <body align='center'>
        <form action="<%= request.getContextPath() %>/registercar"  method="post">
        <table align='center'>
          <tr>
            <td><lable>Id : </lable></td>
            <td><input type="text" name="id"/></td>
          </tr>
          <tr>
            <td><lable>Brand : </lable></td>
            <td><input type="text" name="brand"/><br></td>
          </tr>
          <tr>
                <td><lable>Model : </lable></td>
                 <td><input type="text" name="model"/></td>
          </tr>
           <tr>
                 <td><lable>Colour : </lable></td>
                 <td><input type="text" name="colour"/></td>
           </tr>
            <tr>
                <td><lable>Features : </lable></td>
                <td><input type="text" name="features"/></td>
            </tr>
            <tr>
                 <td><lable>SeatingCapacity : </lable></td>
                 <td><input type="text" name="seatingcapacity"/></td>
            </tr>
            <tr>
                 <td><lable>Fueltype : </lable></td>
                 <td><input type="text" name="fueltype"/></td>
             </tr>
             <tr>
                  <td><lable>Milage : </lable></td>
                  <td><input type="text" name="milage"/></td>
             </tr>
             <tr>
                  <td><lable>Chasisno : </lable></td>
                  <td><input type="text" name="chasisno"/></td>
             </tr>
             <tr>
                 <td><lable>RegistrationNo : </lable></td>
                 <td><input type="text" name="registrationno"/></td>
             </tr>
             <tr>
                 <td><lable>EngineNo : </lable></td>
                 <td><input type="text" name="engineno"/></td>
             </tr>
             <tr>
                 <td><input type="submit" button="register"/></td>
            </tr>
           </table>

        </form>
    </body>


</html>