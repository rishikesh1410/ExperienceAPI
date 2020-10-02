package com.experience.experience_api.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class ExperienceController {

	@GetMapping("/")
	public String startingPoint() {
		return "Coming soon";
	}
}
