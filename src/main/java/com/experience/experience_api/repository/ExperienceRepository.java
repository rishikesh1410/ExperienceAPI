package com.experience.experience_api.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface ExperienceRepository extends MongoRepository<Experience, String> {

	Optional<Experience> findById(String id);

	@Query("{ 'tags' : {'$in' : ?0} , 'subject' : {'$regex' : ?1, '$options' : 'i' }, 'user_id' : ?2}")
	List<Experience> findByTagsAndSubject(List<String> tags, String regexString, Integer userId);

	@Query("{ 'subject' : {'$regex' : ?0, '$options' : 'i' }, 'user_id' : ?1}")
	List<Experience> findBySubject(String regexString, Integer userId);

}
