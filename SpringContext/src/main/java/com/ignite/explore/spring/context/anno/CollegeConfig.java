package com.ignite.explore.spring.context.anno;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ignite.explore.spring.context.CollegeController;

@Configuration
public class CollegeConfig {

	@Bean
	CollegeController getController() {
		return new CollegeController();
	}
}
