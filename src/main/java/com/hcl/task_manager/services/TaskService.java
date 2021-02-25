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
	public void saveTask(Long userId ,String taskName,String description,String email,String severity) {
		Task newTask = new Task();
		
		newTask.setUserId(userId);
		newTask.setTaskName(taskName);
		newTask.setDescription(description);
		newTask.setEmail(email);
		newTask.setSeverity(severity);

		taskRepository.save(newTask);
	}
	
	
}
