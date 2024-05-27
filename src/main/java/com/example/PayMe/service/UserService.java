package com.example.PayMe.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.PayMe.model.User;
import com.example.PayMe.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;
	
	public User getUserByName(String userName) {
		return userRepository.getUserByName(userName);
	}

	public void save(User user) {
		userRepository.save(user);
		
	}

}
