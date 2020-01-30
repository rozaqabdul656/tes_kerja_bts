package com.tes_kerja.model;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name="shopping")

@EntityListeners(AuditingEntityListener.class)
public class modelShopping {
	@Id
	private String id;
	private String name;
	private String CreatedDate;
	
	public modelShopping() {
		
	}
	public modelShopping(String id, String name, String createdDate) {
		super();
		this.id = id;
		this.name = name;
		CreatedDate = createdDate;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCreatedDate() {
		return CreatedDate;
	}
	public void setCreatedDate(String createdDate) {
		CreatedDate = createdDate;
	}
	
	
}
