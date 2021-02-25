package com.hcl.task_manager.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.hcl.task_manager.entities.User;

public interface UserRepository  extends CrudRepository<User, Long> {

	Optional<User> findByUsername(String username);

}
