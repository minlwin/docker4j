package com.jdc.words.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Member {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(nullable = false, unique = true)
	private String loginId;
	@Column(nullable = false)
	private String password;
	private String name;
	private Role role;
	private boolean enable;
	
	public enum Role {
		Admin, Member
	}
}
