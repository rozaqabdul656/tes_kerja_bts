package com.tes_kerja.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tes_kerja.model.modelShopping;
import com.tes_kerja.repository.repositoryshopping;

@Service
public class daoshopping {

	@Autowired
	private repositoryshopping rs;
	

	public List<modelShopping> getAllShopp(){
		return rs.findAll();
	}
	
	public void add(modelShopping ms){
		rs.save(ms);
		
		
	}
	public modelShopping getid(String ms){
		return rs.findOne(ms);
	}
	
	public void delete(String ms){
		 rs.delete(ms);
	}
	
}
