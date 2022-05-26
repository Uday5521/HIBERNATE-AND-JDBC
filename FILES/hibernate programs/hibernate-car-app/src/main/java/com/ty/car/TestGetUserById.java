package com.ty.car;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class TestGetUserById {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		User user = entityManager.find(User.class, 10);
		if(user != null) {
			System.out.println("Name is " + user.getName());
			System.out.println("Email is " + user.getEmail());
			System.out.println("Gender is " + user.getGender());
		} else {
			System.out.println("Sorry no user exists for ID");
		}
		

	}
}
