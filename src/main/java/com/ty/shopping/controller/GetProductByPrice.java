package com.ty.shopping.controller;

import java.util.List;

import com.ty.shopping.dto.Product;
import com.ty.shopping.service.ProductServices;

public class GetProductByPrice {
	
	public static void main(String[] args) {
		ProductServices productService = new ProductServices();
		int price = 1500 ;
		List<Product> products = productService.getProductByPrice(price) ;
		int count = 0 ;
		int sum = 0 ;
		if ( !(products.isEmpty())) {
			for(Product product : products)
			{
				System.out.println(product);
				sum += product.getRating() ;
				count++ ;
			}
			//System.out.println("rating of the "+price+" products is : "+(sum/count));
		}else {
			
			System.out.println("no poducts found with specified Brand");
		}
		
	}
}
