package com.tcs.rest.services;

import java.util.Optional;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.tcs.rest.repository.ProductRepository;
import com.tcs.rest.resource.Product;

@ExtendWith(MockitoExtension.class)
class ProductServiceTest {
	
	@InjectMocks
	private ProductService service;
	@Mock
	private ProductRepository repository;
	
	@BeforeEach
	void setUp() {
		Optional<Product> optional=Optional.of(new Product(9,"Smart Washing Machine",25000.0));
		System.out.println(optional.get());
		Mockito.when(repository.findById(9)).thenReturn(optional);
	}
	
	@Test
	public void testGetProductById() {
		
		double expected_prize=25000.0;
		Product prod=service.getProductById(9);	
		assertEquals(expected_prize,prod.getPrice());	
	}

	

	
	

}
