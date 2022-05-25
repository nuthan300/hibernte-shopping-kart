package com.ty.shopping.controller;

import com.ty.shopping.dto.User;
import com.ty.shopping.service.UserServices;

public class SaveUserFactory {

	public static void main(String[] args) {
		
		UserServices services = new UserServices();
//		User user = new User();
//		user.setName("Balaji");
//		user.setEmail("Bals@mail.com");
//		user.setPassword("donthavebals");
//		user.setPhone(9685741230l);
//		
//		if(services.saveUser(user)) {
//			System.out.println("User Added Successfully");
//		}else {
//			System.out.println("User Not Added.. ");
//		}
		
//		User user= services.validateUser("Bals@mail.com", "donthavebals");
		User user = services.getUserById(1);
		if(user == null) {
			System.out.println("User Not Found..");
		}else {
			System.out.println(user);
		}
	}
}
