package com.ty.shopping.service;

import static com.ty.shopping.util.AppConstants.SECRET_KEY;

import java.util.List;

import com.ty.shopping.dao.ProductDao;
import com.ty.shopping.dto.Product;
import com.ty.shopping.util.AES;

public class ProductServices {

	ProductDao dao = new ProductDao();

	public boolean saveProduct(Product product) {
		product.setDiscription(AES.encrypt(product.getDiscription(), SECRET_KEY));
		return dao.saveProduct(product);
	}
	
	public boolean deleteProductById(int id) {
		return dao.deleteProductById(id);
	}

	public Product getProductById(int id) {
		return dao.getProductById(id);
	}

	public List<Product> getProductByBrand(String brand) {
		List<Product> products = dao.getProductByBrand(brand);

		if (products != null) {
			for (Product product : products) {

				String desDescription = AES.decrypt(product.getDiscription(), SECRET_KEY );
				product.setDiscription(desDescription);
			}
		}

		return products;
	}

	public List<Product> getProductByPrice(int price) {
		List<Product> products = dao.getProductByPrice(price);

		if (!(products.isEmpty())) {
			for (Product product : products) {

				String desDescription = AES.decrypt(product.getDiscription(), "description");
				product.setDiscription(desDescription);
			}
		}

		return products;
	}

	public List<Product> getProductByType(String type) {
		List<Product> products = dao.getProductByType(type);

		if (!(products.isEmpty())) {
			for (Product product : products) {

				String desDescription = AES.decrypt(product.getDiscription(), "description");
				product.setDiscription(desDescription);
			}
		}

		return products;
	}
	
	public List<Product> getProductBySize(String size) {
		List<Product> products = dao.getProductBySize(size);

		if (!(products.isEmpty())) {
			for (Product product : products) {

				String desDescription = AES.decrypt(product.getDiscription(), "description");
				product.setDiscription(desDescription);
			}
		}

		return products;
	}
	
	public List<Product> getProductByRating(int rating) {
		List<Product> products = dao.getProductByRating(rating);

		if (!(products.isEmpty())) {
			for (Product product : products) {

				String desDescription = AES.decrypt(product.getDiscription(), "description");
				product.setDiscription(desDescription);
			}
		}

		return products;
	}
}
