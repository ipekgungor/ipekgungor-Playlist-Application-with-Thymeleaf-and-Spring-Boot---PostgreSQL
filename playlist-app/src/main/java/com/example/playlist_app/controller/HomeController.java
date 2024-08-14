package com.example.playlist_app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import ch.qos.logback.core.model.Model;

@Controller
public class HomeController {
	
	@GetMapping("/")
	public String home(Model model) { //In Spring MVC, Model is used to pass data from your controller to the view. This data is usually displayed in HTML templates (Thymeleaf, JSP, etc.).
		return "home";
	}
}