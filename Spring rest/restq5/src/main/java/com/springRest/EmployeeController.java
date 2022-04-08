package com.springRest;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	@Autowired
    EmployeeService employeeService;

    @RequestMapping(value = "/employee",method = RequestMethod.GET)
    public List<Employee> getAllDetails(){
       
       Employee employee1 = new Employee();
       employee1.setEmployeeId(1);
       employee1.setEmployeeName("Novel");
       employee1.setEmployeeDepartment("Mechanical");
       employee1.setEmployeeDesignation("Student");
       employee1.setEmployeeSalary("10000");
       
       Employee employee2 = new Employee();
       employee2.setEmployeeId(2);
       employee2.setEmployeeName("Raju");
       employee2.setEmployeeDepartment("Computer");
       employee2.setEmployeeDesignation("Manager");
       employee2.setEmployeeSalary("5000");
       
       List<Employee> employeeList= employeeService.getAllemployees();
       employeeList.add(employee1);
       employeeList.add(employee2);
       return employeeList;
    }

    @RequestMapping(value="/employee/{id}",method=RequestMethod.GET)
    public Employee getEmployeeById(@PathVariable("id") int id){
        return employeeService.getEmployeeById(id);
    }

    @RequestMapping(value="/employee",method =RequestMethod.POST)
    public Employee addEmployee(@RequestBody Employee employee){
        return employeeService.addEmployee(employee);

    }

    @RequestMapping(value="/employee/{id}",method = RequestMethod.DELETE)
    public boolean deleteEmplolyee(@PathVariable("id") int id){
        return employeeService.deleteEmployee(id);

    }

    @RequestMapping(value = "/employee",method = RequestMethod.PUT)
    public  Employee updateEmployee(@RequestBody Employee employee){
        return employeeService.updateEmployee(employee);
    }
}
