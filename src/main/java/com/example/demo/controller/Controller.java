package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo/api")
public class Controller {
	@GetMapping("/welcome")
	public String welcome() {
		return "welcome to demo";
	}
	
	@GetMapping("/greeting")
	public String greeting() {
		return "greeting to demo";
	}
}
