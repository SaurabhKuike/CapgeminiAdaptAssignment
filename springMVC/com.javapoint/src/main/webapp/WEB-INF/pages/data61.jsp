<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
  <%@ page isELIgnored="false" %>
<h1>Employees List</h1>  
<table border="2" width="70%" cellpadding="2">  
<tr><th>ID</th><th>NAME</th><th>SALARY</th><th>DESIGNATION</th><th>DEPARTMENT</th><th>Edit</th><th>Delete</th></tr>  

   <tr>  
   <td>${employeeid}</td>  
   <td>${employeename}</td>  
   <td>${employeesalary}</td>  
   <td>${employeedesignation}</td>  
    <td>${employeedepartment}</td>  
   <td><a href="editemp">Edit</a></td>  
   <td><a href="deleteemp">Delete</a></td>  
   </tr>  

   </table>  
   <br/>  
   <a href="employeedetail.html">Add New Employee</a>  