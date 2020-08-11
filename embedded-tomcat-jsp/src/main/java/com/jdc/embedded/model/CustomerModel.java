package com.jdc.embedded.model;

import java.util.List;

import javax.persistence.EntityManager;

public class CustomerModel {

	private EntityManager em;

	public CustomerModel(EntityManager em) {
		super();
		this.em = em;
	}

	public List<Customer> getAll() {
		return em.createNamedQuery("Customer.getAll", Customer.class).getResultList();
	}

	public void save(Customer c) {
		em.getTransaction().begin();
		em.persist(c);
		em.getTransaction().commit();
	}
	
	
}
