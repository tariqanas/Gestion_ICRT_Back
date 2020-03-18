package com.ges.interco.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;


/**
 * Classe Client : Le client du consultant.
 * @author Alpha
 *
 */
@Entity
public class Client implements Serializable {
	
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private String das;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDas() {
		return das;
	}
	public void setDas(String das) {
		this.das = das;
	}
	public Client(String name, Collection<Employee> consultants, String das) {
		super();
		this.name = name;
		this.das = das;
	}
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}


	
	
}
