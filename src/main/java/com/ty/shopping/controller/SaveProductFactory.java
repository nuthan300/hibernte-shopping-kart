package com.ty.shopping.controller;

import com.ty.shopping.dto.Product;
import com.ty.shopping.service.ProductServices;

public class SaveProductFactory {

	public static void main(String[] args) {

		ProductServices productServices = new ProductServices();
		Product product = new Product();
		product.setName("Shirt");
		product.setBrand("Peter England");
		product.setSize(42);
		product.setPrice(1500);
		product.setType(null);
		product.setDiscription("Its Nylon type.");

		if(productServices.saveProduct(product))
			System.out.println("Product Inserted..");
		else
			System.out.println("Not Inserted..");
	}
}