package com.farmersmart.shopping.cart.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="ShoppingCart")
public class ShoppingCartEntity {
	@Id
	int id;
	String name;
	String product_name;
	String city;
	Long phone_number;
	public ShoppingCartEntity() {
		super();
	}
	public ShoppingCartEntity(int id, String name, String product_name, String city, Long phone_number) {
		super();
		this.id = id;
		this.name = name;
		this.product_name = product_name;
		this.city = city;
		this.phone_number = phone_number;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Long getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(Long phone_number) {
		this.phone_number = phone_number;
	}
	@Override
	public String toString() {
		return "ShoppingCartEntity [id=" + id + ", name=" + name + ", product_name=" + product_name + ", city=" + city
				+ ", phone_number=" + phone_number + "]";
	}
	
	

}
