package com.learnSphereNet.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

//this class is for column of database 
@Entity
public class Users {
      @Id
      //giving a automatic(default) id to user
      @GeneratedValue(strategy=GenerationType.AUTO)
      int id;
      String name;
      String email;
      String passord;
      String role;
      //above values are receivied from front end part 
	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Users(int id, String name, String email, String passord, String role) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.passord = passord;
		this.role = role;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassord() {
		return passord;
	}
	public void setPassord(String passord) {
		this.passord = passord;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "Users [id=" + id + ", name=" + name + ", email=" + email + ", passord=" + passord + ", role=" + role
				+ "]";
	}
      
}
