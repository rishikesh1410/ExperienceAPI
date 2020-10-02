package com.experience.experience_api.controller;

import java.util.Collections;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.experience.experience_api.repository.Experience;
import com.experience.experience_api.repository.ExperienceRepository;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class ExperienceController {

	@Autowired
	private ExperienceRepository expRepo;

	@GetMapping("/")
	public String startingPoint() {
		return "Coming soon";
	}

	@GetMapping("/getExp/{id}")
	public ResponseEntity<Object> getExperience(@PathVariable String id) {
		Optional<Experience> exp = expRepo.findById(id);
		if (exp != null) {
			return ResponseEntity.ok(exp);
		}
		return ResponseEntity.notFound().build();
	}

	@PostMapping("/addExp")
	public ResponseEntity<Object> addExperience(@RequestBody Experience exp) {
		if (exp.getId() != null) {
			return ResponseEntity.badRequest().body("Object should not have Id");
		}
		return ResponseEntity.ok(expRepo.save(exp));
	}

	@PutMapping("/updateExp/{id}")
	public ResponseEntity<Object> updateExperience(@RequestBody Experience exp, @PathVariable String id) {
		if (exp.getId() != null) {
			return ResponseEntity.badRequest().body("Object should not have Id");
		}
		exp.setId(id);
		return ResponseEntity.ok(expRepo.save(exp));
	}

	@DeleteMapping("/deleteExp/{id}")
	public ResponseEntity<Object> deleteExperience(@PathVariable String id) {
		expRepo.deleteById(id);
		return ResponseEntity.ok(Collections.singletonMap("id", id));
	}
}
