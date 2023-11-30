package com.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoAwsProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoAwsProjectApplication.class, args);
	}

	@GetMapping(value = "/greet/{name}")
	public String greet(@PathVariable("name") String name){
		return "hello "+name;
	}
}
