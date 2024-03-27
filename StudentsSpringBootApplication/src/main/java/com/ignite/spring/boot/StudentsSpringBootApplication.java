package com.ignite.spring.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.ignite.spring.boot")
@EnableTransactionManagement
public class StudentsSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentsSpringBootApplication.class, args);
	}

}
