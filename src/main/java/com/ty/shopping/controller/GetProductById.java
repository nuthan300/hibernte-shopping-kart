package com.ty.shopping.controller;

import com.ty.shopping.dto.Product;
import com.ty.shopping.service.ProductServices;

public class GetProductById {

	public static void main(String[] args) {
		ProductServices productService = new ProductServices();
		Product product = productService.getProductById(1) ;
		if ( product != null) {
			System.out.println(product);
		}else {
			System.out.println("no poduct found with specified ID");
		}
	}
}
