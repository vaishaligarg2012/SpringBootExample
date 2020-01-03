package com.example.Controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.example.UserDaoImpl.UserDaoImpl;
import com.example.model.Users;

@RestController
public class UserController {

	  @Autowired
	 private UserDaoImpl userDaoImpl;
	  
	 
	  @PostMapping("/adduser")
	  public Users  addUser(@Valid @RequestBody Users user) {
		  System.out.println("I am here"+user.getName());
		   
	      return   this.userDaoImpl.save(user);
	  }
}
