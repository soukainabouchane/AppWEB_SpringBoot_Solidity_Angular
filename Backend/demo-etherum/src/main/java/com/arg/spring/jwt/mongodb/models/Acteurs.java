package com.arg.spring.jwt.mongodb.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "acteurs")
public class Acteurs {
     
	@Id
	 private String address;
	 private String nom;
	 private String type;
	 
	public Acteurs(String address, String nom, String type) {
		super();
		this.address = address;
		this.nom = nom;
		this.type = type;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	 
	
}
