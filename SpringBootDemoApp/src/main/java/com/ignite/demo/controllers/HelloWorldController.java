package com.ignite.demo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@RequestMapping("/hello")
	String helloWorld() {
		return "Hello, World - Spring Boot";
	}
}
