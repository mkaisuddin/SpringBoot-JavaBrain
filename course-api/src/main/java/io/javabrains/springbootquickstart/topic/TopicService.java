package io.javabrains.springbootquickstart.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	/*Arrays.asList is mutable hance its not allow to add anything for POST.
	 * hence we added ArrayList
	private  List<Topic> topics = Arrays.asList(*/
	private  List<Topic> topics = new ArrayList<>(Arrays.asList(
			new Topic("id1", "name1", "description1"),
			new Topic("id2", "name2", "description2"),
			new Topic("id3", "name3", "description3"),
			new Topic("id4", "name4", "description4")
			));
	
	public List<Topic> getAllTopics() {
		return topics;
	}
	
	public Topic getTopic(String id) {
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}

	public void addTopic(Topic topic) {
		topics.add(topic);
	}

	public void updateTopic(Topic topic, String id) {
		for(int i=0; i<topics.size(); i++) {
			Topic t = topics.get(i);
			if (t.getId().equals(id)) {
				topics.set(i, topic);
				return;
			}
		}
	}

	public void deleteTopic(String id) {
		/*for(int i=0; i<topics.size(); i++) {
			Topic t = topics.get(i);
			if (t.getId().equals(id)) {
				topics.remove(i);
				return;
			}
		}*/
		topics.removeIf(t -> t.getId().equals(id));
	}
	
}
