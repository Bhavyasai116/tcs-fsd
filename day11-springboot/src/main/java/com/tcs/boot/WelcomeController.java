package com.tcs.boot;
 
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
 
@Controller
 
public class WelcomeController {
	@GetMapping
	public String invite(Model map) {
		 map.addAttribute("Location","Chennai One");
		return "registrationform";
	}
 
}