package com.capg.springrest.service;

import java.util.List;

import com.capg.springrest.entities.Product;

public interface ProductService {
	public Product addProduct(Product product);
	public Product getProduct(int id);
	public List<Product> getAllProduct();

}
