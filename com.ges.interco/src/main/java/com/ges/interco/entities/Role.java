package com.ges.interco.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Role implements Serializable {
	
	@Id
	private Long id;
	private String role;
	
	@ManyToOne
	@JoinColumn(name="user_id" , nullable=false)
	@JsonBackReference
	private User user;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	
	public Role(Long id, String role) {
		this.id = id;
		this.role = role;
	}
	public Role() {
		// TODO Auto-generated constructor stub
	}



	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	
	
	
	

}
