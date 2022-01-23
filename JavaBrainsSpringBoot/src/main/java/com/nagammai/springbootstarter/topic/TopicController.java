package com.nagammai.springbootstarter.topic;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

	@Autowired
	private TopicService topicService;
	
	@RequestMapping("/topics")
	public List<Topic> getAllTopics(){
		return topicService.getTopics();	
	}
	//O/P  : json object
	//[{"id":"Spring","name":"Spring Framework","description":"Spring Framework Description"},{"id":"Java","name":"Core Java","description":"Java Description"},{"id":"Hibernate","name":"Hibernate Framework","description":"Hibernate Framework Description"}]
		
	@RequestMapping("/topics/{id1}") // if id1 then in Path variable must use id1 if "/topics/{id}" is used in then can use (@PathVariable String id) no need to mention explicitly 
	public Topic getTopic(@PathVariable("id1") String id) {
		return topicService.getTopic(id);
	}
	
	@RequestMapping(value = "/topics", method = RequestMethod.POST) // Spring MVC converted the json to Topic instance and passed it to Service class 
	public void addTopic(@RequestBody Topic  topic) {
		 topicService.addTopic(topic);
	}
	
	@RequestMapping(value="/topics/{id}",method = RequestMethod.PUT)
	public void updateTopic(@RequestBody Topic topic,@PathVariable String id) {
		topicService.updateTopic(topic,id);
	}
	
	@RequestMapping(value="/topics/{id}" , method =RequestMethod.DELETE)
	public void deleteTopic(@PathVariable String id) {
		topicService.deleteTopic(id);
	}
	
}





