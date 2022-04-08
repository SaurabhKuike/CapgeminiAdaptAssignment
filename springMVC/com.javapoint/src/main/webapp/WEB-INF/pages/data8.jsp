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
      <input type="submit" value="Submit Form"/>
      </form>
</body></html>