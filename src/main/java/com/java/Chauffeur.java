package com.java;

import java.util.* ;
import javax.persistence.* ;

@Entity
@Table(name= "chauffeur")

public class Chauffeur {
	private int id ;
	@Id
	@Column(name="chauffeur_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@ManyToMany(cascade= {CascadeType.ALL})
	@JoinTable(
	 name="chauffeur_voiture" ,
	 joinColumns={@JoinColumn(name="chauffeur_id")},
	 inverseJoinColumns= {@JoinColumn(name="voiture_id")}
			)
	private Set<Voiture> voiture = new HashSet();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Set<Voiture> getVoiture() {
		return voiture;
	}

	public void setVoiture(Set<Voiture> voiture) {
		this.voiture = voiture;
	}

	public Chauffeur(int id, Set<Voiture> voiture) {
		super();
		this.id = id;
		this.voiture = voiture;
	}
	
	
	

}
