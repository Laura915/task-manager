package com.hcl.task_manager.repositories;

import org.springframework.data.repository.CrudRepository;

import com.hcl.task_manager.entities.User;

public interface UserRepository  extends CrudRepository<User, Long> {

}
