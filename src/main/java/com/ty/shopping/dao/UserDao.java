package com.ty.shopping.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.shopping.dto.User;

public class UserDao {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager = entityManagerFactory.createEntityManager();

	public boolean saveUser(User user) {
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();

		try {
			entityManager.persist(user);
		} catch (Exception e) {
			return false;
		}
		entityTransaction.commit();
		return true;
	}

	public User getUserById(int id) {

		return entityManager.find(User.class, id);
	}

	@SuppressWarnings("unchecked")
	public List<User> getAllUser() {

		String sql = "SELECT u FROM User u";
		return entityManager.createQuery(sql).getResultList();
	}

	public User validateUser(String email, String password) {
		String sql = "SELECT u FROM User u WHERE u.email = ?1 AND u.password = ?2";
		Query query = entityManager.createQuery(sql);
		query.setParameter(1, email);
		query.setParameter(2, password);
		return (User) query.getSingleResult();
	}

	public boolean deleteUserById(int id) {
		String sql = "delete from User u where u.id = " + id;
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();

		try {
			entityManager.persist(sql);
		} catch (Exception e) {
			return false;
		}
		entityTransaction.commit();
		return true;
	}
}
