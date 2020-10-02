package com.experience.experience_api.repository;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import lombok.Data;

@Data
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@Document(collection = "experiences")
public class Experience {

	@Id
	private String id;
	@Field("user_id")
	private Integer userId;
	private String subject;
	private String description;
	private List<String> tags;
	private List<String> links;
}
