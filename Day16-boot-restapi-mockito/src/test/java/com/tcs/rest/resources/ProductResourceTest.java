package com.tcs.rest.resources;

import static org.assertj.core.api.Assertions.fail;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.tcs.rest.resource.Product;
import com.tcs.rest.services.ProductService;

@WebMvcTest(ProductResource.class)
public class ProductResourceTest {
	@MockBean
	ProductService service;
	
	@Autowired
	MockMvc mockMvc;   //makes a dummy HTTP call -post,get,put,delete
	
	
	@Test
	public void test_addProduct() throws Exception{
		Product product=new Product(1,"Apple iPhone 15",125000);
		when(service.save(product)).
		thenReturn(product);
		mockMvc.perform(post("/addproduct").contentType(MediaType.APPLICATION_JSON).
		content(
				new ObjectMapper().
				writeValueAsString(product)));
		
		
	}
	@Test
	public void test_AllProducts() throws Exception{
		ArrayList<Product> products=new ArrayList<Product>(){};
		//Product product=new Product(1,"Apple iPhone 15",125000);
		
		when(service.getProducts()).
		thenReturn(products);
		mockMvc.perform(post("/allproducts").contentType(MediaType.APPLICATION_JSON).
		content(
				new ObjectMapper().
				writeValueAsString(products)));
		
		
	}

	
	void test(){
		fail("Not yet implemented");
	}
	
	
	
	

}
