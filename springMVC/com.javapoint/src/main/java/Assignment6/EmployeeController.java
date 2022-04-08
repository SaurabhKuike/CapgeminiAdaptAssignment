package Assignment6;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController {
     @RequestMapping(value="/employeedetail.html",method=RequestMethod.GET)
	public ModelAndView getDetails()
	{
    	 ModelAndView model=new ModelAndView("data6");
		return model;
		
	}
     @RequestMapping(value="/list.html",method=RequestMethod.POST)
 	public ModelAndView EmpList(@ModelAttribute("employeedetails") employeeDetails employeedetails)
 	{
    	 Map<String,Object> list=new HashMap<String, Object>(); 
    	 
     	 ModelAndView model=new ModelAndView("data61");
     	 list.put("employeename", employeedetails.getEmployeeName());
     	list.put("employeedesignation",employeedetails.getEmployeeDesignation());
     	list.put("employeedepartment",employeedetails.getEmployeeDepartment());
     	list.put("employeeid",employeedetails.getEmployeeId());
     	list.put("employeesalary",employeedetails.getEmployeeSalary());
     	 model.addAllObjects(list);

     	 
 		return model;
 		
 	}
}
