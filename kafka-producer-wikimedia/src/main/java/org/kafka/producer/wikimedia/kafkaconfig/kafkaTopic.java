package org.kafka.producer.wikimedia.kafkaconfig;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class kafkaTopic {

	@Bean
	public NewTopic topic(){
		
		return TopicBuilder.name("wikimedia_change").build();
		
	}
}
