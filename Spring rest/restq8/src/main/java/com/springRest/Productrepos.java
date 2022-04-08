package com.springRest;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.springRest.Product;

public interface Productrepos extends MongoRepository<Product, String>{
	public Product findByName(String name);

	public List<Product> findByCost(float cost);

	public List<Product> findByDate(String date);
}
