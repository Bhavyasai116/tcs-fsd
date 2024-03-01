package com.tcs.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Day23BootDockerApplication {
	
	@GetMapping
	public String message() {
		return "Hello from Springboot-Docker";
	}

	public static void main(String[] args) {
		SpringApplication.run(Day23BootDockerApplication.class, args);
	}

}
