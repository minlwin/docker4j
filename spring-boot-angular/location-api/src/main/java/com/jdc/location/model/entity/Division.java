package com.jdc.location.model.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import lombok.Data;

@Data
@Entity
public class Division {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
}
