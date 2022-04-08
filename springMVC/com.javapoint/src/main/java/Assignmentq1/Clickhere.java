package Assignmentq1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Clickhere {
    @RequestMapping("/hello")   
	public String display() {
		return "viewpage";
		
	}
    
    @RequestMapping("/hiAgain")
 public String display2() {
	 return "again";
 }
    
}
