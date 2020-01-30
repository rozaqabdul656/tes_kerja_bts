package com.tes_kerja.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.tes_kerja.dao.*;
import com.tes_kerja.model.modelShopping;
import com.tes_kerja.model.modelUser;


@RestController
@RequestMapping("/api")

public class UserController {
	@Autowired
	daouser daouser;
	daoshopping daous;
	
	
	@GetMapping("/users")
	public List<modelUser> getAll(){
		return daouser.getAll();
	}
	
	@PostMapping("/users/signup")
	public void daftar(@RequestBody modelUser mu ){
		daouser.signup(mu);
	}
	
	@PostMapping("/users/signin")
	public ResponseEntity<modelUser> masuk(@RequestBody modelUser mu) {
		modelUser tb=daouser.signin(mu.getId());
		
		
		if(tb==null) {
			return ResponseEntity.notFound().build();
		}else {
			
			return ResponseEntity.ok().body(tb);
		}
	}
	@GetMapping("/shopping")
	public List<modelShopping> getAllshopping(){
		return daous.getAllShopp();
	}
	@GetMapping(value="/shopping/{id}")
	public modelShopping getnim(@PathVariable String id){
		return daous.getid(id);
	}
	
	@PostMapping("/shopping")
	public void addshopping(@RequestBody modelShopping ms){
		daous.add(ms);
	}
	
	@DeleteMapping("/shopping/{id}")
	public void delete(@PathVariable String id) {
		daous.delete(id);
	}
	
	
	
	
}
