package com.wha.spring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Adress {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idAdess;
	private String ville;
	private String rue;
	private String cp;


}
