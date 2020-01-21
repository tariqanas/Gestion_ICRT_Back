package com.ges.interco.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;



@Entity
public class Employee  implements Serializable {
	
	@Id
	@GeneratedValue
	private Long id;
	private String firstName;
	private String lastName;
	private Long age;
	@ManyToOne
	private Client client;
	@ManyToOne
	private Domaine domaine;
	private Long anciennete;
	private String niveau;
	private String nationalité;
	private Double score;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Long getAge() {
		return age;
	}
	public void setAge(Long age) {
		this.age = age;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public Domaine getDomaine() {
		return domaine;
	}
	public void setDomaine(Domaine domaine) {
		this.domaine = domaine;
	}
	public Long getAnciennete() {
		return anciennete;
	}
	public void setAnciennete(Long anciennete) {
		this.anciennete = anciennete;
	}
	public String getNiveau() {
		return niveau;
	}
	public void setNiveau(String niveau) {
		this.niveau = niveau;
	}
	public String getNationalité() {
		return nationalité;
	}
	public void setNationalité(String nationalité) {
		this.nationalité = nationalité;
	}
	public Double getScore() {
		return score;
	}
	public void setScore(Double score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age
				+ ", client=" + client + ", domaine=" + domaine + ", anciennete=" + anciennete + ", niveau=" + niveau
				+ ", nationalité=" + nationalité + ", score=" + score + "]";
	}
	public Employee(String firstName, String lastName, Long age, Client client, Domaine domaine, Long anciennete,
			String niveau, String nationalité, Double score) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.client = client;
		this.domaine = domaine;
		this.anciennete = anciennete;
		this.niveau = niveau;
		this.nationalité = nationalité;
		this.score = score;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
