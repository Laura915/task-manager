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
	 public boolean searchUser(String username,String password) {
			Iterable<User> users = userRepository.findAll();
			
			for (User user : users) {
				if(user.getUsername().toLowerCase().equals(username.toLowerCase()) && user.getPassword().toLowerCase().equals(password.toLowerCase())) {
					
					return true;
				}
			}
			return false;
	 }
	 
	

}
