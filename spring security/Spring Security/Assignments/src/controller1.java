package com.example.spring.securityjdbc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class controller1 {
	@RequestMapping(value="/login1")
	public String result() {
		return "login1";
	}

}
