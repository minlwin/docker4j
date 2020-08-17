package com.jdc.words.model.entity;

import java.io.Serializable;
import java.util.Map;

import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.MapKeyColumn;

import lombok.Data;

@Data
@Entity
public class Question implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@ManyToOne
	private Level level;
	private String question;
	
	@ElementCollection
	@CollectionTable(name = "ANSWERS")
	@MapKeyColumn(name = "ans_id")
	private Map<Character, String> answeers;
	private Character correctAnswer;
}
