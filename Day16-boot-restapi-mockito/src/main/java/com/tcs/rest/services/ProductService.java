package com.tcs.rest.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.tcs.rest.repository.ProductRepository;
import com.tcs.rest.resource.Product;

@Service
public class ProductService {
	@Autowired
	ProductRepository repo;

	public List<Product> getProducts() {
		List<Product> list = repo.findAll();
		return list;
	}

	public Product getProductById(int id) {
		Product prod = repo.findById(id).get();
		return prod;
	}

	public Product save(Product p) {
		return repo.save(p);
	}

	public Product update(@RequestBody Product p) {
		Optional<Product> optional = repo.findById(p.getPid());
		
			Product temp = optional.get();
			temp.setDescription(p.getDescription());
			temp.setPrice(p.getPrice());
			repo.save(temp);
			return temp;
		
	}
	public boolean delete(int id) {
		repo.deleteById(id);
		return true;
	}

}
