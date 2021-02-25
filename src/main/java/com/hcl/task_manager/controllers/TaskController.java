//package com.hcl.task_manager.controllers;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.ModelMap;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
//
//import com.hcl.task_manager.services.TaskService;
//
//@Controller
//public class TaskController {
//	@Autowired
//	TaskService taskService;
//	
//	
//
//	//Save task
//	@RequestMapping(value = "/createtask", method = RequestMethod.POST)
//	public String createTasK(ModelMap model, @RequestParam String taskName, @RequestParam String description, @RequestParam String email, @RequestParam String severity) {
//		taskService.saveTask(taskName,description,email,severity);
//		return "create-task";
//	}
//
//}
