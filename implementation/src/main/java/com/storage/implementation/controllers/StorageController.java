package com.storage.implementation.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StorageController {

	@RequestMapping("/form")
	public String add() {
		return "storage/form";
	}
}
