package com.jdc.hello.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Hello {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String user;
	private String message;
}
