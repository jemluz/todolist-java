package com.jemima.todolist.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Getter
@Setter
public class TaskEntity {
	@Id
	private String id;
	private String description;
	private boolean isComplete;
}

