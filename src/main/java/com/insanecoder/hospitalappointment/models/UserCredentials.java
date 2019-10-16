package com.insanecoder.hospitalappointment.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class UserCredentials {

	public UserCredentials() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	@Id
	@GeneratedValue
	@Column(name="pk_seq")
	private long id;
	
	@Column(name="email")
	private String email;
	
	@Column(name="password")
	private String password;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "UserCredentials [id=" + id + ", email=" + email + ", password=" + password + "]";
	}
	
	
}
