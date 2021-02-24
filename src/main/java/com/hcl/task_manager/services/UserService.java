package com.hcl.task_manager.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.task_manager.entities.User;
import com.hcl.task_manager.repositories.UserRepository;

@Service
public class UserService {
	 @Autowired
	    private UserRepository userRepository; 
	 
	 public void saveUser(String username, String email, String password) {
			User newUser = new User();
			newUser.setUsername(username);
			newUser.setEmail(email);
			newUser.setPassword(password);

			userRepository.save(newUser);
		}
	 
	

}
