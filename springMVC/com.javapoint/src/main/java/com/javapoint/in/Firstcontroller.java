package com.javapoint.in;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Firstcontroller {
	@GetMapping("/home")
	public String home()
	{
		return "home";
	}
	@RequestMapping("/h2")
	public String home1()
	{
		
		return "home";
	}
	@GetMapping("/home2/{country}/{username}")
	@ResponseBody
	public String home3(@PathVariable Map<String, String> pathvars)
	{
		String name=pathvars.get("username");
		String country=pathvars.get("country");
		
		return "my name is "+name+" my country is "+country;
	}
}
