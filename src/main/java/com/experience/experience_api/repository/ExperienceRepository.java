package com.experience.experience_api.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ExperienceRepository extends MongoRepository<Experience, String> {
	List<Experience> findByUserId(Integer userId);

	Optional<Experience> findById(String id);
}
