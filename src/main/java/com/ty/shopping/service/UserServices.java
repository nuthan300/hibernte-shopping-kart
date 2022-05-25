package com.ty.shopping.service;

import java.util.List;

import com.ty.shopping.dao.UserDao;
import com.ty.shopping.dto.User;

public class UserServices {

	UserDao dao = new UserDao();

	public boolean saveUser(User user) {
		return dao.saveUser(user);
	}

	public User getUserById(int id) {
		return dao.getUserById(id);
	}

	public List<User> getAllUser() {
		return dao.getAllUser();
	}

	public User validateUser(String email, String password) {
		return dao.validateUser(email, password);
	}

	public boolean deleteUserById(int id) {
		return dao.deleteUserById(id);
	}
}
