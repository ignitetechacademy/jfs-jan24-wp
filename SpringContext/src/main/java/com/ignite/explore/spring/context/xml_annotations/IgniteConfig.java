package com.ignite.explore.spring.context.xml_annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ignite.explore.spring.context.CollegeController;

@Configuration
public class IgniteConfig {

	@Bean
	CollegeController getController() {
		return new CollegeController();
	}
}
