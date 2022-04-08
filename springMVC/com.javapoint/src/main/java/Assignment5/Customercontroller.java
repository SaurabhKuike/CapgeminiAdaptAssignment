package Assignment5;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Customercontroller {
    @RequestMapping(value="/customerdetail.html",method=RequestMethod.GET)
	public ModelAndView getDetails()
	{
   	 ModelAndView model=new ModelAndView("data5");
		return model;
		
	}
    @RequestMapping(value="/request.html",method=RequestMethod.POST)
  	public ModelAndView EmpList(@ModelAttribute("customerdetails") Customerdetail customerdetails)
  	{
     	 Map<String,Object> list=new HashMap<String, Object>(); 
     	 
      	 ModelAndView model=new ModelAndView("data51");
      	 list.put("username", customerdetails.getUsername());
      	list.put("city",customerdetails.getCity());
      	list.put("contact",customerdetails.getContact());
      	list.put("email",customerdetails.getEmail());
      	list.put("zipcode",customerdetails.getZipcode());
      	 model.addAllObjects(list);

      	 
  		return model;
  		
  	}
}
