package com.jdc.location.model.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jdc.location.model.entity.Township;

public interface TownshipRepo extends JpaRepository<Township, Integer>{

	List<Township> findByDivisionId(int id);

}
