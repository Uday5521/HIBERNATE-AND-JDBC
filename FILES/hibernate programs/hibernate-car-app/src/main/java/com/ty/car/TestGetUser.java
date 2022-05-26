package com.ty.car;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class TestGetUser {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Query query = entityManager.createQuery("SELECT u FROM User u WHERE u.email= ?1 AND u.password= ?2");
		query.setParameter(1, "dim@email.com");
		query.setParameter(2, "ghjk");

		List<User> users = query.getResultList();
		if (users.size() > 0) {
			
			User user = users.get(0);
			System.out.println("Name is " + user.getName());
			System.out.println("Email is " + user.getEmail());
			System.out.println("Gender is " + user.getGender());
			

		} else {
			System.out.println("Invalid user name or password");
		}
	}
}
