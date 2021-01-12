package com.java;

import java.util.* ;
import javax.persistence.* ;

@Entity
@Table(name="marque")

public class Marque {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id ;
	private String nom ;
	@OneToMany(mappedBy = "marque" , cascade=CascadeType.ALL)
	private Set<Voiture> vs = new HashSet<>();
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Set<Voiture> getVs() {
		return vs;
	}
	public void setVs(Set<Voiture> vs) {
		this.vs = vs;
	}
	public Marque(String nom) {
		super();
		this.id = id;
		this.nom = nom;
		this.vs = vs;
	}
	
	
	

}
