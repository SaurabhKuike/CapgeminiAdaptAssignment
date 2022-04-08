package parameter;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SpringMVCController {
@RequestMapping(value="/admissionform.html", method=RequestMethod.GET)
public ModelAndView getadmission() {
	ModelAndView model= new ModelAndView("admissionform");
	
	return model;
}
	@RequestMapping(value="/sucess.html",method=RequestMethod.POST)
	public ModelAndView Submitadmission(  @RequestParam("studentname") String name, @RequestParam("studenthobby") String hobby) {
		ModelAndView model= new ModelAndView("sucess");
		model.addObject("msg","Details Name:"+name+" , Hobby: "+hobby);
		return model;
		
	}	
	
	
 }
