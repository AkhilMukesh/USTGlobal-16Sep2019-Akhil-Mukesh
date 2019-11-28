package com.ustglobal.mavenprojectfirst;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ustglobsl.jpawithhibernateapp.dto.CompanyInfo;

public class ReadDemo {
	public static void main(String[] args) {
		
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		CompanyInfo companyInfo = entityManager.find(CompanyInfo.class, 1);
		
		System.out.println("Id is: "+companyInfo.getId());
		System.out.println("Name is: "+companyInfo.getCname());
		System.out.println("Id is: "+companyInfo.getClocation());

		
		entityManager.close();
		
	}
}
