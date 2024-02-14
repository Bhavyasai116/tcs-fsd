package com.tcs.rest.resources;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
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
	public List<Product> showAllProducts() {

		return service.getProducts();
	}

	@GetMapping("/productid/{id}")

	public Optional<Product> fetchproduct(@PathVariable int id) {
		return service.getProductById(id);
	}

	@PostMapping(path = "/addproduct", consumes = "application/json", produces = "application/json")
	// @ResponseStatus(code=HttpStatus.CREATED)
	public ResponseEntity<Product> createProduct(@RequestBody Product product) {

		// return new ResponseEntity(service.save(product),HttpStatus.);

		HttpHeaders myheader = new HttpHeaders();
		myheader.add("secret", "fooboo");

		return ResponseEntity.status(HttpStatus.CREATED).headers(myheader).body(service.save(product));

		// return ResponseEntity.status(HttpStatus.CREATED).body(service.save(product));

		// service.save(product);
		// return ResponseEntity.status(HttpStatus.CREATED).body("created your requested
		// object");
	}

	@PutMapping(path = "/updateproduct", consumes = "application/json", produces = "application/json")
	public Product updateProduct(@RequestBody Product product) {
		return service.update(product);
	}

	@DeleteMapping("/remove/{id}")
	public boolean deleteProduct(@PathVariable int id) {
		return service.delete(id);
	}

}
