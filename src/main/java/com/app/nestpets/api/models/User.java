package com.app.nestpets.api.models;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "user")
public class User implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	private String id;
	private String nome;
	private String email;
	
	private Pet pet;
	
	public User() {
		
	}
	
	public User( String id, String nome, String email, Pet pet) {
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.pet = pet;
	}
	
}
