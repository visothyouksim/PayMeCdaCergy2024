package com.example.PayMe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.PayMe.model.User;
import com.example.PayMe.service.UserService;

@Controller
public class UserController {

	@Autowired
	UserService userService;
	
	@GetMapping("/user")
	public String getUserProfil(Model model) {
		User user = userService.getConnectedUser();
		model.addAttribute("listContact", user.getListContacts());
		
		
		return "userProfil";
	}
	
	
	@PostMapping("/addContact")
	public String addContact(@RequestParam(value = "name") String name, Model model) {
		User user = userService.getConnectedUser();
		User userToAdd =userService.getUserByName(name);
		if(userToAdd!=null) {
			if(!user.getListContacts().contains(userToAdd) && user!=userToAdd) {
				user.getListContacts().add(userToAdd);
				userService.save(user);
			};
		}
		model.addAttribute("listContact", user.getListContacts());

		return "userProfil";
	}
	
	
	
}
