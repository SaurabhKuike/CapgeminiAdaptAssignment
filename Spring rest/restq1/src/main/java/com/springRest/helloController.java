package com.springRest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloController {
	@RequestMapping("/hello")
	public String sayHi(){
		return "Hi Novel";
	}

}
