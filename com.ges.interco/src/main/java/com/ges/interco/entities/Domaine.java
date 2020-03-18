package com.ges.interco.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;


/**
 * Classe Domaine : Le domaine d'expertise du consultant.
 * @author Alpha
 *
 */
@Entity
public class Domaine  implements Serializable {
	
	@Id
	@GeneratedValue
	private Long id;
	private String intitule;

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getIntitule() {
		return intitule;
	}
	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}

	public Domaine() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Domaine(Long id, String intitule, Collection<Employee> consultant) {
		super();
		this.id = id;
		this.intitule = intitule;
	}
	@Override
	public String toString() {
		return "Domaine [id=" + id + ", intitule=" + intitule +"]";
	}

 

}
