package com.storage.implementation.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Redirection {

	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
	@RequestMapping("login")
	public String login() {
		return "access/login";
	}
	
}

