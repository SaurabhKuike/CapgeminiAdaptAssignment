package com.springRest;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.springRest.Order;


@Repository
public interface OrderRepo extends MongoRepository<Order,String> {
	
}
