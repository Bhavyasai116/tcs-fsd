package com.tcs.service.resourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/service")
public class HelloService {
	@Value("name")
	String str;
	
	@Autowired
	Environment env;
	
	@GetMapping
	public String Welcome() {
		String port=env.getProperty("server.port");
		return "Programmig MicroService @"+port;
	}
	
	@GetMapping("/status")
	public String status() {
		return "Up and Running";
	}

}
