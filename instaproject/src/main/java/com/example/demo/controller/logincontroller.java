package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.loginservice;
import com.example.demo.model.loginmodel;

@RestController
public class logincontroller {
	@Autowired
	loginservice serv;
	@PostMapping("/checklogin")
	public String login(@RequestBody loginmodel u) {
		System.out.println(u.getUsername());
		return serv.checkLogin1(u.getUsername(), u.getPassword());
	}
}
