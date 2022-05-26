package com.ty.shopping.controller;

import com.ty.shopping.dao.UserDao;
import com.ty.shopping.dto.User;

public class TestUserInsert {
	public static void main(String[] args) {
		
		User user = new User();
		user.setId(3);
		user.setName("Simran");
		user.setEmail("simran@mail.com");
		user.setPassword("asdf123");
		user.setMobile(55443332211l);

		UserDao dao = new UserDao();
		int res = dao.saveUser(user);
		if(res > 0) {
			System.out.println("Data inserted");
		} else {
			System.out.println("No data insereted");
		}
		
	}
}
