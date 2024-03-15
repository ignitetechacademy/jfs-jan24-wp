package com.ignite.explore.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {

	@RequestMapping("/hello")
	String welcomeMsg(){
		System.out.println("Welcome to : Spring MVC Controller");
		
		return "syam.jsp";
	}
	
	@RequestMapping("/greet")
	String greetMsg(){
		System.out.println("Greet the person ...");
		
		return "welcome.jsp";
	}
}
