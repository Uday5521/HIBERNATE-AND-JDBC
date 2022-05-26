package com.ty.shopping.controller;

import com.ty.shopping.dao.UserDao;
import com.ty.shopping.dto.User;

public class TestAuthentication {
	public static void main(String[] args) {
		
		UserDao dao = new UserDao();
		User user = dao.validateUser("simran@mail.com", "asdf");
		if(user != null) {
			
			System.out.println("Name is "+user.getName());
			System.out.println("Phone number is "+user.getMobile());
			
		} else {
			System.out.println("Email or password is wrong");
		}
		
	}
}
