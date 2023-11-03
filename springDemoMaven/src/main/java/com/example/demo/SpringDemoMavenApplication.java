package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringDemoMavenApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDemoMavenApplication.class, args);
	}
	
	@GetMapping("/")
	public String demoView() {
		return String.format("Welcome to my API REST");
	}
	
	@GetMapping("/home")
	public String home() {
		return String.format("Welcome to my API REST Home");
	}

}
