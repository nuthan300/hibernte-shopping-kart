package com.ty.shopping.controller;

import com.ty.shopping.service.UserServices;

public class DeleteUserById {

	public static void main(String[] args) {
		
		UserServices service = new UserServices();
		boolean res = service.deleteUserById(1);

		if (res) {
			System.out.println("user deleted");
		} else {
			System.out.println("user not avilable with given id");
		}

	}
}
