package com.hcl.task_manager.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.task_manager.entities.Task;
import com.hcl.task_manager.repositories.TaskRepository;

@Service
public class TaskService {
	@Autowired
    private TaskRepository taskRepository; 
	
    //save task
	public void saveTask(String taskName,String description,String email,String severity) {
		Task newTask = new Task();
		
		newTask.setTaskName(taskName);
//		newTask.setStartDate(startDate);
//		newTask.setEndDate(endDate);
		newTask.setDescription(description);
		newTask.setEmail(email);
		newTask.setSeverity(severity);

		taskRepository.save(newTask);
	}
	
	
}
