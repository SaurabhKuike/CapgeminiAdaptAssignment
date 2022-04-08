package Assignment3;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
UserDetails userdetails;
	@RequestMapping(value="/detail.html", method=RequestMethod.GET)
public ModelAndView getDetails() {
		ModelAndView model=new ModelAndView("data3");
		
	return model;
	
}
	@RequestMapping(value="/success.html", method=RequestMethod.POST)
	public ModelAndView Login(@ModelAttribute("userDetails")UserDetails userDetails ) {
		if(userDetails.getUserpassword().equals("saurabh")) {	
		ModelAndView model=new ModelAndView("data31");
		model.addObject("msg","Welcome \n  Name: "+userDetails.getUsername()+"  Email Address: "+ userDetails.getUseremail());
		return model;
		}
		else
		{
			ModelAndView model=new ModelAndView("error");
		
		return model;
		}
}
}
