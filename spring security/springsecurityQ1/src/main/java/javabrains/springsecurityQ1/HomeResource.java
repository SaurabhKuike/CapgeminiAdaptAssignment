package javabrains.springsecurityQ1;

package javabrains.springsecurityQ1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource {
	
	@RequestMapping("/hello")
	public String home() {
		return ("<h1>HELLO USER<h1>");
	}
	
	@RequestMapping("/welcome")
	public String welcome()
	{
		return ("<h1>WELCOME USER</h1>");
	}
}