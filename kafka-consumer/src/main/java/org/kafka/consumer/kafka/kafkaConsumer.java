package org.kafka.consumer.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class kafkaConsumer {
	
	private static final Logger LOG = LoggerFactory.getLogger(kafkaConsumer.class);

	
	@KafkaListener(
			topics = "wikimedia_change",
			groupId = "myGroup"
			)
	public void consume(String EventHandler) {
		
		LOG.info(String.format("event receieved by consumer -> %s",EventHandler));
		
	}
	

}
