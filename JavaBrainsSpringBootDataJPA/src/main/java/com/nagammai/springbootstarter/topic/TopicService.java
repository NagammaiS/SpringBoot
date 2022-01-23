package com.nagammai.springbootstarter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {

	@Autowired
	private TopicRepository topicRepository;
	
	//instead of directly using Arrays.asList use new keyword to get mutable array list which creates the copy of the Array list else while POST request we will get UnsupportedOperationException if Arrays.asList is used directly

	public List<Topic> getTopics() {
		
		List<Topic> topics = new ArrayList<>()	;
		topicRepository.findAll().forEach(topics::add);
		return topics;
	}
	
	public Optional<Topic> getTopic(String id) {
		return topicRepository.findById(id);
	}

	public void addTopic(Topic topic) {
		topicRepository.save(topic);
	}

	public void updateTopic(Topic topic,String id) {
		//add and update can be same as while updating if it finds the same row it will not update 
		//update is not working properly creating new instance
		topicRepository.save(topic);
	}

	public void deleteTopic(String id) {
		topicRepository.deleteById(id);
		//topics.removeIf(t->t.getId().equals(id));
		
//		for(int i=0;i<topics.size();i++) {
//			Topic t = topics.get(i);
//			if(t.getId().equals(id)) {
//				topics.remove(i);
//			}
//		}
		
	}
}
