package com.farmersmart.shopping.cart.Service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.farmersmart.shopping.cart.Entity.ShoppingCartEntity;
import com.farmersmart.shopping.cart.Entity.ShoppingCartRepository;
@Service
public class ShoppingCartService {
	
	private static final Logger logger=LoggerFactory.getLogger(ShoppingCartService.class);

	@Autowired
	ShoppingCartRepository repository;
	public String addProduct(@RequestBody ShoppingCartEntity entity) {
		// TODO Auto-generated method stub
		System.out.println(entity.toString());
		logger.info(entity.toString());
		repository.save(entity);
		return "Record has been added successfully";
	}
	public List<ShoppingCartEntity> getProductDetails() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}
	public Optional<ShoppingCartEntity> getProductById(int id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}
	public List<ShoppingCartEntity> getProductByName(String name) {
		// TODO Auto-generated method stub
		return repository.findByName(name);
	}
	public List<ShoppingCartEntity> getProductByNameAndcity(String name, String city) {
		// TODO Auto-generated method stub
		return repository.findByNameAndCity(name,city);
	}
	public String deleteById(int id) {
		// TODO Auto-generated method stub
		String message;
		try {
			message="Record has been deleted Successfully";
			repository.deleteById(id);
			logger.info(message);
		}catch(Exception e) {
			message="Invalid id";
			logger.error(message);
		}
		
		return message;
	}
	public String updateProduct(@RequestBody ShoppingCartEntity entity ) {
		// TODO Auto-generated method stub
		repository.save(entity);
		return "Record has been updated successfully";
	}
	

}
