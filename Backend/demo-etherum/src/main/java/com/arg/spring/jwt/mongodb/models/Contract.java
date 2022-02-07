package com.arg.spring.jwt.mongodb.models;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "bienIm")
public class Contract {
	
	@Id
	 private String titre;
	
	 private String date;
	 
	 private int price;

	private String description;
	private String local;
    @DBRef
     private User user ;
    
    @DBRef
    private Set<Acteurs> acteurs  = new HashSet<>() ;



	public Contract(String titre, String date, int price, String description, String local, User user) {
		super();
		this.titre = titre;
		this.date = date;
		this.price = price;
		this.description = description;
		this.local = local;
		this.user = user;
		
	}



	public Set<Acteurs> getActeurs() {
		return acteurs;
	}



	public void setActeurs(Set<Acteurs> acteurs) {
		this.acteurs = acteurs;
	}



	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	
    
}
