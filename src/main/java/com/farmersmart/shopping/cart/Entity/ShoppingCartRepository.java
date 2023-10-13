package com.farmersmart.shopping.cart.Entity;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ShoppingCartRepository extends JpaRepository<ShoppingCartEntity, Integer>{
	public List<ShoppingCartEntity> findByName(String name);

	public List<ShoppingCartEntity> findByNameAndCity(String name, String city);

}
