package com.nagammai.springbootstarter.topic;

import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic, String>{

	
	//no need to initialize the DB , because we have a embedded database and when we start the application DB will also start Derby 
	//these are common so Spring Data JPA provide all these common methods in CrudRepository so make this as an interface 
	//and extend the CRUDReposiroty 
	//These methods are going to be the same for courses 
	//getAllTopics   --> working
	//getTopic(String id)  ---> working 
	//addTopic  --> working 
	//updateTopic(Topic t) --> not working 
	//deleteTopic(String id) ---> working 
	
}
