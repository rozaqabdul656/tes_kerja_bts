package com.tes_kerja.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tes_kerja.model.modelUser;

public interface repositoryUser extends JpaRepository<modelUser,String> {

}
