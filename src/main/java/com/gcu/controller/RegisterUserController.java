package com.gcu.controller;


import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gcu.model.RegisterModel;


@Controller
@RequestMapping("/register")
public class RegisterUserController {
	
	
	@GetMapping("/")
	public String display( Model model) {
		
		// Display login form view
		model.addAttribute("message", "Register Form");
		model.addAttribute("registerModel", new RegisterModel());
	
		return "register";
	}
	
	@PostMapping("/doRegister")
	public String doLogin(@Valid RegisterModel registerModel, BindingResult bindingresult, Model model) {
		
		if(bindingresult.hasErrors()) {
			model.addAttribute("title", "Register Form");
			return "register";
		}
		model.addAttribute("title", "Register");
		model.addAttribute("orders", "You have successfully registered");
		
		return "register";
	}
	
}
