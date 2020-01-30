package com.tes_kerja.model;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name="user")

@EntityListeners(AuditingEntityListener.class)
public class modelUser {
	@Id
	private String username;
	private String id;
	private String passsword;
	private String email;
	private String phone;
	private String country;
	private String city;
	private String postcode;
	private String name;
	private String address;
	
	
	public modelUser() {
		
	}
	public modelUser(String id, String username, String passsword, String email, String phone, String country,
			String city, String postcode, String name, String address) {
		super();
		this.id = id;
		this.username = username;
		this.passsword = passsword;
		this.email = email;
		this.phone = phone;
		this.country = country;
		this.city = city;
		this.postcode = postcode;
		this.name = name;
		this.address = address;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPasssword() {
		return passsword;
	}
	public void setPasssword(String passsword) {
		this.passsword = passsword;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPostcode() {
		return postcode;
	}
	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
		
	
	
}
