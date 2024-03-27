package com.ignite.spring.boot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class WelcomeController {

	@RequestMapping("/welcome")
	String welcomeMessage() {
		System.out.println("Reached server ...");

		return "Welcome to SpringBoot Application - Ignite";
	}
}
