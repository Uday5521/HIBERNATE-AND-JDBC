package com.ty.manytoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestGetOrder {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Item item = entityManager.find(Item.class, 1);
		System.out.println(item);
		
		
		AmazonOrder am = item.getAmazonOrder();
		System.out.println(am);
	}
}
