package com.ty.shopping.controller;

import java.util.List;

import com.ty.shopping.dto.Product;
import com.ty.shopping.service.ProductServices;

public class GetProductBySize {

	public static void main(String[] args) {
		ProductServices productService = new ProductServices();
		String size = "xl" ;
		List<Product> products = productService.getProductBySize(size) ;
		int count = 0 ;
		int sum = 0 ;
		if ( !(products.isEmpty())) {
			for(Product product : products)
			{
				System.out.println(product);
				sum += product.getRating() ;
				count++ ;
			}
			System.out.println("rating of the "+size+" products is : "+(sum/count));
		}else {
			
			System.out.println("no poducts found with specified Brand");
		}
		
	}
}
