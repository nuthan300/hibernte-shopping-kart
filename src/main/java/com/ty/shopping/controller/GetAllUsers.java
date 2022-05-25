package com.ty.shopping.controller;

import java.util.List;

import com.ty.shopping.dto.User;
import com.ty.shopping.service.UserServices;

public class GetAllUsers {

	public static void main(String[] args) {
		UserServices service = new UserServices();

		List<User> users = service.getAllUser();
		if (!(users.isEmpty())) {
			for (User user : users) {
				System.out.println(user);
			}
		}else {
			System.out.println("users not found");
		}

	}
}
