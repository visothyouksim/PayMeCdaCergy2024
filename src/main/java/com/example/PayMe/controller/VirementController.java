package com.example.PayMe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VirementController {

	
	@GetMapping("/virements")
	public String getVirementsPage() {
		return "virementsPage";
	}
	
}
