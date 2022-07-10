package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping("/register")
public class RegisterUserController {
	
	
	@GetMapping("/")
	public String display( Model model) {
		
		// Display login form view
		model.addAttribute("title", "Register Form");
		model.addAttribute("message", "Hello");
	
		return "register";
	}
}
