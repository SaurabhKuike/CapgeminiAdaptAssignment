package Assignment8;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class changelang {
@RequestMapping("/user.html")
public ModelAndView getUser()
{
	ModelAndView m= new ModelAndView("data8")	;
	return m;
}
@RequestMapping("/request.html")
public ModelAndView print(@ModelAttribute("userpas")userpass userpas)
{
	ModelAndView m= new ModelAndView("data81")	;
	m.addObject("username",userpas.getUsername());
	m.addObject("pass",userpas.getPassword());
	return m;
}
}
