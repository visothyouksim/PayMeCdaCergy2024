package com.example.PayMe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TransactionController {

	@GetMapping("/transactions")
	public String getTransactionsPage() {
		return "transactionsPage";
	}
}
