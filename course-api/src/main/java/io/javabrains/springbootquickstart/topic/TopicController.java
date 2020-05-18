package io.javabrains.springbootquickstart.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	@RequestMapping("/topics")
	public List<Topic> getAllTopics() {
		return Arrays.asList(
				new Topic("id1", "name1", "description1"),
				new Topic("id2", "name2", "description2"),
				new Topic("id3", "name3", "description3")
				);
	}

}
