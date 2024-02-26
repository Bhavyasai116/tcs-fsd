package com.tcs.rest.resources;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.tcs.rest.resource.Product;
import com.tcs.rest.services.ProductService;

@RestController
@RequestMapping("/product/api.1.0")
public class ProductResource {
	@Autowired
	ProductService service;
	
	@GetMapping
	public String check() {
		return "Successfull";
	}
	@GetMapping("/allproducts")
	public List<Product> showAllProducts(){
		
		return service.getProducts();
	}
	@GetMapping("/productid/{id}")
	
	public Optional<Product> fetchproduct(@PathVariable int id) {
		return Optional.of(service.getProductById(id));
	}
	
	@PostMapping(path="/addproduct",consumes="application/json",produces="application/json")
	public Product createProduct(@RequestBody Product product) {
		return service.save(product);
	}
	@PutMapping(path="/updateproduct",consumes="application/json",produces="application/json")
	public Product updateProduct(@RequestBody Product product) {
		return service.update(product);
	}
	@DeleteMapping("/remove/{id}")
	public boolean deleteProduct(@PathVariable int id) {
		return service.delete(id);
	}
	
	

}
