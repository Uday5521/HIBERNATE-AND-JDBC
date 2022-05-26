package com.ty.car;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestCarSave {
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager  = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Car car = new Car();
		car.setName("Honda Jazz");
		car.setBrand("Maruthi Honda");
		car.setType("Sedan");
		car.setCost(3345000);
		
		entityTransaction.begin();
		entityManager.persist(car);
		entityTransaction.commit();
		
	}
}
