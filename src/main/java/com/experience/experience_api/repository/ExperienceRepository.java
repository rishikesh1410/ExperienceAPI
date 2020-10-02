package com.experience.experience_api.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface ExperienceRepository extends MongoRepository<Experience, String> {
	List<Experience> findByUserId(Integer userId);

	Optional<Experience> findById(String id);

	@Query("{ 'tags' : {'$in' : ?0} , 'subject' : {'$regex' : ?1, '$options' : 'i' }}")
	List<Experience> findByTags(List<String> tags, String regexString);
}
