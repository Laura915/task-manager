package com.hcl.task_manager.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.hcl.task_manager.entities.User;
import com.hcl.task_manager.services.TaskService;
import com.hcl.task_manager.services.UserService;



@Controller
public class UserController {
	@Autowired
	UserService service;

	@Autowired
	TaskService taskService;
	
	public static Long userId;

	//Register User
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String showRegisterPage(ModelMap model) {
		return "register";
	}

	@RequestMapping(value = "/", method = RequestMethod.POST)
	public String resgisterUser(ModelMap model, @RequestParam String username, @RequestParam String email, @RequestParam String password) {
		service.saveUser(username, email, password);
		model.put("username", username);
		model.put("email", email);
		model.put("password", password);
		//findByUserName
		Optional<User> usercheck = null;
		usercheck = service.findByUserName(username);
		userId = usercheck.get().getId();
		return "create-task";
	}

	// Login User
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String showLoginPage(ModelMap model) {
		return "login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String loginUser(ModelMap model, @RequestParam String username, @RequestParam String password) {		
		if (service.searchUser(username,password)) {
			model.put("username", username);
			model.put("password", password);
			//findByUserName
			Optional<User> usercheck = null;
			usercheck = service.findByUserName(username);
			userId = usercheck.get().getId();
					
			return "display-task";
		}return null;
	}
	
	
	//Save task
		@RequestMapping(value = "/createtask", method = RequestMethod.POST)
		public String createTasK(ModelMap model, @RequestParam String taskName, @RequestParam String description, @RequestParam String email, @RequestParam String severity) {
			taskService.saveTask(userId,taskName,description,email,severity);
			return "create-task";
		}

}
