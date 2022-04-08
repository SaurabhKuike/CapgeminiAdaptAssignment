package Assignment9;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class empController {
	
	ArrayList<employeeDetail> list= new ArrayList<employeeDetail>();
     @RequestMapping("/home")
	public ModelAndView getEmp()
{
    	 ModelAndView m=new ModelAndView("data9")	;
    	 return m;
}
     @RequestMapping(value="/home1", method=RequestMethod.GET)
     public ModelAndView showemp()
     {  
     
     list.add(new employeeDetail(1, "Saurabh",9000000));
     list.add(new employeeDetail(2, "Vivek",3550000));
     list.add(new employeeDetail(3, "Akshat",4554000));
     list.add(new employeeDetail(4, "Amlan",3440000));
     list.add(new employeeDetail(5, "Aryan",7990000));
     list.add(new employeeDetail(6, "Harsh",2043530));
     list.add(new employeeDetail(7, "Mintu",4400000));
     list.add(new employeeDetail(8, "Anupam",267700));
     list.add(new employeeDetail(9, "Ratnesh",2300000));
     
     ModelAndView m=new ModelAndView("data91")	;
    	 
    	 m.addObject("list",list);
		return m;
    	 
     }
     @RequestMapping(value="/home2.html" , method=RequestMethod.GET)
 	public ModelAndView getEmp2()
 {
     	 ModelAndView m=new ModelAndView("newemp")	;
     	 return m;
 }
     
     
     @RequestMapping(value="/home3.html", method=RequestMethod.POST)
 	public ModelAndView newEmp(@RequestParam("username") String user,@RequestParam("userid") int id,@RequestParam("usersalary") int salary)
 {       
    	 
    	
     	 ModelAndView m=new ModelAndView("data9")	;
     	 list.add(new employeeDetail(id, user, salary));
     	 
     	 m.addObject(list);
     	 return m;
 }
     
}
