package com.ty.shopping.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.shopping.dto.Product;

public class ProductDao {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager = entityManagerFactory.createEntityManager();

	public boolean saveProduct(Product product) {

		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		try {
			entityManager.persist(product);

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		entityTransaction.commit();
		return true;
	}

	public boolean deleteProductById(int id) {
		Product product = entityManager.find(Product.class, id);
		EntityTransaction entityTransaction = entityManager.getTransaction();
		if (product != null) {
			entityTransaction.begin();
			entityManager.remove(product);
			entityTransaction.commit();
			return true;
		} else {
			return false;
		}

	}

	public Product getProductById(int id) {
		return entityManager.find(Product.class, id);
	}

	public List<Product> getProductByBrand(String brand) {

		String sql = "select p from Product p where brand = ?1";
		Query query = entityManager.createQuery(sql);
		query.setParameter(1, brand);

		return query.getResultList();

	}

	public List<Product> getProductByPrice(int price) {

		String sql = "select p from Product p where price = ?1";
		Query query = entityManager.createQuery(sql);
		query.setParameter(1, price);

		return query.getResultList();

	}

	public List<Product> getProductByType(String type) {

		String sql = "select p from Product p where type = ?1";
		Query query = entityManager.createQuery(sql);
		query.setParameter(1, type);

		return query.getResultList();

	}

	public List<Product> getProductBySize(String size) {

		String sql = "select p from Product p where size = ?1";
		Query query = entityManager.createQuery(sql);
		query.setParameter(1, size);

		return query.getResultList();

	}

	public List<Product> getProductByRating(int rating) {

		String sql = "select p from Product p where raiting = ?1";
		Query query = entityManager.createQuery(sql);
		query.setParameter(1, rating);

		return query.getResultList();

	}

	public List<Product> getAllProducte() {

		String sql = "select p from Product p ";
		Query query = entityManager.createQuery(sql);

		return query.getResultList();

	}

	public void rateProduct(int id, double rating) {

		EntityTransaction entityTransaction = entityManager.getTransaction();
		Product product = entityManager.find(Product.class, id);
		double totaltrating = (product.getRating() * product.getNou());
		int nou = product.getNou() + 1;
		double currentRating = (totaltrating + rating) / nou;

		product.setRating(currentRating);
		product.setNou(nou);

		entityTransaction.begin();
		entityManager.merge(product);
		entityTransaction.commit();

	}
}
