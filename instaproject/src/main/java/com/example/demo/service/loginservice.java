package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.loginrepository;
import com.example.demo.model.loginmodel;


@Service
public class loginservice {
	@Autowired
	loginrepository rep;
	public String checkLogin1(String username , String password) {
		loginmodel user = rep.findByUsername(username);
		if(user==null) {
			return "no user found";
		}
		else {
			if(user.getPassword().equals(password)) {
				return "login succesfull";
			}else {
				return "login failed";
			}
		}
	}
}
