package io.javabrains.springboot.Topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	@RequestMapping("/topics")
	public String getAllTopics(){
		return "All Topics";
	}
	
	/*@RequestMapping("/topics")
	public List<Topic> getAllTopics(){
		return Arrays.asList(
				new Topic ("1", "Name1", "Desc1"),
				new Topic ("2", "Name2", "Desc2"),
				new Topic ("3", "Name3", "Desc3")
				);
	}*/

}

//http://localhost:8080/topics
