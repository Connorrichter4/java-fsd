package com.example.TaskManager.repositories;

import com.example.TaskManager.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository  extends CrudRepository<User, Integer> {

}
