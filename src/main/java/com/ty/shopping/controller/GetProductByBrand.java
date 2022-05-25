package com.ty.shopping.controller;

import java.util.List;

import com.ty.shopping.dto.Product;
import com.ty.shopping.service.ProductServices;

public class GetProductByBrand {

	public static void main(String[] args) {
		ProductServices productService = new ProductServices();
		String brand = "alensolly" ;
		List<Product> products = productService.getProductByBrand(brand) ;
		int count = 0 ;
		int sum = 0 ;
		if ( !(products.isEmpty())) {
			for(Product product : products)
			{
				System.out.println(product);
				sum += product.getRating() ;
				count++ ;
			}
			System.out.println("rating of the "+brand+" products is : "+(sum/count));
		}else {
			
			System.out.println("no poducts found with specified Brand");
		}
		
	}
}
