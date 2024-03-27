package com.ignite.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "com.ignite.quickcheck", "com.ignite.demo" })
public class SpringBootDemoAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoAppApplication.class, args);

	}

}
