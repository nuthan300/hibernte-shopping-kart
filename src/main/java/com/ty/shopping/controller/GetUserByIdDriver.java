package com.ty.shopping.controller;

import com.ty.shopping.dto.User;
import com.ty.shopping.service.UserServices;

public class GetUserByIdDriver {

	public static void main(String[] args) {
		
		UserServices service = new UserServices() ;
		User user = service.getUserById(1) ;
		
		if(user != null)
		{
			System.out.println(user);
		}else {
			System.out.println("user does not exist with given id");
		}
	}
}