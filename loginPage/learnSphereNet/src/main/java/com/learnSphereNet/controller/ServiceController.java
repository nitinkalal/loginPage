package com.learnSphereNet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.learnSphereNet.entity.Users;
import com.learnSphereNet.service.UserService;

@Controller
public class ServiceController 
{
	/*our saving method will be present in the services so 
	creating a reference services*/
	
	@Autowired
	UserService uService;
	
/*	@PostMapping is use for adding a new data*/
	
	@PostMapping("/addUser")
	
	//logic of adding data(new user)
	
	public String addUser(@RequestParam("name")String name,
			@RequestParam("email")String email,
			@RequestParam("password")String password,
			@RequestParam("role")String role) {
		
		//check for email already exist or not
		boolean emailExists=uService.checkEmail(email);
		if(emailExists==false)
		{
		//creating a object of Users(entity) class
		Users user = new Users();
		
		//setting the values (id will be auto generated)
		user.setName(name);
		user.setEmail(email);
		user.setPassord(password);
		user.setRole(role);
		
		uService.addUser(user);
		
		System.err.println("User register successfully!");
		return"redirect:/login";
		}
		else
		{
			System.err.println("User already exists!");
			return"redirect:/";
		}
	}
}
