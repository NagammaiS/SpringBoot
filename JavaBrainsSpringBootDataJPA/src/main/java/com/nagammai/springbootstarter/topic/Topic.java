package com.nagammai.springbootstarter.topic;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity // tell JPA that this is an Entity class
public class Topic {
	
	@Id //  Primary key 
	private String id;
	private String name;
	private String description;
	
	public Topic(String id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
	}
	public Topic() {
		super();
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	
}
