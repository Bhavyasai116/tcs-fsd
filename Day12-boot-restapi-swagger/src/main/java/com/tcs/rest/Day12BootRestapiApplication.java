package com.tcs.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.tcs.rest.repository.ProductRepository;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class Day12BootRestapiApplication {
//	@Autowired
//	ProductRepository repo;

	public static void main(String[] args) {
		SpringApplication.run(Day12BootRestapiApplication.class, args);
		//ConfigurableApplicationContext 
	}

}
