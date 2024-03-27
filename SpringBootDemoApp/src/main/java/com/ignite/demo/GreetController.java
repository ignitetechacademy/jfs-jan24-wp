package com.ignite.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class GreetController {

	@RequestMapping("/greet")
	String info() {
		return "Ignite Tech Academy, Bangalore";
	}
}
