package com.example.PayMe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

	@GetMapping("/user")
	public String getUserProfil() {
		return "userProfil";
	}
	
	
}
