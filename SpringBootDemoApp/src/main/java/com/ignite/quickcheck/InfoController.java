package com.ignite.quickcheck;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InfoController {

	@RequestMapping("/info")
	String greets(){
		return "Bangalore, India";
	}
	
}
