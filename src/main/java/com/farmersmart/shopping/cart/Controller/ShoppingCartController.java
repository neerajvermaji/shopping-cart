package com.farmersmart.shopping.cart.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.farmersmart.shopping.cart.Entity.ShoppingCartEntity;
import com.farmersmart.shopping.cart.Service.ShoppingCartService;

@RestController
public class ShoppingCartController {
	@Autowired
	ShoppingCartService service;
	
	@PostMapping("/addProduct")
	public String addProduct(@RequestBody ShoppingCartEntity entity) {
		return service.addProduct(entity);
	}
	@GetMapping("/getProductDetails")
	public List<ShoppingCartEntity>getProductDetails(){
		return service.getProductDetails();
	}
	@GetMapping("/getProductById")
	public Optional<ShoppingCartEntity>getProductById(@RequestParam int id){
		return service.getProductById(id);
	}
	@GetMapping("/getProductByName")
	public List<ShoppingCartEntity> getProductByName(@RequestParam String name) {
		return service.getProductByName(name);
	}
	@GetMapping("/getProductByNameAndcity")
	public List<ShoppingCartEntity> getProductByNameAndcity(@RequestParam String name,@RequestParam String city){
		return service.getProductByNameAndcity(name,city);
	}
	@DeleteMapping("/deleteById")
	public String deleteById(@RequestParam int id) {
		return service.deleteById(id);
	}
	@PutMapping("/updateProduct")
	public String updateProduct(@RequestBody ShoppingCartEntity entity){
		return service.updateProduct(entity);
	}

}
