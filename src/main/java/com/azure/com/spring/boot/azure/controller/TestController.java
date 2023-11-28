package com.azure.com.spring.boot.azure.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@GetMapping("/message")
	public String getMessage() {
		return "Welcome to the Azure Hello World";
	}

}
