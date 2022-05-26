package com.ty.onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestGetPerson {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Person person = entityManager.find(Person.class, 2);
		System.out.println("Person name "+person.getName());
		System.out.println("Person email "+person.getEmail());
		
		Pan pan = person.getPan();
		System.out.println("Pan address "+pan.getAddress());
		System.out.println("Pan number "+pan.getPanNumber());
	}
}
