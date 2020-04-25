package com.capg.springrest.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.capg.springrest.entities.Product;

@Service
public class ProductServiceImpl implements ProductService{

	public static List<Product> products=new ArrayList<>();
	  
	  static 
	  {
		  Product p1 = new Product(101,"DVD",8000);
	      Product p2 = new Product(102,"IPad",76000);
	      Product p3 = new Product(103,"IPod",1670.5);
	      
	      products.add(p1);
	      products.add(p2);
	      products.add(p3);
	  }
		
	 @Override
	 public Product addProduct(Product product)
	 {
		 products.add(product);
		 return product;
	 }
		
	 @Override
	 public Product getProduct(int id)
	 {
		 Product product=null;
		 for(Product p:products)
		 {
			 if(p.getId()==id)
			 {
				 product=p;
				 break;
			 }
		 }
		 return product;
	 }
	 
	 
	 @Override 
	 public List<Product> getAllProduct()
	 {
		 return products;
	 }
}
