package org.kafka.producer.wikimedia.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.launchdarkly.eventsource.StreamException;

import jakarta.annotation.PostConstruct;



@Controller
public class controller {

	
	@Autowired
	private wikimediaProducer wikimediaproducer;
	
	
	//The PostConstruct annotation is used on a method that needs to be executed after dependency injection is done to perform any initialization
	//the method will run automatically 
	@PostConstruct
	public void run() throws StreamException, InterruptedException
	{
    	wikimediaproducer.message();

	}
}
