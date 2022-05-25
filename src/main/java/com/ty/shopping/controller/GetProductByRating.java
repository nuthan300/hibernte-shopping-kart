package com.ty.shopping.controller;

import java.util.List;

import com.ty.shopping.dto.Product;
import com.ty.shopping.service.ProductServices;

public class GetProductByRating {

	public static void main(String[] args) {
		ProductServices productService = new ProductServices();
		int rating = 4 ;
		List<Product> products = productService.getProductByRating(rating) ;
//		int count = 0 ;
//		int sum = 0 ;
		if ( !(products.isEmpty())) {
			for(Product product : products)
			{
				System.out.println(product);
				System.out.println("rsting is "+product.getRating());
//				sum += product.getRaiting() ;
//				count++ ;
			}
			//System.out.println("rating of the "+size+" products is : "+(sum/count));
		}else {
			
			System.out.println("no poducts found with specified Brand");
		}
		
	}
}
