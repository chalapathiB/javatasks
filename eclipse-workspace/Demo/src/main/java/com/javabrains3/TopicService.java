package com.javabrains3;
import java.util.Arrays;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService
{
	
	
	private List<Topic> topics= Arrays.asList(
						
						new Topic(1,"Spring","SpringDescription"),
						new Topic(2,"Java","JavasDescription"),
						new Topic(3,"Mysql","MySqlDescription")
						);
	public List<Topic> getAllTopics()
	{
		return topics;
	}
}
