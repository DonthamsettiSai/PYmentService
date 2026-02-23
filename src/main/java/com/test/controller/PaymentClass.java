package com.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pay")
public class PaymentClass {
	
	@GetMapping("/getPayment")
	public String getPayment() {
		System.out.println("Entered in PaymentClass Started ");
		String str = "payment done sucessfully :: ";
		System.out.println("Ended in PaymentClass Ended ");		
		return str;
	}

}
