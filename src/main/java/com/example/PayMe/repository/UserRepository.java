package com.example.PayMe.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.PayMe.model.User;

public interface UserRepository extends CrudRepository<User, Long>{

	User getUserByName(String name);

}
