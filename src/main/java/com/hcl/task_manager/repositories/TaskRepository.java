package com.hcl.task_manager.repositories;

import org.springframework.data.repository.CrudRepository;

import com.hcl.task_manager.entities.Task;

public interface TaskRepository extends CrudRepository<Task, Long> {

}
