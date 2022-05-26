package com.ty.car;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class TestGetCars {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Query query = entityManager.createQuery("SELECT c FROM Car c WHERE u.brand= ?1 AND u.type= ?2");
		query.setParameter(1, "Maruthi");
		query.setParameter(2, "Hachback");

		List<Car> cars = query.getResultList();
		if(cars.size() >0) {
			
			for(Car car : cars) {
				System.out.println("Name is "+car.getName());
				System.out.println("Brand is "+car.getBrand());
				System.out.println("Cost is "+car.getCost());
				System.out.println("Type is "+car.getType());
				System.out.println("---------------------------------------------------");
			}
			
		} else {
			System.out.println("Sorry no cars found");
		}
	}
}
