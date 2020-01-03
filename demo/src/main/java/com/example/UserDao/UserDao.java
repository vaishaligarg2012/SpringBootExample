package com.example.UserDao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.model.Users;
 

public interface UserDao extends JpaRepository<Users, Integer>{
              
	           public Users createUser(Users user);
	          // public Users getAllUsers();
	           public boolean getUserById(int id); 
	           public boolean deleteUserById(int id);
	  
}
