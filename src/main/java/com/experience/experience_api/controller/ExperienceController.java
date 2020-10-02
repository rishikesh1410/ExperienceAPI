package com.experience.experience_api.controller;

import java.util.Collections;
import java.util.List;
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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.experience.experience_api.repository.Experience;
import com.experience.experience_api.repository.ExperienceRepository;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class ExperienceController {

	@Autowired
	private ExperienceRepository expRepo;

	// TODO : Currently only one user, later authentication part will be added
	private final Integer USER_ID = 5;

	@GetMapping("/")
	public ResponseEntity<Object> getDashboard(@RequestBody(required = false) List<String> tags,
			@RequestParam(required = false) String subject) {

		List<Experience> exps = null;
		System.out.println(subject);
		if (tags == null) {
			exps = expRepo.findByUserId(USER_ID);
		} else {
			exps = expRepo.findByTags(tags, ".*" + subject + ".*");
		}
		return ResponseEntity.ok(exps);
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
