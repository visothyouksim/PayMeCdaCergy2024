package com.example.PayMe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.PayMe.service.VirementService;

@Controller
public class VirementController {

	@Autowired
	VirementService virementService;
	
	
	@GetMapping("/virements")
	public String getVirementsPage(Model model) {
		String userName = SecurityContextHolder.getContext().getAuthentication().getName();
		
		model.addAttribute("virements", virementService.getVirementListByUserName(userName));
		
		return "virementsPage";
	}
	
}
