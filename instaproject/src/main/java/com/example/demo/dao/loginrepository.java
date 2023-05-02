package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.loginmodel;

@Repository
public interface loginrepository extends JpaRepository<loginmodel, Integer> {
	loginmodel findByUsername(String username);

}
