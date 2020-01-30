package com.tes_kerja.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tes_kerja.model.modelShopping;
import com.tes_kerja.model.modelUser;
import com.tes_kerja.repository.repositoryUser;
import com.tes_kerja.repository.repositoryshopping;


@Service
public class daouser {

	@Autowired
	private repositoryUser Ruser;
	
	public List<modelUser> getAll(){
		return Ruser.findAll();
	}
	
	public void signup(modelUser mu) {
		Ruser.save(mu);
	}
	
	public modelUser signin(String id) {
		return Ruser.findOne(id);
		
	}
	
	
	
	
}
