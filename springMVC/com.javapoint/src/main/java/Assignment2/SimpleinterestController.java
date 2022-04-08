package Assignment2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SimpleinterestController {
	 @RequestMapping(value="/value.html",method=RequestMethod.GET)
	 public ModelAndView getvalue()
	 {
		ModelAndView model=new ModelAndView("simpleinterest"); 
		 
		 
		return model;
		 
	 }
	 @RequestMapping(value="/print.html",method=RequestMethod.POST)
	 public ModelAndView Calculate(@RequestParam("principle") int principle,@RequestParam("time") int time,@RequestParam("rate") int rate)
	 {
	     float SI;
		 ModelAndView model=new ModelAndView("simpleprint");
	     SI=principle*time*rate;
	     model.addObject("msg",SI);
		return model;
		 
	 }
}
