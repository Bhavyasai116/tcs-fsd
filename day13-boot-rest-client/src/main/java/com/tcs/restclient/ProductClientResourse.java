package com.tcs.restclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/client")
public class ProductClientResourse {
	@Autowired
	RestTemplate template;
	
	@GetMapping
	public Product getProduct() {
		Product prod=template.getForObject("http://localhost:9092/product/api.1.0/productid/2", Product.class);
		return prod;
	}

}
