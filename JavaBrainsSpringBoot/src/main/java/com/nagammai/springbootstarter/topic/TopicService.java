package com.nagammai.springbootstarter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	//instead of directly using Arrays.asList use new keyword to get mutable array list which creates the copy of the Array list else while POST request we will get UnsupportedOperationException if Arrays.asList is used directly
	private List<Topic> topics  = new ArrayList<>(Arrays.asList(
			new Topic("Spring","Spring Framework","Spring Framework Description"),
			new Topic("Java","Core Java","Java Description"),
			new Topic("Hibernate","Hibernate Framework","Hibernate Framework Description")
			));

	public List<Topic> getTopics() {
		return topics;
	}
	
	public Topic getTopic(String id) {
		return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
	}

	public void addTopic(Topic topic) {
		//Initially we get error while adding to topics because Arrays.asList gives a immutable object we cannot add or remove it so therefore change it to new ArrayList 
		topics.add(topic);
	}

	public void updateTopic(Topic topic,String id) {
		for(int i=0 ; i<topics.size(); i++) {
			Topic t = topics.get(i);
			if(t.getId().equals(id)) {
				topics.set(i, topic);
				return;
			}
		}
	}

	public void deleteTopic(String id) {
		
		topics.removeIf(t->t.getId().equals(id));
		
//		for(int i=0;i<topics.size();i++) {
//			Topic t = topics.get(i);
//			if(t.getId().equals(id)) {
//				topics.remove(i);
//			}
//		}
		
	}
}
