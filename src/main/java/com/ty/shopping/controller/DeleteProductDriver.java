package com.ty.shopping.controller;

import com.ty.shopping.service.ProductServices;

public class DeleteProductDriver {
	
	public static void main(String[] args) {
		ProductServices productService = new ProductServices() ;
		
		if(productService.deleteProductById(2))
		{
			System.out.println("product is deleted successfully");
		}else {
			System.out.println("there is no id whith specified id to delete");
		}
	}
}
