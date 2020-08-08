package com.jdc.locations.model.service;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;

import com.jdc.locations.model.entity.Division;
import com.jdc.locations.model.entity.Township;

public class LocationService implements Serializable {

	private static final long serialVersionUID = 1L;

	private EntityManager em;

	public LocationService(EntityManager em) {
		super();
		this.em = em;
	}
	
	public List<Division> getDevisions() {
		return em.createQuery("select d from Division d", Division.class).getResultList();
	}
	
	public List<Township> findByDivision(int id) {
		return em.createQuery("select t from Township t where t.division.id = :id", Township.class)
				.setParameter("id", id).getResultList();
	}
	
	public Division findDivisionById(int id) {
		return em.find(Division.class, id);
	}
}
