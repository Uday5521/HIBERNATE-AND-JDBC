package com.ty.school;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class TestSaveVisitor {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory  = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction  = entityManager.getTransaction();
		
		Visitor visitor = new Visitor();
		visitor.setId(1);
		visitor.setName("Dimple");
		visitor.setEmail("dimp@mail.com");
		visitor.setGender("female");
		visitor.setDob(LocalDate.of(1995, 11, 22));
		visitor.setVisitDateTime(LocalDateTime.now());
		
		entityTransaction.begin();
		
		entityManager.persist(visitor);
		
		entityTransaction.commit();
		
		System.out.println("----------------------Done-------------------");
	}
}
