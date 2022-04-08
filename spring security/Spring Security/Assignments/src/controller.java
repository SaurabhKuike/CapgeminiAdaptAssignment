package com.example.spring.securityjdbc;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.RestController;
@RestController
public class controller {
	
	@RequestMapping(value="/*",method=RequestMethod.GET)
	public String everyone() {
		return "hello";
	}
	
	@RequestMapping(value="/user",method=RequestMethod.GET)
	public String User() {
		return "hello user";
	}
	
	@RequestMapping(value="/admin",method=RequestMethod.GET)
	public String admin() {
		return "hello admin";
	}
	
	@RequestMapping(value="/welcome",method=RequestMethod.POST)
	public String welcom() {
		return "welcome";
	}
	

}
