package com.jdc.words.model;

import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface BaseRepository<T, ID> extends JpaRepository<T, ID> {

	T findOne(String jpql, Map<String, Object> params);
	List<T> search(String jpql, Map<String, Object> params);
	Long count(String jpql, Map<String, Object> params);
	
	<D> D findOne(String jpql, Map<String, Object> params, Class<D> type);
	<D> List<D> search(String jpql, Map<String, Object> params, Class<D> type);
	
}
