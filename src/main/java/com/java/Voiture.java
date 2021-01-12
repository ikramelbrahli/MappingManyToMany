package com.java;

import java.util.* ;
import javax.persistence.* ;


@Entity
@Table(name="voiture")
public class Voiture {
	@Id
	@Column(name="voiture_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id ;
	private String nom ;
	private String matricule ;
	@ManyToOne
	@JoinColumn(name="marque_id")
	@ManyToMany(mappedBy = "chauffeur" , fetch= FetchType.LAZY)
	private Marque marque ;
	Set<Chauffeur> chauffeur = new HashSet<>();
	public Voiture() {
		
	}
public Voiture(String nom , String matricule , Marque marque) {
	super();
	this.nom=nom;
	this.matricule=matricule;
	this.marque=marque;
	}

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

	public String getMatricule() {
		return matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}
	
	
	

}
