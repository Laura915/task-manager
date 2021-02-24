package com.hcl.task_manager.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.hcl.task_manager.services.UserService;

@Controller 
public class UserController {
	@Autowired
	 UserService service;
	
	//Register User	
	@RequestMapping(value="/", method = RequestMethod.GET)
	public String showRegisterPage(ModelMap model){
        return "register";
    }
	
	@RequestMapping(value="/", method = RequestMethod.POST)
    public String resgisterUser(ModelMap model, @RequestParam String username, @RequestParam String email, @RequestParam String password){
		service.saveUser(username,email,password);
		model.put("username", username);
		model.put("email", email);
		model.put("password", password);
		return "display-task";
	} 
	
}
