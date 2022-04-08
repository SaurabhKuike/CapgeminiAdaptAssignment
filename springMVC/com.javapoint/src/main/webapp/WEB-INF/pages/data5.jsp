<html>
<body>
   <h1>STUDENT ADMISSION FORM FOR ENGINEERING</h1>
   <form action="/com.javapoint/request.html" method="post">
   <p>
     Username : <input type="text" name="username" required/>
     </p>
     <p>
     Password  : <br>
     <label for="password">password:</label>
     <input type="password" name="password" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,20}"
     title="Must COntain Atleast one Number and One Uppercase And Lowercase Letter,and Atleast 8 or more Character" required/>
      </p>
      <p>
     Email : <input type="email" name="employeeDesignation" required/>
      </p>
      <p>
     Zipcode : <input type="tel" name="zipcode" pattern="^\d{6}$" title="Must Contain 6 Digits" required/>
      </p>
      <p>
      Contact : <input type="tel" name="contact" pattern="^\d{10}$" title="Must Contain 10 Digits" required/>
      </p>
      <p>
      City :<br>
      <label for="city">city:</label>
      <select name="city" id="city">
      <option value="korba">korba</option>
      <option value="champa">champa</option>
      <option value="katghora">katghora</option>
      <option value="amarkantak">amarkantak</option>
       </select>
       <br>
       <br>
       </p>
      <input type="submit" value="Submit Form"/>
      </form>
</body></html>